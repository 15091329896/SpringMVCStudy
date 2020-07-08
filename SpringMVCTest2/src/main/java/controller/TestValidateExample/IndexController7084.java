package controller.TestValidateExample;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.TestValidate.bean.User;
import controller.TestValidateExample.bean.Goods;
import controller.TestValidateExample.service.GoodsService;

/**
 * 
 * @ClassName: IndexController7084
 * @Description: 测试SpringMVC的验证功能
 * @author dyk
 * @date 2020-07-08 15:45:02
 *
 */
@Controller
@RequestMapping("/index7084")
public class IndexController7084 {

	private static final Log logger = LogFactory.getLog(IndexController7084.class);

	@Autowired
	private GoodsService goodsService;

	@Resource
	private Validator validator;

	
	/**
	 * 登录页面初始化
	 */
	@RequestMapping("/toLogin")
	public String initLogin() {
		return "login";
	}
	
	@RequestMapping("/input")
	public String input(Model model) {
		// 如果model中没有goods属性，addGoods.jsp会抛出异常
		// 因为表单标签无法找到modelAttribute属性指定的form backing object
		model.addAttribute("goods", new Goods());
		return "addGoods";
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute Goods goods, BindingResult result, Model model) {
		this.validator.validate(goods, result); // 添加验证
		if (result.hasErrors()) {
			return "addGoods";
		}
		goodsService.save(goods);
		logger.info("添加成功");
		model.addAttribute("goodsList", goodsService.getGoods());
		return "goodsList";
	}

}