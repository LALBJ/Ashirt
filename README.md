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
- [x] 项目计划
- [x] 需求分析
- [x] 系统设计
- [x] 数据库表的构建

# 前后端变量交互一致性

### 用户模块 :

|   方法      |  value   | 返回值    |
|:-|:-|:-|
| 注册  | insertStudent(Account)| 1成功, 0失败 |
| 登录| login(userId) | Account |
|修改信息 | updateStudent(Account)  | 1成功, 0失败 |

### 素材提供模块 :

|   方法      |  value   | 返回值    |
|:-|:-|:-|
| 获得所有列表|   getAllCategory()  | List<category> |
| 根据列表的获得所有图案 | getAllItemsByCategoryId(categoryId) | List<Item> |
| 根据关键字找到列表   |  getCategoriesByKeyword(categoryKeyword) |   List<Category> |
| 根据关键字找到款式  |  getStylesByKeyword(StylesKeyword)   | List<Style> |
| 根据颜色和款式找到对应的衣服   |   getStyleByColorAndName(color, name)  |  Style |
| 根据款式ID找到对应颜色的衣服（可用在查询衣服可改变的颜色） |  getSameStylesByCategoryId(categoryId)    | List<Style> |
| 根据图案ID找到图案   |  getItemByItemId(itemId)  | Item |
| 根据列表ID找到列表  |  getCategoryByCategoryId(categoryId)   | Category |
| 根据款式ID找到款式  |  getStyleByStyleId(styleId)   | Style |

### 用户设计模块 :

| 方法                  | value                           | 返回值       |
| --------------------- | ------------------------------- | ------------ |
| 获取所有设计          | getAllDesign()                  | List<Design> |
| 根据userId获取设计    | getDesignByUserId(userId)       | List<Design> |
| 根据styleId获取设计   | getDesignByStyleId(styleId)     | List<Design> |
| 根据productId获取设计 | getDesignByProductId(productId) | List<Design> |
| 储存用户的一次设计    | insertDesign(Design)            | 1成功, 0失败 |
| 更新某条设计          | updateDesign(Design)            | 1成功, 0失败 |
| 删除某条设计          | deleteDesign(productId)         | 1成功, 0失败 |


### 用户交流模块 :

| 方法                  | value                             | 返回值         |
| --------------------- | --------------------------------- | -------------- |
| 根据userId获取评论    | getCommentsByUserId(userId)       | List<Comments> |
| 根据productId获取评论 | getCommentsByProductId(productId) | List<Comments> |
| 插入一条评论          | insertComments(Comments)          | 1成功, 0失败   |


# 一些小想法

1. 用户设计完之后，按招官方标价进行购买。购买完成后可选择是否发布至分享区，按照官方标价的1/3进行标价，其他用户可以对次设计进行再次购买

















