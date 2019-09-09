package org.csu.ashirt.Utils;

import org.csu.ashirt.domain.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowUtils {
    // Category 的展示类
    public static Map<String, Object> CategoryPageShow(int offset,
                                                       int limit,
                                                       List<Category> CategoryList){
        Map<String, Object> map = new HashMap<>();
        List<Category> page = new ArrayList<>();
        for (int i = offset; i < offset+limit; i++) {
            if (i < CategoryList.size()) {
                page.add(CategoryList.get(i));
            }
        }
        map.put("rows", page);
        map.put("total", CategoryList.size());
        return map;
    }

    // Item 的展示类
    public static Map<String, Object> ItemPageShow(int offset,
                                                       int limit,
                                                       List<Item> ItemList){
        Map<String, Object> map = new HashMap<>();
        List<Item> page = new ArrayList<>();
        for (int i = offset; i < offset+limit; i++) {
            if (i < ItemList.size()) {
                page.add(ItemList.get(i));
            }
        }
        map.put("rows", page);
        map.put("total", ItemList.size());
        return map;
    }

    // Style 的展示类
    public static Map<String, Object> StylePageShow(int offset,
                                                   int limit,
                                                   List<Style> StyleList){
        Map<String, Object> map = new HashMap<>();
        List<Style> page = new ArrayList<>();
        for (int i = offset; i < offset+limit; i++) {
            if (i < StyleList.size()) {
                page.add(StyleList.get(i));
            }
        }
        map.put("rows", page);
        map.put("total", StyleList.size());
        return map;
    }

    // Comment 的展示类
    public static Map<String, Object> CommentsPageShow(int offset,
                                                    int limit,
                                                    List<Comments> CommentsList){
        Map<String, Object> map = new HashMap<>();
        List<Comments> page = new ArrayList<>();
        for (int i = offset; i < offset+limit; i++) {
            if (i < CommentsList.size()) {
                page.add(CommentsList.get(i));
            }
        }
        map.put("rows", page);
        map.put("total", CommentsList.size());
        return map;
    }

    // Design 的展示类
    public static Map<String, Object> DesignPageShow(int offset,
                                                       int limit,
                                                       List<Design> DesignList){
        Map<String, Object> map = new HashMap<>();
        List<Design> page = new ArrayList<>();
        for (int i = offset; i < offset+limit; i++) {
            if (i < DesignList.size()) {
                page.add(DesignList.get(i));
            }
        }
        map.put("rows", page);
        map.put("total", DesignList.size());
        return map;
    }
}
