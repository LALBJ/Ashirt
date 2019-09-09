package org.csu.ashirt.control;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class AccountController {
    //TODO ready to complete try-catch model except accountService
    @Resource
    private AccountService accountService;

    @Autowired
    private HttpServletRequest request;

    // 注册
    @PostMapping("register")
    public int register(@RequestBody Account account) {
        return accountService.insertAccount(account);
    }

    // 登录
    @PostMapping("login")
    public int login(@RequestParam(value = "userId") int userId,
                         @RequestParam(value = "password") String password) {
        Account account = accountService.getAccountByUserId(userId);
        if (account == null){ return 0; }
        else {
            if(account.getPassword().equals(password)){
                request.getSession().setAttribute("account", account);
                return 1;
            }else { return -1; }
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
