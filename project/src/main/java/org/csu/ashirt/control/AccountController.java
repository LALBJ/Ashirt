package org.csu.ashirt.control;

import com.sun.org.apache.regexp.internal.RE;
import org.csu.ashirt.domain.Account;
import org.csu.ashirt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

@RestController
@ResponseBody
public class AccountController {
    //TODO ready to complete try-catch model except accountService
    @Resource
    private AccountService accountService;

    @Autowired
    private HttpServletRequest request;

    // 注册
    @PostMapping("insertAccount")
    public int insertAccount(@RequestBody Account account) {
        return accountService.insertAccount(account);
    }

    @PostMapping("register")
    public int register(@RequestBody Account account) {
        return accountService.insertAccount(account);
    }

    // 登录
    @PostMapping("login")
    public String login(@RequestBody Map<String, String> map, HttpServletResponse response) {
        Account account = accountService.getAccountByUserId(Integer.parseInt(map.get("userId")));
        if (account == null) {
            return "0";
        } else {
            if (account.getPassword().equals(map.get("password"))) {
                Cookie cookie = new Cookie("userId", map.get("userId"));
                cookie.setMaxAge(600);
                response.addCookie(cookie);
                return "1";
            } else {
                return "-1";
            }
        }
    }
    @RequestMapping(value = "log",method = RequestMethod.POST)
    public int log(@RequestParam(value = "userId") int userId,
                         @RequestParam(value = "password") String password) {
        Account account = accountService.getAccountByUserId(userId);
        if (account == null){ return 0; }
        else {
            if(account.getPassword().equals(password)){
                request.getSession().setAttribute("account", account);
                return 1;
            }else { return 0; }
        }
    }

    // 修改信息
    @PostMapping("updateAccount")
    public int updateStudent(@RequestBody Account account) {
        request.getSession().setAttribute("account", account);
        return accountService.updateAccount(account);
    }

    // 退出登录
    @PostMapping("exitAccount")
    public int exitAccount() {
        request.getSession().setAttribute("account", null);
        return 1;
    }
}
