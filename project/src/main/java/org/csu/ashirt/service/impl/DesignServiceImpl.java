package org.csu.ashirt.service.impl;

import org.csu.ashirt.Utils.ShowUtils;
import org.csu.ashirt.domain.Design;
import org.csu.ashirt.persistence.DesignRespository;
import org.csu.ashirt.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DesignServiceImpl implements DesignService {
    @Autowired
    private DesignRespository designRespository;

    @Override
    public List<Design> getAllDesign() {
        return designRespository.findAll();
    }

    @Override
    public Map<String, Object> getDesignList(int offset, int limit) {
        List<Design> designList = designRespository.findAll();
        return ShowUtils.DesignPageShow(offset, limit, designList);
    }

    @Override
    public Map<String, Object> getDesignByUserId(int offset, int limit, int userId) {
        List<Design> designList = designRespository.findDesignsByUserId(userId);
        return ShowUtils.DesignPageShow(offset, limit, designList);
    }

    @Override
    public Map<String, Object> getDesignByStyleId(int offset, int limit, int styleId) {
        List<Design> designList = designRespository.findDesignsByStyleId(styleId);
        return ShowUtils.DesignPageShow(offset, limit, designList);
    }

    @Override
    public Map<String, Object> getDesignByProductId(int offset, int limit, int productId) {
        List<Design> designList = designRespository.findDesignsByProductId(productId);
        return ShowUtils.DesignPageShow(offset, limit, designList);
    }

    @Override
    public List<Design> getDesignsByUserIdAndPublish(int userId) {
        List<Design> designsList = designRespository.findDesignsByUserIdAndPublish(userId,'1');
        return designsList;
    }

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
