/*
 Navicat Premium Data Transfer

 Source Server         : root1
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : ashirt

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 07/09/2019 10:58:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `user_id` int(11) NOT NULL,
  `city` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `head_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nickname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone_num` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (190, 'changsha', 'hhq126152@gmail.com', '../images/head_picture/head_picture-01.jpg', 'abc', '123456', '23153121345');
INSERT INTO `account` VALUES (191, 'shanghai', '12345@163.com', '../images/head_picture/head_picture-01.jpg', 'sdsf', '123456', '34981231344');
INSERT INTO `account` VALUES (192, 'beijing', '34567@163.com', '../images/head_picture/head_picture-01.jpg', 'ger', '123456', '32534523546');
INSERT INTO `account` VALUES (193, 'guangzhou', 'lll123@163.com', '../images/head_picture/head_picture-01.jpg', 'lll', '123456', '12358594403');
INSERT INTO `account` VALUES (194, 'shenzhen', 'hewhwjk@qq.com', '../images/head_picture/head_picture-01.jpg', 'dhso', '123456', '13874890298');
INSERT INTO `account` VALUES (195, 'zhengzhou', 'iucwijqL@163.com', '../images/head_picture/head_picture-01.jpg', 'ihgkeiwi;', '123456', '12839094736');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `category_id` int(11) NOT NULL,
  `category_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (180, '../images/category_picture/arrow-01.svg', 'arrow');
INSERT INTO `category` VALUES (181, '../images/category_picture/baseball-01.svg', 'baseball');
INSERT INTO `category` VALUES (182, '../images/category_picture/book-01.svg', 'book');
INSERT INTO `category` VALUES (183, '../images/category_picture/cat-01.svg', 'cat');
INSERT INTO `category` VALUES (184, '../images/category_picture/house-01.svg', 'house');

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `comment_id` int(11) NOT NULL,
  `details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `floor` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `time` datetime(0) NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (130, 'nothing', 1, 170, '2019-09-17 10:50:44', 190);
INSERT INTO `comments` VALUES (131, 'very_good', 2, 171, '2019-09-25 10:51:27', 191);
INSERT INTO `comments` VALUES (132, 'I like it', 3, 170, '2019-09-28 14:53:11', 190);

-- ----------------------------
-- Table structure for design
-- ----------------------------
DROP TABLE IF EXISTS `design`;
CREATE TABLE `design`  (
  `user_id` int(11) NOT NULL,
  `design_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `design_time` datetime(0) NULL DEFAULT NULL,
  `material` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `publish` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `size` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `style_id` int(11) NOT NULL,
  `thought` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of design
-- ----------------------------
INSERT INTO `design` VALUES (190, '../images/design_picture/design-01.svg', '2019-09-05 11:19:19', 'asd', 32, 170, '1', 'xl', 1234567860, 'sagdagadg');
INSERT INTO `design` VALUES (191, '../images/design_picture/design-01.jpg', '2019-09-05 14:42:40', 'silk', 32, 171, '1', 'xxl', 1234567860, 'hjfaahsgffa');
INSERT INTO `design` VALUES (192, '../images/design_picture/design-01.jpg', '2019-09-07 14:45:57', 'kjj', 80, 172, '1', 'l', 1234567860, 'dsfghjklfds');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `item_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `item_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`item_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1600, 180, '../images/item_picture/arrow-01.svg');
INSERT INTO `item` VALUES (1601, 180, '../images/item_picture/arrow-02.svg');
INSERT INTO `item` VALUES (1602, 180, '../images/item_picture/arrow-03.svg');
INSERT INTO `item` VALUES (1610, 181, '../images/item_picture/baseball-01.svg');
INSERT INTO `item` VALUES (1611, 181, '../images/item_picture/baseball-02.svg');
INSERT INTO `item` VALUES (1612, 181, '../images/item_picture/baseball-03.svg');
INSERT INTO `item` VALUES (1620, 182, '../images/item_picture/book-01.svg');
INSERT INTO `item` VALUES (1621, 182, '../images/item_picture/book-02.svg');
INSERT INTO `item` VALUES (1622, 182, '../images/item_picture/book-03.svg');
INSERT INTO `item` VALUES (1630, 183, '../images/item_picture/cat-01.svg');
INSERT INTO `item` VALUES (1631, 183, '../images/item_picture/cat-02.svg');
INSERT INTO `item` VALUES (1632, 183, '../images/item_picture/cat-03.svg');
INSERT INTO `item` VALUES (1640, 184, '../images/item_picture/house-01.svg');
INSERT INTO `item` VALUES (1641, 184, '../images/item_picture/house-02.svg');
INSERT INTO `item` VALUES (1642, 184, '../images/item_picture/house-03.svg');
INSERT INTO `item` VALUES (1643, 184, '../images/item_picture/house-04.svg');
INSERT INTO `item` VALUES (1644, 184, '../images/item_picture/house-05.svg');
INSERT INTO `item` VALUES (1645, 184, '../images/item_picture/house-06.svg');

-- ----------------------------
-- Table structure for style
-- ----------------------------
DROP TABLE IF EXISTS `style`;
CREATE TABLE `style`  (
  `style_id` int(11) NOT NULL,
  `color` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int(11) NULL DEFAULT NULL,
  `style_describe` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `style_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `upload_time` datetime(0) NULL DEFAULT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`style_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of style
-- ----------------------------
INSERT INTO `style` VALUES (150, 'grey', 35, 'sadfadsgda', '/images/style_picture/fleece-01.jpg', '2019-09-05 11:22:53', 'fleece');
INSERT INTO `style` VALUES (151, 'green', 30, 'sdfghjgffghjk', '/images/style_picture/T-shirt-01.jpg', '2019-09-05 15:18:13', 'Tshirt');
INSERT INTO `style` VALUES (152, 'purple', 50, 'ajhrsghjekwl', '/images/style_picture/skirt-01.jpg', '2019-09-06 15:19:12', 'skirt');

-- ----------------------------
-- Table structure for tutorial
-- ----------------------------
DROP TABLE IF EXISTS `tutorial`;
CREATE TABLE `tutorial`  (
  `tutorial_id` int(11) NOT NULL,
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `video` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`tutorial_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tutorial
-- ----------------------------
INSERT INTO `tutorial` VALUES (140, 'adfdagadw', '../video/....mp4');

SET FOREIGN_KEY_CHECKS = 1;
