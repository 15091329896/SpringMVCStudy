package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index4")
public class IndexController4 {
	
	
	@RequestMapping("/register")
	public String register(Model model) {
		/* 在视图中可以使用EL表达式${success}取出model中的值 */
		model.addAttribute("success", "注册成功");
		
		return "register";
	}
}