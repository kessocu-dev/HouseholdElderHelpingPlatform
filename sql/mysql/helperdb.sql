/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : helperdb

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 21/10/2023 14:27:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_elder_info
-- ----------------------------
DROP TABLE IF EXISTS `user_elder_info`;
CREATE TABLE `user_elder_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) DEFAULT NULL COMMENT '老人姓名',
  `phone` varchar(255) DEFAULT NULL COMMENT '老人手机号',
  `idcard` varchar(255) DEFAULT NULL COMMENT '老人身份证号',
  `family_phone` varchar(255) DEFAULT NULL COMMENT '老人家人联系电话1',
  `location` varchar(255) DEFAULT NULL COMMENT '老人具体住址',
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user_elder_info
-- ----------------------------
BEGIN;
INSERT INTO `user_elder_info` (`id`, `name`, `phone`, `idcard`, `family_phone`, `location`, `date`) VALUES (1, '赵森森', '17739396001', '410104200006141641', '15342234529', '河南周口', '2023-10-21 00:49:04');
INSERT INTO `user_elder_info` (`id`, `name`, `phone`, `idcard`, `family_phone`, `location`, `date`) VALUES (2, 'xxx', '17739396001', '410104200006141641', '15342234529', '湖北武汉', '2023-10-21 00:50:26');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
