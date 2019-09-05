package org.csu.ashirt.service;

import org.csu.ashirt.domain.Account;
import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    public Account getAccount(int userId);

    public Account getAccount(int userId, String password);

    //执行persistence的多个事务，要么同时成功，要么同时失败
    @Transactional
    public void insertAccount(Account account);

    @Transactional
    public void updateAccount(Account account) ;


}
