package org.csu.ashirt;

import org.csu.ashirt.domain.Design;
import org.csu.ashirt.service.DesignService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDesignService {
    @Autowired
    private DesignService designService;

    @Test
    public void test_update(){
        List<Design> design_list = designService.getDesignByUserId(1234567890);
        Design design = design_list.get(1);
    }
}
