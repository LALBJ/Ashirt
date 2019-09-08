package org.csu.ashirt.Utils;

import java.io.File;
import java.util.UUID;

public class UploadUtils {

    // 项目根目录下的目录
    public final static String DESIGN_IMG_PATH_PREFIX = "static/images";

    // 获取上传文件的文件夹路径
    public static File getDesignImgDirFile(){
        String fileDirPah = new String("src/main/resources/" + DESIGN_IMG_PATH_PREFIX);

        File fileDir = new File(fileDirPah);
        if(!fileDir.exists()){
            fileDir.mkdirs();
        }
        return fileDir;
    }

    public static String getUUIDName(String readName){
        int index = readName.lastIndexOf(".");
        if(index == -1){
            return UUID.randomUUID().toString().replace("-","").toUpperCase();
        }else {
            //生成一个随机序列，去除"-"，全部转换为大写，加上后缀
            return UUID.randomUUID().toString().replace("-","").toUpperCase() + readName.substring(index);
        }
    }
}
