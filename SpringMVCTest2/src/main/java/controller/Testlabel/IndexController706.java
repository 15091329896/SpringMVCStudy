package controller.Testlabel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.Testlabel.bean.User;

/**
 * 
 * @ClassName: IndexController706
 * @Description: 测试转发和重定向
 * @author dyk
 * @date Jul 3, 2020 1:52:12 PM
 *
 */
@Controller
@RequestMapping("/index706")
public class IndexController706 {
	private static final Log logger = LogFactory.getLog(IndexController706.class);

	@RequestMapping("/testLabel7061")
	public String testLabel(Model model) {
		model.addAttribute("user", new User());// 这里给视图层提供了数据的对象，用来数据绑定
		return "testLabel"; // 转发到register.jsp
	}

	@RequestMapping(value = "/action") // 这里action的地址
	public String InputName(User user) {
		System.out.println(user.toString());
		return "testLabel";// 返回的是视图的文件名
	}

	//
	// @RequestMapping("/login7022")
	// public String login() {
	// System.out.println("login7022 实施重定向 ");
	// return "forward:/index702/isLogin7023";
	// }
	// @RequestMapping("/isLogin7023")
	// public String isLogin() {
	// System.out.println("重定向的方法 isLogin7023 被调用");
	// System.out.println("login7023 实施转发 ");
	// return "redirect:/index702/isRegister7024";
	// }
	// @RequestMapping("/isRegister7024")
	// public String isRegister() {
	// System.out.println("isLogin7023 转发成功 ");
	// //转发到一个视图
	// return "register";
	// }

}