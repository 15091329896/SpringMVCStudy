package controller.TestForwarding;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 转发和重定向
 * @author fengll
 *
 */
@Controller
@RequestMapping("/index702")
public class IndexController702 {
	private static final Log logger = LogFactory.getLog(IndexController702.class);

    @RequestMapping("/register7021")
    public String register() {
    	System.out.println("");
        return "register";  //转发到register.jsp
    }
    
    
    @RequestMapping("/login")
    public String login() {
        //转发到一个请求方法（同一个控制器类可以省略/index/）
        return "forward:/index/isLogin";
    }
    @RequestMapping("/isLogin")
    public String isLogin() {
        //重定向到一个请求方法
        return "redirect:/index/isRegister";
    }
    @RequestMapping("/isRegister")
    public String isRegister() {
        //转发到一个视图
        return "register";
    }
	
	
	
	
	
}