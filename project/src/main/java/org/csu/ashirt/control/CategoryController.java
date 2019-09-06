package org.csu.ashirt.control;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.csu.ashirt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.awt.*;
import java.util.List;

@RestController
public class CategoryController {
    @Resource
    CategoryService categoryService;

    //获得所有列表
    @RequestMapping(value = "getAllCategory")
    public List<Category> getAllCategory(){
        return categoryService.getCategoryList();
    }

    //根据列表ID获得所有图案
    @RequestMapping(value = "getAllItemsByCategoryId")
    public List<Item> getAllItemsByCategoryId(@RequestParam(value = "categoryId") int categoryId){
        return categoryService.getItemByCategory(categoryId);
    }

    //根据关键字找到列表
    @RequestMapping(value = "getCategoriesByKeyword")
    public List<Category> getCategoriesByKeyword(@RequestParam(value = "categoryKeyword") String categoryKeyword){
        return categoryService.SearchCategoryList(categoryKeyword);
    }

    //根据关键字找到款式
    @RequestMapping(value = "getStylesByKeyword")
    public List<Style> getStylesByKeyword(@RequestParam(value = "StylesKeyword") String StylesKeyword){
        return categoryService.searchStyleList(StylesKeyword);
    }

    //根据颜色和款式找到对应的衣服
    @RequestMapping(value = "getStyleByColorAndName")
    public Style getStyleByColorAndName(@RequestParam(value = "color") String color,@RequestParam(value = "name") String name){
        return categoryService.getStyleByColorAndName(color,name);
    }

    //根据款式ID找到对应颜色的衣服
    @RequestMapping(value = "getSameStylesByCategoryId")
    public List<Style> getSameStylesByCategoryId(@RequestParam(value = "categoryId") int categoryId){
        return categoryService.getStylesByName(categoryService.getCategory(categoryId).getName());
    }

    //根据图案ID找到图案
    @RequestMapping(value = "getItemByItemId")
    public Item getItemByItemId(@RequestParam(value = "itemId") int itemId){
        return categoryService.getItem(itemId);
    }

    //根据列表ID找到列表
    @RequestMapping(value = "getCategoryByCategoryId")
    public Category getCategoryByCategoryId(@RequestParam(value = "categoryId") int categoryId){
        return categoryService.getCategory(categoryId);
    }

    //根据款式ID找到款式
    @RequestMapping(value = "getStyleByStyleId")
    public Style getStyleByStyleId(@RequestParam(value = "styleId") int styleId){
        return categoryService.getStyle(styleId);
    }
}
