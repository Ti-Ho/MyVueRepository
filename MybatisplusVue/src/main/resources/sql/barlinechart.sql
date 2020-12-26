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

 Date: 26/12/2020 17:00:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for barlinechart
-- ----------------------------
DROP TABLE IF EXISTS `barlinechart`;
CREATE TABLE `barlinechart`  (
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y1` decimal(65, 1) NULL DEFAULT NULL,
  `y2` decimal(65, 1) NULL DEFAULT NULL,
  `y3` decimal(65, 1) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of barlinechart
-- ----------------------------
INSERT INTO `barlinechart` VALUES ('1月', 2.0, 2.6, 2.0);
INSERT INTO `barlinechart` VALUES ('2月', 4.9, 5.9, 2.2);
INSERT INTO `barlinechart` VALUES ('3月', 7.0, 9.0, 3.3);
INSERT INTO `barlinechart` VALUES ('4月', 23.2, 26.4, 4.5);
INSERT INTO `barlinechart` VALUES ('5月', 25.6, 28.7, 6.3);
INSERT INTO `barlinechart` VALUES ('6月', 76.7, 70.7, 10.2);
INSERT INTO `barlinechart` VALUES ('7月', 135.6, 175.6, 20.3);
INSERT INTO `barlinechart` VALUES ('8月', 162.2, 182.2, 23.4);
INSERT INTO `barlinechart` VALUES ('9月', 32.6, 48.7, 23.0);
INSERT INTO `barlinechart` VALUES ('10月', 20.0, 18.8, 16.5);
INSERT INTO `barlinechart` VALUES ('11月', 6.4, 6.0, 12.0);
INSERT INTO `barlinechart` VALUES ('12月', 3.3, 100.0, 5.0);

SET FOREIGN_KEY_CHECKS = 1;
