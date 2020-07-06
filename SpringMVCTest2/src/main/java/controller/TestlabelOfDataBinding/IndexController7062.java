package controller.TestlabelOfDataBinding;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.TestlabelOfDataBinding.bean.Book;
import controller.TestlabelOfDataBinding.bean.Category;
import controller.TestlabelOfDataBinding.service.IBookService;

/**
 * 
 * @ClassName: IndexController7062
 * @Description: 测试表单标签库的数据绑定
 * @author dyk
 * @date Jul 3, 2020 1:52:12 PM
 *
 */
@Controller
@RequestMapping("/index7062")
public class IndexController7062 {
	private static final Log logger = LogFactory.getLog(IndexController7062.class);

//	@RequestMapping("/user_input")
//	public String inputUser(Model model) {
//		model.addAttribute("user", new User());
//		return "InputUser";
//	}

	@Autowired(required = true)
	private IBookService iBookService;

	// 添加书
	@RequestMapping(value = "/book_input")
	public String inputBook(Model model) {
		List<Category> categories = iBookService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("book", new Book());
		return "BookAddForm";
	}

	// 修改书
	@RequestMapping(value = "/book_edit/{id}")
	public String editBook(Model model, @PathVariable long id) {
		List<Category> categories = iBookService.getAllCategories();
		model.addAttribute("categories", categories);
		Book book = iBookService.get(id);
		model.addAttribute("book", book);
		return "BookEditForm";
	}

	// 保存书
	@RequestMapping(value = "/book_save")
	public String saveBook(@ModelAttribute Book book) {
		Category category = iBookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		iBookService.save(book);
		return "redirect:/index7062/book_list";
	}

	// 更新书
	@RequestMapping(value = "/book_update")
	public String updateBook(@ModelAttribute Book book) {
		Category category = iBookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		iBookService.update(book);
		return "redirect:/index7062/book_list";
	}

	// 列出所有书
	@RequestMapping(value = "/book_list")
	public String listBooks(Model model) {
		List<Book> books = iBookService.getAllBooks();
		model.addAttribute("books", books);
		return "BookList";
	}

}