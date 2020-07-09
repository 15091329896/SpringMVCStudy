package controller.TestFileupload;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import controller.TestFileupload.bean.FileDomain;

/**
 * 
 * @ClassName: IndexController7092
 * @Description: Spring MVC文件上传
 * @author dyk
 * @date 2020-07-09 10:59:00
 *
 */
@Controller
@RequestMapping("/index7092")
public class IndexController7092 {

	private static final Log logger = LogFactory.getLog(IndexController7092.class);

	/**
	 * 单文件上传
	 */
	@RequestMapping("/onefile")
	public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request) {
		/*
		 *  realpath = D:\app\tomcat\eclipse2020-webapp\webapp\SpringMVCTest2\\uploadfiles
		 *
		 */
		String realpath = request.getSession().getServletContext().getRealPath("uploadfiles");
		String fileName = fileDomain.getMyfile().getOriginalFilename();
		System.out.println("realpath = " + realpath);
		System.out.println("fileName = " + fileName);
		File targetFile = new File(realpath, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// 上传
		try {
			fileDomain.getMyfile().transferTo(targetFile);
			logger.info("*****文件上传成功********");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showOne";
	}

	
}