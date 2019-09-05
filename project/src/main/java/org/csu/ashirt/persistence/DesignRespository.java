package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Design;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DesignRespository extends JpaRepository<Design, Integer> {
    public List<Design> findDesignsByUserId(int userId);
}
