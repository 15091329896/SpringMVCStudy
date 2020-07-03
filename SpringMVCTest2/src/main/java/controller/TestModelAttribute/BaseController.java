package controller.TestModelAttribute;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class BaseController {
    @ModelAttribute
    public void isLogin(HttpSession session) throws Exception {
    	
    	System.out.println(session.toString());
    	System.out.println(" BaseController --> isLogin 被调用  ");
        if (session.getAttribute("user") == null) {
            System.out.println(" 没有权限 ");
        }
    }
}

