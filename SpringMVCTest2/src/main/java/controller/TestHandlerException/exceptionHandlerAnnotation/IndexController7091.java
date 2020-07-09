package controller.TestHandlerException.exceptionHandlerAnnotation;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.TestHandlerException.MyException;
import controller.TestHandlerException.service.TestExceptionService;

/**
 * 
* @ClassName: IndexController7091 
* @Description: 测试@ExceptionHandler
 * 					两步： 1 定义异常处理类，其中使用@ExceptionHandler在异常处理的函数上方即可
 * 						 2 在需要使用异常处理的controller中继承这个类即可
* @author dyk 
* @date 2020-07-09 10:46:41
*
 */
@Controller
@RequestMapping("/index7091")
public class IndexController7091 extends BaseExceptionHandlerController{

	private static final Log logger = LogFactory.getLog(IndexController7091.class);

	@Autowired
	private TestExceptionService testExceptionService;

	@RequestMapping("/db")
	public void db() throws Exception {
		throw new SQLException("控制器中数据库异常");
	}

	@RequestMapping("/my")
	public void my() throws Exception {
		throw new MyException("控制器中自定义异常");
	}

	@RequestMapping("/no")
	public void no() throws Exception {
		throw new Exception("控制器中未知异常");
	}

	@RequestMapping("/servicedb")
	public void servicedb() throws Exception {
		testExceptionService.servicedb();
	}

	@RequestMapping("/servicemy")
	public void servicemy() throws Exception {
		testExceptionService.servicemy();
	}

	@RequestMapping("/serviceno")
	public void serviceno() throws Exception {
		testExceptionService.serviceno();
	}

	@RequestMapping("/daodb")
	public void daodb() throws Exception {
		testExceptionService.daodb();
	}

	@RequestMapping("/daomy")
	public void daomy() throws Exception {
		testExceptionService.daomy();
	}

	@RequestMapping("/daono")
	public void daono() throws Exception {
		testExceptionService.daono();
	}

}