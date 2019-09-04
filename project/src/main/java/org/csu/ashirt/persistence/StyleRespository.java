package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Style;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StyleRespository extends JpaRepository<Style, Integer> {
    public List<Style> findStylesByStyleId(int styleId);
}
