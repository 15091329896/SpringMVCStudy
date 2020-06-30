package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/index")
public class IndexController2 {
	@RequestMapping("/login2")
	public String login() {
		System.out.println(" 测试 @RequestMapping 类级别的注解 ");
		return "login";
	}
	@RequestMapping("/register2")
	public String register() {
		return "register";
	}
}