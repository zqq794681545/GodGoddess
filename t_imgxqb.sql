/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-04 16:16:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_imgxqb`
-- ----------------------------
DROP TABLE IF EXISTS `t_imgxqb`;
CREATE TABLE `t_imgxqb` (
  `id` varchar(32) NOT NULL,
  `imgname` varchar(32) DEFAULT NULL,
  `imgpath` varchar(200) DEFAULT NULL,
  `imgheight` int(5) DEFAULT NULL,
  `imgweight` int(5) DEFAULT NULL,
  `imgstate` int(3) DEFAULT NULL,
  `imgextend` varchar(100) DEFAULT NULL,
  `imgtype` int(3) DEFAULT NULL,
  `imggroupid` varchar(32) DEFAULT NULL,
  `imggxsj` date DEFAULT NULL,
  `imggxr` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_imgxqb
-- ----------------------------
