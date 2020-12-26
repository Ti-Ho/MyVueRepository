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

 Date: 26/12/2020 16:59:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for barchart
-- ----------------------------
DROP TABLE IF EXISTS `barchart`;
CREATE TABLE `barchart`  (
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of barchart
-- ----------------------------
INSERT INTO `barchart` VALUES ('横轴1', 120);
INSERT INTO `barchart` VALUES ('横轴2', 132);
INSERT INTO `barchart` VALUES ('横轴3', 101);
INSERT INTO `barchart` VALUES ('横轴4', 135);
INSERT INTO `barchart` VALUES ('横轴5', 90);
INSERT INTO `barchart` VALUES ('横轴6', 235);
INSERT INTO `barchart` VALUES ('横轴7', 210);
INSERT INTO `barchart` VALUES ('横轴8', 100);
INSERT INTO `barchart` VALUES ('横轴9', 90);
INSERT INTO `barchart` VALUES ('横轴10', 95);
INSERT INTO `barchart` VALUES ('横轴11', 97);
INSERT INTO `barchart` VALUES ('横轴12', 110);
INSERT INTO `barchart` VALUES ('横轴13', 205);

SET FOREIGN_KEY_CHECKS = 1;
