package controller.TestReceiveParam;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.UserForm;

@Controller
@RequestMapping("/index630")
public class IndexController630 {
	private static final Log logger = LogFactory.getLog(IndexController630.class);

	@RequestMapping("/login630")
	public String login() {
		return "login"; // 跳转到/WEB-INF/jsp下的login.jsp
	}

	@RequestMapping("/register630")
	public String register() {
		return "register";
	}

	@RequestMapping("/register6302")
	/**
	 * 通过形参接收请求参数，形参名称与请求参数名称完全相同
	 */
	public String register(String uname, String upass, Model model) {
		if ("zhangsan".equals(uname) && "123456".equals(upass)) {
			return "login"; // 注册成功，跳转到 login.jsp
		} else {
			// 在register.jsp页面上可以使用EL表达式取出model的uname值
			model.addAttribute("uname", uname);
			return "register"; // 返回 register.jsp
		}
	}

	@RequestMapping("/register701")
	/**
	 * 通过形参接收请求参数，形参名称与请求参数名称完全相同
	 */
	public String register701(String uname, String upass, Model model) {
		System.out.println(" uname--> " + uname);
		System.out.println(" upass--> " + upass);
		if ("zhangsan".equals(uname) && "123456".equals(upass)) {
			return "login"; // 注册成功，跳转到 login.jsp
		} else {
			// 在register.jsp页面上可以使用EL表达式取出model的uname值
			model.addAttribute("uname", uname);
			return "register"; // 返回 register.jsp
		}
	}

	/**
	 * 通过 HttpServletRequest 接收请求参数
	 */
	@RequestMapping("/register7021")
	public String register7021(HttpServletRequest request, Model model) {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		System.out.println(" 通过 HttpServletRequest 接收请求参数   uname--> " + uname);
		System.out.println("  通过 HttpServletRequest 接收请求参数  upass--> " + upass);
		if ("zhangsan".equals(uname) && "123456".equals(upass)) {
			logger.info("成功");
			return "login"; // 注册成功，跳转到 login.jsp
		} else {
			logger.info("失败");
			// 在register.jsp页面上可以使用EL表达式取出model的uname值
			model.addAttribute("uname", uname);
			return "register"; // 返回 register.jsp
		}
	}

	/**
	 * 通过 @PathVariable 接收 URL 中的请求参数 直接请求URL
	 * http://192.168.0.170:8080/SpringMVCTest2/index630/register7022/LiMing/
	 * 12346
	 */
	@RequestMapping("/register7022/{uname}/{upass}")
	public String register7022(@PathVariable String uname, @PathVariable String upass, Model model) {
		System.out.println(" 通过 @PathVariable 接收 URL 中的请求参数   uname--> " + uname);
		System.out.println("  通过 @PathVariable 接收 URL 中的请求参数  upass--> " + upass);
		if ("zhangsan".equals(uname) && "123456".equals(upass)) {
			logger.info("成功");
			return "login"; // 注册成功，跳转到 login.jsp
		} else {
			// 在register.jsp页面上可以使用EL表达式取出model的uname值
			model.addAttribute("uname", uname);
			return "register"; // 返回 register.jsp
		}
	}

	/**
	 * 通过 @RequestParam 接收请求参数
	 * 
	 * 
	 */
	@RequestMapping("/register7023")
	public String register7023(@RequestParam String uname, @RequestParam String upass, Model model) {
		System.out.println(" 通过 @RequestParam 接收请求参数  uname--> " + uname);
		System.out.println("  通过 @RequestParam 接收请求参数 upass--> " + upass);
		if ("zhangsan".equals(uname) && "123456".equals(upass)) {
			logger.info("成功");
			return "login"; // 注册成功，跳转到 login.jsp
		} else {
			// 在register.jsp页面上可以使用EL表达式取出model的uname值
			model.addAttribute("uname", uname);
			return "register"; // 返回 register.jsp
		}
	}

	
	/**
	 * 通过@ModelAttribute 接收请求参数
	 */
	@RequestMapping("/register7024")
	public String register7024(@ModelAttribute("user") UserForm user) {
		System.out.println(" 通过 @RequestParam 接收请求参数  user.getUname() --> " + user.getUname());
		System.out.println("  通过 @RequestParam 接收请求参数 user.getUpass()) --> " + user.getUpass());
	    if ("nn".equals(user.getUname()) && "nn".equals(user.getUpass())) {
	        logger.info("成功");
	        return "login"; // 注册成功，跳转到 login.jsp
	    } else {
	        logger.info("失败");
	        // 使用@ModelAttribute("user")与model.addAttribute("user",user)的功能相同
	        //register.jsp页面上可以使用EL表达式${user.uname}取出ModelAttribute的uname值
	        return "register"; // 返回 register.jsp
	    }
	}
	
	
	
	
	
}