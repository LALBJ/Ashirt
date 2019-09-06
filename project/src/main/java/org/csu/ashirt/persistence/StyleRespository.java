package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Style;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StyleRespository extends JpaRepository<Style, Integer> {
    public Style findStyleByStyleId(int styleId);

    public List<Style> findStylesByStyleDescribeContains(String keyword);

    public Style findStyleByColorAndName(String color,String name);

    public List<Style> findStylesByName(String name);
}
