package org.csu.ashirt;

import org.csu.ashirt.persistence.AccountRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AshirtApplicationTests {

    @Autowired
    AccountRespository accountRespository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        System.out.println(accountRespository.findAccountByUserId(1).toString());
    }


}
