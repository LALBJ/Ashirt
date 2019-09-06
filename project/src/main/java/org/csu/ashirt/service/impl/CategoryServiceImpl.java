package org.csu.ashirt.service.impl;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.csu.ashirt.persistence.CategoryRespository;
import org.csu.ashirt.persistence.ItemRespository;
import org.csu.ashirt.persistence.StyleRespository;
import org.csu.ashirt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRespository categoryRespository;
    @Autowired
    private ItemRespository itemRespository;
    @Autowired
    private StyleRespository styleRespository;

    @Override
    public List<Category> getCategoryList() {
        return categoryRespository.findAll();
    }

    @Override
    public Category getCategory(int categoryId) {
        return categoryRespository.findCategoryByCategoryId(categoryId);
    }

    @Override
    public List<Category> SearchCategoryList(String keyword) {
        return categoryRespository.findCategoriesByNameContains(keyword);
    }

    @Override
    public List<Item> getItemByCategory(int categoryId) {
        return itemRespository.findItemsByCategoryId(categoryId);
    }

    @Override
    public Item getItem(int itemId) {
        return itemRespository.findItemByItemId(itemId);
    }

    @Override
    public Style getStyle(int styleId) {
        return styleRespository.findStyleByStyleId(styleId);
    }

    @Override
    public List<Style> searchStyleList(String keyword) {
        return styleRespository.findStylesByStyleDescribeContains(keyword);
    }

    @Override
    public Style getStyleByColorAndName(String color,String name){
        return styleRespository.findStyleByColorAndName(color,name);
    }

    @Override
    public List<Style> getStylesByName(String name){
        return styleRespository.findStylesByName(name);
    }

    @Override
    public int insertStyle(Style style) {
        try {
            styleRespository.save(style);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
