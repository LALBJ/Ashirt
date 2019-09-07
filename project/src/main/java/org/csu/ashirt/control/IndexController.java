package org.csu.ashirt.control;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {

    @Autowired
    private HttpServletRequest request;

    @Resource
    private AccountService accountService;

    @GetMapping("/")
    public String viewIndex(){ return "index";}

    // TODO use cookie and finish AccountController session
//    @GetMapping("index")
//    public int index(HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null){
//            for (Cookie cookie : cookies){
//                if (cookie.getName().equals("id")){
//                    Account account = accountService.getAccountByUserId(Integer.parseInt(cookie.getValue()));
//                    request.getSession().setAttribute("account", account);
//                    return 1;
//                }
//            }
//        }
//        return 0;
//    }
}
