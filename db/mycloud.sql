/*
Navicat MySQL Data Transfer

Source Server         : ydy
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : mycloud

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-12-09 19:57:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cloud_files
-- ----------------------------
DROP TABLE IF EXISTS `cloud_files`;
CREATE TABLE `cloud_files` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `file_name` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of cloud_files
-- ----------------------------
INSERT INTO `cloud_files` VALUES ('1', '测试', null, null, null);
INSERT INTO `cloud_files` VALUES ('2', '测试', '2018-12-08 06:06:47', '2018-12-08 06:06:47', null);
INSERT INTO `cloud_files` VALUES ('3', '测试', '2018-12-08 06:27:57', '2018-12-08 06:27:57', '测试1');
INSERT INTO `cloud_files` VALUES ('4', '测试', '2018-12-08 06:28:29', '2018-12-08 06:28:29', '测试1');
INSERT INTO `cloud_files` VALUES ('5', '测试', '2018-12-08 06:29:18', '2018-12-08 06:29:18', '测试1');
