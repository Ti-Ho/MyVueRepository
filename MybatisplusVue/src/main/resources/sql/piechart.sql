/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : zth

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 26/12/2020 17:00:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for piechart
-- ----------------------------
DROP TABLE IF EXISTS `piechart`;
CREATE TABLE `piechart`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `value` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of piechart
-- ----------------------------
INSERT INTO `piechart` VALUES ('搜索引擎', 1048);
INSERT INTO `piechart` VALUES ('直接访问', 735);
INSERT INTO `piechart` VALUES ('邮件营销', 580);
INSERT INTO `piechart` VALUES ('联盟广告', 484);
INSERT INTO `piechart` VALUES ('视频广告', 300);

SET FOREIGN_KEY_CHECKS = 1;
