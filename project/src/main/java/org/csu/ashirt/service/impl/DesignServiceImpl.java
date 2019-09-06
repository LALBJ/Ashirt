package org.csu.ashirt.service.impl;

import org.csu.ashirt.domain.Design;
import org.csu.ashirt.persistence.DesignRespository;
import org.csu.ashirt.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignServiceImpl implements DesignService {
    @Autowired
    private DesignRespository designRespository;

    @Override
    public List<Design> getDesignByUserId(int userId) {
        return designRespository.findDesignsByUserId(userId);
    }

    @Override
    public  List<Design> getDesignByStyleId(int styleId) {
        return designRespository.findDesignsByStyleId(styleId);
    }

    @Override
    public List<Design> getDesignByProductId(int productId) {
        return designRespository.findDesignsByProductId(productId);
    }

    //TODO try catch && database design table
    @Override
    public int insertDesign(Design design) {
        try {
            designRespository.save(design);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateDesign(Design design) {
        try {
            designRespository.save(design);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int deleteDesign(int productId) {
        try {
            designRespository.deleteDesignByProductId(productId);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
