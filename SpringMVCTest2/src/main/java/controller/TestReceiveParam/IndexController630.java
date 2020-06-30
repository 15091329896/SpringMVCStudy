package controller.TestReceiveParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index630")
public class IndexController630 {
	@RequestMapping("/login")
	public String login() {
		return "login"; // 跳转到/WEB-INF/jsp下的login.jsp
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}
}