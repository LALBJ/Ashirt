package org.csu.ashirt.service;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CategoryService {
    // Category
    public List<Category> getCategoryList();

    public Category getCategory(int categoryId);

    public List<Category> SearchCategoryList(String keyword);

    //Item
    public List<Item> getItemByCategory(int categoryId);

    public Item getItem(int itemId);

    //Style
    public Style getStyle(int styleId);

    public List<Style> searchStyleList(String keyword);

    public Style getStyleByColorAndName(String color,String name);

    public List<Style> getStylesByName(String name);

    @Transactional
    public int insertStyle(Style style);


}
