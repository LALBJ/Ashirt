package org.csu.ashirt.control;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.csu.ashirt.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CategoryController {
    @Resource
    CategoryService categoryService;

    // 获得所有列表
    @GetMapping("getAllCategory")
    public List<Category> getAllCategory(){
        return categoryService.getCategoryList();
    }

    // 根据列表ID获得所有图案
    @PostMapping("getAllItemsByCategoryId")
    public List<Item> getAllItemsByCategoryId(@RequestParam(value = "categoryId") int categoryId){
        return categoryService.getItemByCategory(categoryId);
    }

    // 根据关键字找到列表
    @PostMapping("getCategoriesByKeyword")
    public List<Category> getCategoriesByKeyword(@RequestParam(value = "categoryKeyword") String categoryKeyword){
        return categoryService.searchCategoryList(categoryKeyword);
    }

    // 根据关键字找到款式
    @PostMapping("getStylesByKeyword")
    public List<Style> getStylesByKeyword(@RequestParam(value = "stylesKeyword") String stylesKeyword){
        return categoryService.searchStyleList(stylesKeyword);
    }

    // 根据颜色和款式找到对应的衣服
    @PostMapping("getStyleByColorAndName")
    public Style getStyleByColorAndName(@RequestParam(value = "color") String color,@RequestParam(value = "name") String name){
        return categoryService.getStyleByColorAndName(color,name);
    }

    // 根据款式ID找到对应颜色的衣服
    @PostMapping("getSameStylesByCategoryId")
    public List<Style> getSameStylesByCategoryId(@RequestParam(value = "categoryId") int categoryId){
        return categoryService.getStylesByName(categoryService.getCategory(categoryId).getName());
    }

    // 根据图案ID找到图案
    @PostMapping("getItemByItemId")
    public Item getItemByItemId(@RequestParam(value = "itemId") int itemId){
        return categoryService.getItem(itemId);
    }

    // 根据列表ID找到列表
    @PostMapping("getCategoryByCategoryId")
    public Category getCategoryByCategoryId(@RequestParam(value = "categoryId") int categoryId){
        return categoryService.getCategory(categoryId);
    }

    // 根据款式ID找到款式
    @PostMapping("getStyleByStyleId")
    public Style getStyleByStyleId(@RequestParam(value = "styleId") int styleId){
        return categoryService.getStyle(styleId);
    }
}
