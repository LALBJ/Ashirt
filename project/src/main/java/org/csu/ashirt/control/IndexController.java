package org.csu.ashirt.control;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.persistence.AccountRespository;
import org.csu.ashirt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class IndexController {
    @GetMapping("/")
    public String viewIndex(){ return "index";}

    @Autowired
    private AccountRespository accountRespository;
    @Resource
    private AccountService accountService;

    @GetMapping("/all")
    public List<Account> studentList(){
        return accountRespository.findAll();
    }


}
