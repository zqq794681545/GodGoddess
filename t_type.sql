/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-03 15:59:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` varchar(32) NOT NULL,
  `value` int(5) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `codeid` varchar(32) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  `pid` varchar(32) DEFAULT NULL,
  `updatetime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('0450e5f7513e46b6bf7ff77c42aad822', '1', '厦', '0450e5f7513e46b6bf7ff77c42aad855', '1', '0450e5f7513e46b6bf7ff77c427878f9', '2017-05-11');
INSERT INTO `t_type` VALUES ('0450e5f7513e46b6bf7ff77c42aad832', '2', '张', '0450e5f7513e46b6bf7ff77c42aad8f9', '1', '0450e5f7513e46b6bf7ff77c42aad8f9', '2017-05-11');
