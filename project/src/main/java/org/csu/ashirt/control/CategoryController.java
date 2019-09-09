package org.csu.ashirt.control;

import org.csu.ashirt.domain.Category;
import org.csu.ashirt.domain.Item;
import org.csu.ashirt.domain.Style;
import org.csu.ashirt.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class CategoryController {
    @Resource
    CategoryService categoryService;

    // 获得所有列表
    @PostMapping("getAllCategory")
    public Map<String, Object> getAllCategory(@RequestParam(value="limit") Integer limit,
                                              @RequestParam(value="offset") Integer offset){
        return categoryService.getCategoryList(offset, limit);
    }

    // 根据列表ID获得所有图案
    @PostMapping("getAllItemsByCategoryId")
    public Map<String, Object> getAllItemsByCategoryId(@RequestParam(value = "categoryId") Integer categoryId ,
                                                       @RequestParam(value="limit") Integer limit,
                                                       @RequestParam(value="offset") Integer offset){
        return categoryService.getItemByCategory(offset, limit, categoryId);
    }

    // 根据关键字找到列表
    @PostMapping("getCategoriesByKeyword")
    public Map<String, Object> getCategoriesByKeyword(@RequestParam(value = "categoryKeyword") String categoryKeyword,
                                                 @RequestParam(value="limit") Integer limit,
                                                 @RequestParam(value="offset") Integer offset){
        return categoryService.searchCategoryList(offset, limit, categoryKeyword);
    }

    // 根据关键字找到款式
    @PostMapping("getStylesByKeyword")
    public Map<String, Object> getStylesByKeyword(@RequestParam(value = "stylesKeyword") String stylesKeyword,
                                                  @RequestParam(value="limit") Integer limit,
                                                  @RequestParam(value="offset") Integer offset){
        return categoryService.searchStyleList(offset, limit, stylesKeyword);
    }

    // 根据颜色和款式找到对应的衣服
    @PostMapping("getStyleByColorAndName")
    public Style getStyleByColorAndName(@RequestParam(value = "color") String color,@RequestParam(value = "name") String name){
        return categoryService.getStyleByColorAndName(color,name);
    }

    // 根据款式ID找到对应颜色的衣服
    @PostMapping("getSameStylesByCategoryId")
    public Map<String, Object> getSameStylesByCategoryId(@RequestParam(value = "categoryId") Integer categoryId,
                                                         @RequestParam(value="limit") Integer limit,
                                                         @RequestParam(value="offset") Integer offset){
        return categoryService.getStylesByName(offset, limit, categoryService.getCategory(categoryId).getName());
    }

    // 根据图案ID找到图案
    @PostMapping("getItemByItemId")
    public Item getItemByItemId(@RequestParam(value = "itemId") Integer itemId){
        return categoryService.getItem(itemId);
    }

    // 根据列表ID找到列表
    @PostMapping("getCategoryByCategoryId")
    public Category getCategoryByCategoryId(@RequestParam(value = "categoryId") Integer categoryId){
        return categoryService.getCategory(categoryId);
    }

    // 根据款式ID找到款式
    @PostMapping("getStyleByStyleId")
    public Style getStyleByStyleId(@RequestParam(value = "styleId") Integer styleId){
        return categoryService.getStyle(styleId);
    }
}
