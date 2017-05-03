/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-03 15:59:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_model_imglb`
-- ----------------------------
DROP TABLE IF EXISTS `t_model_imglb`;
CREATE TABLE `t_model_imglb` (
  `id` varchar(32) NOT NULL,
  `imggroupid` varchar(32) DEFAULT NULL,
  `imggroupvalue` varchar(50) DEFAULT NULL,
  `imglbfmpath` varchar(300) DEFAULT NULL,
  `updatetime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_model_imglb
-- ----------------------------
INSERT INTO `t_model_imglb` VALUES ('0450e5f7513e46b6bf7ff77c42aa1111', '0450e5f7513e46b6bf7ff77c42aad855', '0450e5f7513e46b6bf7ff77c42aad8f9', '2', '2017-05-11');
INSERT INTO `t_model_imglb` VALUES ('0450e5f7513e46b6bf7ff77c42aad8fb', '0450e5f7513e46b6bf7ff77c42aad8f9', '0450e5f7513e46b6bf7ff77c42aad8f6', '1', '2017-05-03');
