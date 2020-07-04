package controller.TestTypeCast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods703")
public class Goodsontroller {
    
	@RequestMapping("/addGoods")
    public String add(String goodsname, Double goodsprice, int goodsnumber) {
        double total = goodsprice * goodsnumber;
        System.out.println(total);
        return "success";
    }
}