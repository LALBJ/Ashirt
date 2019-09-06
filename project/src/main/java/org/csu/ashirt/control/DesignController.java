package org.csu.ashirt.control;

import org.csu.ashirt.domain.Design;
import org.csu.ashirt.service.DesignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DesignController {
    @Resource
    private DesignService designService;

    // 获取所有设计
    @GetMapping("getAllDesign")
    public List<Design> getAllDesign(){
        return designService.getDesignList();
    }

    // 根据userId获取设计
    @PostMapping("getDesignByUserId")
    public List<Design> getDesignByUserId(@RequestParam("userId") int userId){
        return designService.getDesignByUserId(userId);
    }

    // 根据styleId获取设计
    @PostMapping("getDesignByStyleId")
    public List<Design> getDesignByStyleId(@RequestParam("styleId") int styleId){
        return designService.getDesignByStyleId(styleId);
    }

    // 根据productId获取设计
    @PostMapping("getDesignByProductId")
    public List<Design> getDesignByProductId(@RequestParam("productId") int productId){
        return designService.getDesignByProductId(productId);
    }

    // 储存用户的一次设计
    @PostMapping("insertDesign")
    public int insertDesign(@RequestBody Design design){
        return designService.insertDesign(design);
    }

    // 更新某条设计
    @PostMapping("updateDesign")
    public int updateDesign(@RequestBody Design design){
        return designService.updateDesign(design);
    }

    // 删除某条设计
    @PostMapping("deleteDesign")
    public int deleteDesign(@RequestParam("productId") int productId){
        return designService.deleteDesign(productId);
    }
}
