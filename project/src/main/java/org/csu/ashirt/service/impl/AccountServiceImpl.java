package org.csu.ashirt.service.impl;

import org.csu.ashirt.domain.Account;
import org.csu.ashirt.persistence.AccountRespository;
import org.csu.ashirt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRespository accountRespository;

    @Override
    public Account getAccountByUserId(int userId) {
        return accountRespository.findAccountByUserId(userId);
    }

    @Override
    public Account getAccount(int userId, String password) {
        return accountRespository.findAccountByUserIdAndPassword(userId,password);
    }

    @Override
    public int insertAccount(Account account) {
        try{
            accountRespository.save(account);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // TODO
    @Override
    public int updateAccount(Account account) {
        try{
            accountRespository.save(account);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public int deleteAccount(int userId){
        try {
            accountRespository.delete(accountRespository.findAccountByUserId(userId));
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }
}
