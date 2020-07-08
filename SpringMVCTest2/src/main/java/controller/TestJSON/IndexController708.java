package controller.TestJSON;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.TestJSON.bean.ItemsCustom;
import controller.TestJSON.bean.Person;

/**
 * 
 * @ClassName: IndexController708
 * @Description: 测试JSON交互（请求响应全是JSON）
 * @author dyk
 * @date 2020-07-07 16:56:47
 */
@Controller
@RequestMapping("/index708")
public class IndexController708 {

	private static final Log logger = LogFactory.getLog(IndexController708.class);

	private ItemsCustom itemsCustom;

	@Autowired
	public void setStudent(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	@RequestMapping("/json")
	public String testLabel(Model model) {
		return "TestJson2"; // 转发到 testJson2.jsp
	}

	// 请求json（商品信息），输出json（商品信息）
	/*
	 * @RequestBody将请求的商品信息的json串转换成java对象
	 * @ResponseBody将java对象转换成json输出
	 */
	@RequestMapping(value = "/requestJson", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom) {
		System.out.println(itemsCustom.toString());
		return itemsCustom;
	}

	@RequestMapping(value = "/responseJson", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ItemsCustom responseJson(ItemsCustom itemsCustom) {
		return itemsCustom;
	}

	
    @RequestMapping("/testJson")
    @ResponseBody
    public Person testJson(@RequestBody Person user) {
        // 打印接收的JSON格式数据
        System.out.println("pname=" + user.getPname() + ",password="
                + user.getPassword() + ",page" + user.getPage());
        // 返回JSON格式的响应
        return user;
    }
	
}