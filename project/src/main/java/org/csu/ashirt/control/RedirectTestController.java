package org.csu.ashirt.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectTestController {
    @GetMapping("/index")
    public String viewIndex(){
        return "index";
    }
    @GetMapping("/design")
    public String viewDesign(){
        return "design";
    }
    @GetMapping("/userInfo")
    public String viewUserInfo(){
        return "user-info";
    }
    @GetMapping("/checkout")
    public String viewCheckout(){
        return "checkout";
    }
    @GetMapping("/information")
    public String viewInformation(){
        return "information";
    }
    @GetMapping("/check")
    public String viewCheck(){
        return "check";
    }
}
