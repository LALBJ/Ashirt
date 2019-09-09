package org.csu.ashirt.service;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    // Category
    public Map<String, Object> getCategoryList(int offset, int limit);

    public Category getCategory(int categoryId);

    public Map<String, Object> searchCategoryList(int offset, int limit, String keyword);

    //Item
    public Map<String, Object> getItemByCategory(int offset, int limit, int categoryId);

    public Item getItem(int itemId);

    //Style
    public Style getStyle(int styleId);

    public Map<String, Object> searchStyleList(int offset, int limit, String keyword);

    public Style getStyleByColorAndName(String color,String name);

    public Map<String, Object> getStylesByName(int offset, int limit, String name);

    @Transactional
    public int insertStyle(Style style);


}
