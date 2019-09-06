package org.csu.ashirt.service;

import org.csu.ashirt.domain.Design;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DesignService {
    public List<Design> getDesignByUserId(int userId);

    public List<Design> getDesignByStyleId(int styleId);

    public List<Design> getDesignByProductId(int productId);

    @Transactional
    public int insertDesign(Design design);

    @Transactional
    public int updateDesign(Design design);

    @Transactional
    public int deleteDesign(int productId);
}
