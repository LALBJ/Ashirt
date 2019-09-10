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
    @PostMapping("/insertAccount")
    public int insertAccount(@RequestBody Account account) {
        account.setHeadPicture("/images/head_picture/head_picture-01.jpg");
        return accountService.insertAccount(account);
    }

    @RequestMapping(value = "/log")
    @ResponseBody
    public String log(@RequestParam(value = "userId") int userId,
                         @RequestParam(value = "password") String password) {
        Account account = accountService.getAccountByUserId(userId);
        String picture = account.getHeadPicture();
        if (account == null){ return null; }
        else {
            if(account.getPassword().equals(password)){
                request.getSession().setAttribute("account", account);
                return account.getHeadPicture();
            }
            else { return null; }
        }
    }

    // 修改信息
    @PostMapping("/updateAccount")
    public int updateStudent(@RequestBody Account account) {
        Account accountTemp = (Account) request.getSession().getAttribute("account");
        account.setUserId(accountTemp.getUserId());
        if (account.getPassword() == ""){
            account.setPassword(accountTemp.getPassword());
        }
        else if(account.getEmail() == ""){
            account.setEmail(accountTemp.getEmail());
        }
        else if(account.getCity() == ""){
            account.setCity(accountTemp.getCity());
        }
        else if(account.getNickname() == ""){
            account.setNickname(accountTemp.getNickname());
        }
        else if(account.getPhoneNum() == ""){
            account.setPhoneNum(accountTemp.getPhoneNum());
        }
        account.setHeadPicture(accountTemp.getHeadPicture());
        request.getSession().setAttribute("account", account);
        return accountService.updateAccount(account);
    }

    // 退出登录
    @PostMapping("exitAccount")
    public int exitAccount() {
        request.getSession().setAttribute("account", null);
        return 1;
    }

    //获取session
    @GetMapping("/getSession")
    public int getUserId(){
        Account account1 = (Account)request.getSession().getAttribute("account");
        return account1.getUserId();
    }
}
