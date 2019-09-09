package org.csu.ashirt.service.impl;

import org.csu.ashirt.Utils.ShowUtils;
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
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRespository categoryRespository;
    @Autowired
    private ItemRespository itemRespository;
    @Autowired
    private StyleRespository styleRespository;

    @Override
    public Map<String, Object> getCategoryList(int offset, int limit) {
        List<Category> categoryList =  categoryRespository.findAll();
        return ShowUtils.CategoryPageShow(offset,limit,categoryList);
    }

    @Override
    public Category getCategory(int categoryId) {
        return categoryRespository.findCategoryByCategoryId(categoryId);
    }

    @Override
    public Map<String, Object> searchCategoryList(int offset, int limit, String keyword) {
        List<Category> categoryList = categoryRespository.findCategoriesByNameContains(keyword);
        return ShowUtils.CategoryPageShow(offset,limit,categoryList);
    }

    @Override
    public Map<String, Object> getItemByCategory(int offset, int limit, int categoryId) {
        List<Item> itemList = itemRespository.findItemsByCategoryId(categoryId);
        return ShowUtils.ItemPageShow(offset, limit, itemList);
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
    public Map<String, Object> searchStyleList(int offset, int limit, String keyword) {
        List<Style> styleList = styleRespository.findStylesByStyleDescribeContains(keyword);
        return ShowUtils.StylePageShow(offset, limit, styleList);
    }

    @Override
    public Style getStyleByColorAndName(String color,String name){
        return styleRespository.findStyleByColorAndName(color,name);
    }

    @Override
    public Map<String, Object> getStylesByName(int offset, int limit, String name){
        List<Style> styleList = styleRespository.findStylesByName(name);
        return ShowUtils.StylePageShow(offset, limit, styleList);
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
