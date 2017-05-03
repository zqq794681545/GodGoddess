/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-03 15:59:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_sctable`
-- ----------------------------
DROP TABLE IF EXISTS `t_sctable`;
CREATE TABLE `t_sctable` (
  `id` varchar(32) NOT NULL,
  `userid` varchar(32) DEFAULT NULL,
  `imggroupid` varchar(32) DEFAULT NULL,
  `scbs` int(3) DEFAULT NULL COMMENT '收藏标识 1为收藏模特 2为收藏图片组',
  `sctime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sctable
-- ----------------------------
