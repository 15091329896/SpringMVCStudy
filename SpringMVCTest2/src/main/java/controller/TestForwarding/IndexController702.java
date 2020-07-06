package controller.TestForwarding;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
* @ClassName: IndexController702 
* @Description: 测试转发和重定向 
* @author dyk 
* @date Jul 3, 2020 1:52:12 PM 
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
    
    
    @RequestMapping("/login7022")
    public String login() {
    	System.out.println("login7022  实施重定向 ");
        return "forward:/index702/isLogin7023";
    }
    @RequestMapping("/isLogin7023")
    public String isLogin() {
    	System.out.println("重定向的方法  isLogin7023 被调用");
    	System.out.println("login7023  实施转发 ");
        return "redirect:/index702/isRegister7024";
    }
    @RequestMapping("/isRegister7024")
    public String isRegister() {
    	System.out.println("isLogin7023 转发成功 ");
        //转发到一个视图
        return "register";
    }
	
	
	
	
	
}