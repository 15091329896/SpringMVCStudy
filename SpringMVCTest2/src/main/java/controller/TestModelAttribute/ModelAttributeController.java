package controller.TestModelAttribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin703")
public class ModelAttributeController extends BaseController {

	@RequestMapping("/add")
	public String add() {
		System.out.println(" ModelAttributeController-->add  被调用  ");
		return "addSuccess";
	}

	@RequestMapping("/update")
	public String update() {
		System.out.println(" ModelAttributeController-->update  被调用  ");
		return "updateSuccess";
	}

	@RequestMapping("/delete")
	public String delete() {
		System.out.println(" ModelAttributeController-->delete  被调用  ");
		return "deleteSuccess";
	}
}