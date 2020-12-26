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

 Date: 26/12/2020 17:00:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tabledata
-- ----------------------------
DROP TABLE IF EXISTS `tabledata`;
CREATE TABLE `tabledata`  (
  `date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tabledata
-- ----------------------------
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');
INSERT INTO `tabledata` VALUES ('2016-05-03', '王小虎', '上海市普陀区金沙江路 1518 弄');

SET FOREIGN_KEY_CHECKS = 1;
