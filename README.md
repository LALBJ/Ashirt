﻿﻿﻿﻿﻿﻿﻿﻿﻿# Ashirt

help you get started to design T-shirt manully:boom:



# 目录说明

```./document``` : 项目的文档

```./project``` : 项目的java工程

```./assets```  : 项目的附件等信息

```./how_to_use_git.md``` : [git使用手册](./how_to_use_git.md)

```./autopush.sh``` : git自动上传脚本

# 文档完成进度

- [x] 项目立项报告
- [x] 项目计划(简版)
- [x] 需求分析
- [x] 系统设计
- [x] [数据库表的构建](database_config.md)
- [x] [前后端变量交互](./document/variable_interaction.md)


# 一些小想法

1. 用户设计完之后，按招官方标价进行购买。购买完成后可选择是否发布至分享区，按照官方标价的1/3进行标价，其他用户可以对次设计进行再次购买

# Tips:

1. Session由Web服务端维护，Cookie由客户端维护。[参考链接](https://blog.csdn.net/vbirdbest/article/details/89204972)

   暂时理解为一个网站一个cookie，一个cookie可以保存多个ssession。

   ```java
   request.getCookies()
   ```

   返回的为浏览器的所有cookie，所以需要遍历。