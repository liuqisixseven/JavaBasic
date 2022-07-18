/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : practice

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 13/07/2022 14:17:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `s_id` int NULL DEFAULT NULL,
  `s_name` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `s_birth` date NULL DEFAULT NULL,
  `s_sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '赵雷', '1990-01-01', '男');
INSERT INTO `student` VALUES (2, '钱电', '1990-12-21', '男');
INSERT INTO `student` VALUES (3, '孙风', '1990-05-20', '男');
INSERT INTO `student` VALUES (4, '李云', '1990-08-06', '男');
INSERT INTO `student` VALUES (5, '周梅', '1991-12-01', '女');
INSERT INTO `student` VALUES (6, '吴兰', '1992-03-01', '女');
INSERT INTO `student` VALUES (7, '郑竹', '1989-07-01', '女');
INSERT INTO `student` VALUES (8, '王菊', '1990-01-20', '女');

SET FOREIGN_KEY_CHECKS = 1;
