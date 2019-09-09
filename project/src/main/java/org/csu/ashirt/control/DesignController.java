package org.csu.ashirt.control;

import org.csu.ashirt.Utils.UploadUtils;
import org.csu.ashirt.domain.Account;
import org.csu.ashirt.domain.Design;
import org.csu.ashirt.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class DesignController {
    @Resource
    private DesignService designService;

    @Autowired
    HttpServletRequest request;

    // 获取所有设计
    @PostMapping("getAllDesign")
    public Map<String, Object> getAllDesign(@RequestParam(value="limit") Integer limit,
                                            @RequestParam(value="offset") Integer offset){
        return designService.getDesignList(offset, limit);
    }

    // 获取当前用户的设计
    @PostMapping("getDesignOfCurrentUser")
    public Map<String, Object> getDesignOfCurrentUser(@RequestParam(value="limit") Integer limit,
                                               @RequestParam(value="offset") Integer offset){
        Account account = (Account) request.getSession().getAttribute("account");
        return designService.getDesignByUserId(offset, limit, account.getUserId());
    }

    // 根据styleId获取设计
    @PostMapping("getDesignByStyleId")
    public Map<String, Object> getDesignByStyleId(@RequestParam("styleId") Integer styleId,
                                                  @RequestParam(value="limit") Integer limit,
                                                  @RequestParam(value="offset") Integer offset){
        return designService.getDesignByStyleId(offset, limit, styleId);
    }

    // 根据productId获取设计
    @PostMapping("getDesignByProductId")
    public Map<String, Object> getDesignByProductId(@RequestParam("productId") Integer productId,
                                                    @RequestParam(value="limit") Integer limit,
                                                    @RequestParam(value="offset") Integer offset){
        return designService.getDesignByProductId(offset, limit, productId);
    }

    // 储存用户的一次设计
    @PostMapping("insertDesign")
    public int insertDesign(@RequestParam("imgFile") MultipartFile imgFile,
                            @RequestParam("material") String material,
                            @RequestParam("publish") char publish,
                            @RequestParam("size") String size,
                            @RequestParam("styleId") Integer styleId,
                            @RequestParam("thought") String thought) throws ParseException {
        // 判断文件是否为空
        if (imgFile.isEmpty()){return -1;}

        // 获取文件名
        String originalFilename = imgFile.getOriginalFilename();
        String uuidFileName = UploadUtils.getUUIDName(originalFilename);

        // TODO figout primary key error in design table
        // 获取userID
        Account account = (Account) request.getSession().getAttribute("account");
        int userID = account.getUserId();

        //获取productID
        List<Design> designs = designService.getAllDesign();
        int productId = designs.get(designs.size()-1).getProductId() + 1;

        //获取当前时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date designTime = dateFormat.parse(dateFormat.format((new Date())));

        //获取文件路径名
        String designPicture = new String("/images/design_picture/" + uuidFileName);

        // 创建新的design对象
        Design design = new Design();
        design.setProductId(productId);
        design.setUserId(userID);
        design.setStyleId(styleId);
        design.setPublish(publish);
        design.setDesignPicture(designPicture);
        design.setDesignTime(designTime);
        design.setSize(size);
        design.setMaterial(material);
        design.setPrice(50);
        design.setThought(thought);

        // 储存图片至项目
        File fileDir = UploadUtils.getDesignImgDirFile();
        try {
            File newFile = new File(fileDir.getAbsolutePath() + File.separator + uuidFileName);
            imgFile.transferTo(newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 将数据写入数据库
        return designService.insertDesign(design);
    }

    // TODO don't use design as a variable
    // 更新某条设计
    @PostMapping("updateDesign")
    public int updateDesign(@RequestBody Design design){
        return designService.updateDesign(design);
    }

    // 删除某条设计
    @PostMapping("deleteDesign")
    public int deleteDesign(@RequestParam("productId") Integer productId){
        return designService.deleteDesign(productId);
    }
}
