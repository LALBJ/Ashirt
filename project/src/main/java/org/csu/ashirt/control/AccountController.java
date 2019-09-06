package org.csu.ashirt.control;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    // 注册
    @PostMapping("insertAccount")
    public int insertStudent(@RequestBody Account account) {
        return accountService.insertAccount(account);
    }

    // 登录
    @PostMapping("login")
    public Account login(@RequestParam(value = "userId") int userId,
                         @RequestParam(value = "password") String password) {
        return accountService.getAccount(userId, password);
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
