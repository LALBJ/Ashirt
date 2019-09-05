package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRespository extends JpaRepository<Account, Integer> {
    public List<Account> findAccountsByUserId(int userId);
}
