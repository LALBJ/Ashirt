package org.csu.ashirt;

import org.csu.ashirt.persistence.AccountRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.Cookie;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AshirtApplicationTests {

    @Autowired
    AccountRespository accountRespository;

    @Test
    public void testCookie() {
    }

    @Test
    public void test(){
        System.out.println(accountRespository.findAccountByUserId(1).toString());
    }


}
