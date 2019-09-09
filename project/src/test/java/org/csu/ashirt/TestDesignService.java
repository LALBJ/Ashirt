package org.csu.ashirt;


import org.csu.ashirt.service.DesignService;
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

//    @Test
//    public void test_update(){
//        List<Design> design_list = designService.getDesignList();
//        Design design = design_list.get(0);
//        int price = design.getPrice();
//        System.out.println("price before update : " + price);
//        design.setPrice(price + 1);
//        int success = designService.updateDesign(design);
//        System.out.println("success or not : "+success);
//
//        List<Design> design_list1 = designService.getDesignList();
//        Design design1 = design_list1.get(0);
//        int price1 = design1.getPrice();
//        System.out.println("price after update : "+price1);
//    }
}
