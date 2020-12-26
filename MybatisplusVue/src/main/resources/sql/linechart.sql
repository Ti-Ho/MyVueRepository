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

 Date: 26/12/2020 17:00:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for linechart
-- ----------------------------
DROP TABLE IF EXISTS `linechart`;
CREATE TABLE `linechart`  (
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y1` int(255) NULL DEFAULT NULL,
  `y2` int(255) NULL DEFAULT NULL,
  `y3` int(255) NULL DEFAULT NULL,
  `y4` int(255) NULL DEFAULT NULL,
  `y5` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of linechart
-- ----------------------------
INSERT INTO `linechart` VALUES ('一月', 48, 47, 27, 20, 8);
INSERT INTO `linechart` VALUES ('二月', 13, 47, 31, 46, 24);
INSERT INTO `linechart` VALUES ('三月', 19, 24, 43, 44, 40);
INSERT INTO `linechart` VALUES ('四月', 8, 2, 30, 47, 30);
INSERT INTO `linechart` VALUES ('五月', 42, 44, 27, 28, 26);
INSERT INTO `linechart` VALUES ('六月', 23, 47, 18, 32, 36);
INSERT INTO `linechart` VALUES ('七月', 22, 18, 30, 45, 47);
INSERT INTO `linechart` VALUES ('八月', 27, 40, 16, 17, 35);
INSERT INTO `linechart` VALUES ('九月', 1, 4, 9, 40, 28);
INSERT INTO `linechart` VALUES ('十月', 39, 31, 30, 45, 38);
INSERT INTO `linechart` VALUES ('十一月', 49, 28, 32, 30, 17);
INSERT INTO `linechart` VALUES ('十二月', 29, 9, 34, 42, 4);

SET FOREIGN_KEY_CHECKS = 1;
