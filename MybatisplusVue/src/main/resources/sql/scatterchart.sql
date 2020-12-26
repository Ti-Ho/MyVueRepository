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

 Date: 26/12/2020 17:00:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for scatterchart
-- ----------------------------
DROP TABLE IF EXISTS `scatterchart`;
CREATE TABLE `scatterchart`  (
  `x` decimal(60, 2) NULL DEFAULT NULL,
  `y` decimal(60, 2) NULL DEFAULT NULL,
  `pos` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of scatterchart
-- ----------------------------
INSERT INTO `scatterchart` VALUES (10.00, 8.04, 1);
INSERT INTO `scatterchart` VALUES (8.00, 6.95, 1);
INSERT INTO `scatterchart` VALUES (13.00, 7.58, 1);
INSERT INTO `scatterchart` VALUES (9.00, 8.81, 1);
INSERT INTO `scatterchart` VALUES (11.00, 8.33, 1);
INSERT INTO `scatterchart` VALUES (14.00, 9.96, 1);
INSERT INTO `scatterchart` VALUES (6.00, 7.24, 1);
INSERT INTO `scatterchart` VALUES (4.00, 4.26, 1);
INSERT INTO `scatterchart` VALUES (12.00, 10.84, 1);
INSERT INTO `scatterchart` VALUES (7.00, 4.82, 1);
INSERT INTO `scatterchart` VALUES (5.00, 5.68, 1);
INSERT INTO `scatterchart` VALUES (10.00, 9.14, 2);
INSERT INTO `scatterchart` VALUES (8.00, 8.14, 2);
INSERT INTO `scatterchart` VALUES (13.00, 8.74, 2);
INSERT INTO `scatterchart` VALUES (9.00, 8.77, 2);
INSERT INTO `scatterchart` VALUES (11.00, 9.26, 2);
INSERT INTO `scatterchart` VALUES (14.00, 8.10, 2);
INSERT INTO `scatterchart` VALUES (6.00, 6.13, 2);
INSERT INTO `scatterchart` VALUES (4.00, 3.10, 2);
INSERT INTO `scatterchart` VALUES (12.00, 9.13, 2);
INSERT INTO `scatterchart` VALUES (7.00, 7.26, 2);
INSERT INTO `scatterchart` VALUES (5.00, 4.74, 2);
INSERT INTO `scatterchart` VALUES (10.00, 7.46, 3);
INSERT INTO `scatterchart` VALUES (8.00, 6.77, 3);
INSERT INTO `scatterchart` VALUES (13.00, 12.74, 3);
INSERT INTO `scatterchart` VALUES (9.00, 7.11, 3);
INSERT INTO `scatterchart` VALUES (11.00, 7.81, 3);
INSERT INTO `scatterchart` VALUES (14.00, 8.84, 3);
INSERT INTO `scatterchart` VALUES (6.00, 6.08, 3);
INSERT INTO `scatterchart` VALUES (4.00, 5.39, 3);
INSERT INTO `scatterchart` VALUES (12.00, 8.15, 3);
INSERT INTO `scatterchart` VALUES (7.00, 6.42, 3);
INSERT INTO `scatterchart` VALUES (5.00, 5.73, 3);
INSERT INTO `scatterchart` VALUES (8.00, 6.58, 4);
INSERT INTO `scatterchart` VALUES (8.00, 5.76, 4);
INSERT INTO `scatterchart` VALUES (8.00, 7.71, 4);
INSERT INTO `scatterchart` VALUES (8.00, 8.84, 4);
INSERT INTO `scatterchart` VALUES (8.00, 8.47, 4);
INSERT INTO `scatterchart` VALUES (8.00, 7.04, 4);
INSERT INTO `scatterchart` VALUES (8.00, 5.25, 4);
INSERT INTO `scatterchart` VALUES (19.00, 12.50, 4);
INSERT INTO `scatterchart` VALUES (8.00, 5.56, 4);
INSERT INTO `scatterchart` VALUES (8.00, 7.91, 4);
INSERT INTO `scatterchart` VALUES (8.00, 6.89, 4);

SET FOREIGN_KEY_CHECKS = 1;
