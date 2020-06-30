package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* “@Controller”表示 IndexController 的实例是一个控制器
*
* @Controller相当于@Controller(@Controller) 或@Controller(value="@Controller")
*/
@Controller
public class IndexController {
    @RequestMapping(value = "/index/login")
    public String login() {
        /**
         * login代表逻辑视图名称，需要根据Spring MVC配置
         * 文件中internalResourceViewResolver的前缀和后缀找到对应的物理视图
         */
    	System.out.println(" public class IndexController ---->public String login() 被调用 ");
        return "login";
    }
    @RequestMapping(value = "/index/register")
    public String register() {
    	System.out.println(" public class IndexController ---->public String register() 被调用 ");
        return "register";
    }
}