package org.csu.ashirt.service;

import org.csu.ashirt.domain.Design;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface DesignService {
    public List<Design> getAllDesign();

    public Map<String, Object> getDesignList(int offset, int limit);

    public Map<String, Object> getDesignByUserId(int offset, int limit, int userId);

    public Map<String, Object> getDesignByStyleId(int offset, int limit, int styleId);

    public Map<String, Object> getDesignByProductId(int offset, int limit, int productId);

    @Transactional
    public int insertDesign(Design design);

    @Transactional
    public int updateDesign(Design design);

    @Transactional
    public int deleteDesign(int productId);
}
