package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRespository extends JpaRepository<Category, Integer> {
    public Category findCategoryByCategoryId(int categoryId);
    public List<Category> findCategoriesByNameContains(String keyword);
}
