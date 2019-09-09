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

@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    // 注册
    @PostMapping("insertAccount")
    public int insertAccount(@RequestBody Account account) {
        return accountService.insertAccount(account);
    }

    // 登录
    @PostMapping("login")
    public String login(@RequestBody Map<String, String> map, HttpServletResponse response) {
        Account account = accountService.getAccountByUserId(Integer.parseInt(map.get("userId")));
        if (account == null){
            return "0";
        }
        else {
            if (account.getPassword().equals(map.get("password"))) {
                Cookie cookie=new Cookie("userId", map.get("userId"));
                cookie.setMaxAge(600);
                response.addCookie(cookie);
                return "1";
            } else {
                return "-1";
            }
        }
    }

    // 修改信息
    @PostMapping("updateAccount")
    public int updateStudent(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    // 删除信息
    @PostMapping("deleteAccount")
    public int deleteStudent(@RequestParam(value="userId") int userId) {
        return accountService.deleteAccount(userId);
    }
}
