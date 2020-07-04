package controller.TestFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.GoodsModel;

@Controller
@RequestMapping("/user704")
public class UserController704 {
    @RequestMapping("/input")
    public String input(){
        return "input";
    }
    
    
    @RequestMapping("/showGoods")
    public String showgoods(@ModelAttribute("goods") GoodsModel gm, Model model){
        model.addAttribute("goods",gm);
        String string = gm.toString();
        return "showGoods";
    }
}