package controller.TestAutowiredService;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.UserForm;
import service.UserService;

/**
 * 
* @ClassName: UserController7032 
* @Description: 测试Autowired和Service注解
* @author dyk 
* @date Jul 3, 2020 1:58:51 PM 
*
 */

@Controller
@RequestMapping("/user703")
public class UserController703 {
    private static final Log logger = LogFactory.getLog(UserController703.class);
    
    // 将服务依赖注入到属性userService
    @Autowired
    public UserService userService;
    
    
    /**
     * 
    * @Title: login 
    * @Description: 登录
    * @param user
    * @param session
    * @param model
    * @return String
    * @throws
    * @author: dyk
    * @date Jul 3, 2020 1:58:28 PM
     */
    @RequestMapping("/login")
    public String login(@ModelAttribute UserForm user) {
        if (userService.login(user)) {
            logger.info("成功");
            return "main"; // 登录成功，跳转到 main.jsp
        } else {
            logger.info("失败");
            return "login";
        }
    }
    
    /**
     * 处理注册
     */
    @RequestMapping("/register")
    public String register(@ModelAttribute("user") UserForm user) {
        if (userService.register(user)) {
            logger.info("成功");
            return "login"; // 注册成功，跳转到 login.jsp
        } else {
            logger.info("失败");
            // 使用@ModelAttribute("user")与model.addAttribute("user",user)的功能相同
            // 在register.jsp页面上可以使用EL表达式${user.uname}取出ModelAttribute的uname值
            return "register"; // 返回register.jsp
        }
    }
}