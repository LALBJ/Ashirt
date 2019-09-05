package org.csu.ashirt.service.impl;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.csu.ashirt.service.CatalogService;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {
    @Override
    public List<Category> getCategoryList() {
        return null;
    }

    @Override
    public Category getCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Category> SearchCategoryList(String keyword) {
        return null;
    }

    @Override
    public List<Item> getItemByCategory(int categoryId) {
        return null;
    }

    @Override
    public Item getItem(int itemId) {
        return null;
    }

    @Override
    public Style getStyle(int styleId) {
        return null;
    }

    @Override
    public Style searchStyleList(String keyword) {
        return null;
    }

    @Override
    public void insertStyle(Style style) {

    }
}
