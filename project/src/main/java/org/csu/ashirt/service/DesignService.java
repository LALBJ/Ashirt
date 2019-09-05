package org.csu.ashirt.service;

import org.csu.ashirt.domain.Design;
import org.springframework.transaction.annotation.Transactional;

public interface DesignService {
    public Design getDesignByUserId(int userId);

    public Design getDesignByStyleId(int styleId);

    @Transactional
    public void insertDesign(Design design);

    @Transactional
    public void updateDesign(Design design);

}
