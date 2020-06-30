package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index3")
public class IndexController3 {
	private static final Log log = LogFactory.getLog(IndexController3.class);
	
	@RequestMapping("/login")
	public String login(HttpSession session, HttpServletRequest request) {
		session.setAttribute("skey", "session范围的值");
		session.setAttribute("rkey", "request范围的值");
		log.info("  sesson  = " + session.toString());
		
		return "login";
	}
}