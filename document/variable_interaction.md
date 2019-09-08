# 前后端变量交互一致性

### 用户模块 :

| 方法     | value                   | 返回值                           |
| :------- | :---------------------- | :------------------------------- |
| 注册     | insertAccount(Account)  | 1成功, 0失败                     |
| 登录     | login(userId, password) | 0用户不存在;1登录成功;-1密码错误 |
| 修改信息 | updateAccount(Account)  | 1成功, 0失败                     |
| 退出登录 | exitAccount()           | 1成功, 0失败                     |

### 素材提供模块 :

| 方法                                                       | value                                   | 返回值         |
| :--------------------------------------------------------- | :-------------------------------------- | :------------- |
| 获得所有列表                                               | getAllCategory()                        | List<category> |
| 根据列表的获得所有图案                                     | getAllItemsByCategoryId(categoryId)     | List<Item>     |
| 根据关键字找到列表                                         | getCategoriesByKeyword(categoryKeyword) | List<Category> |
| 根据关键字找到款式                                         | getStylesByKeyword(stylesKeyword)       | List<Style>    |
| 根据颜色和款式找到对应的衣服                               | getStyleByColorAndName(color, name)     | Style          |
| 根据款式ID找到对应颜色的衣服（可用在查询衣服可改变的颜色） | getSameStylesByCategoryId(categoryId)   | List<Style>    |
| 根据图案ID找到图案                                         | getItemByItemId(itemId)                 | Item           |
| 根据列表ID找到列表                                         | getCategoryByCategoryId(categoryId)     | Category       |
| 根据款式ID找到款式                                         | getStyleByStyleId(styleId)              | Style          |

### 用户设计模块 :

| 方法                  | value                           | 返回值       |
| --------------------- | ------------------------------- | ------------ |
| 获取所有设计          | getAllDesign()                  | List<Design> |
| 获取当前用户的设计    | getDesignOfCurrentUser()        | List<Design> |
| 根据styleId获取设计   | getDesignByStyleId(styleId)     | List<Design> |
| 根据productId获取设计 | getDesignByProductId(productId) | List<Design> |
| 储存用户的一次设计    | insertDesign(Design)            | 1成功, 0失败 |
| 更新某条设计          | updateDesign(Design)            | 1成功, 0失败 |
| 删除某条设计          | deleteDesign(productId)         | 1成功, 0失败 |

### 用户交流模块 :

| 方法                  | value                             | 返回值         |
| --------------------- | --------------------------------- | -------------- |
| 获取当前用户的评论    | getCommentsOfCurrentUser()        | List<Comments> |
| 根据productId获取评论 | getCommentsByProductId(productId) | List<Comments> |
| 当前用户发表评论      | insertComments(Comments)          | 1成功, 0失败   |

