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

 Date: 13/07/2022 14:16:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `s_id` int NULL DEFAULT NULL,
  `c_id` int NULL DEFAULT NULL,
  `s_score` int NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, 1, 80);
INSERT INTO `score` VALUES (1, 2, 90);
INSERT INTO `score` VALUES (1, 3, 99);
INSERT INTO `score` VALUES (2, 1, 70);
INSERT INTO `score` VALUES (2, 2, 60);
INSERT INTO `score` VALUES (2, 3, 65);
INSERT INTO `score` VALUES (3, 1, 80);
INSERT INTO `score` VALUES (3, 2, 80);
INSERT INTO `score` VALUES (3, 3, 80);
INSERT INTO `score` VALUES (4, 1, 50);
INSERT INTO `score` VALUES (4, 2, 30);
INSERT INTO `score` VALUES (4, 3, 40);
INSERT INTO `score` VALUES (5, 1, 76);
INSERT INTO `score` VALUES (5, 2, 87);
INSERT INTO `score` VALUES (6, 1, 31);
INSERT INTO `score` VALUES (6, 3, 34);
INSERT INTO `score` VALUES (7, 2, 89);
INSERT INTO `score` VALUES (7, 3, 98);

SET FOREIGN_KEY_CHECKS = 1;
