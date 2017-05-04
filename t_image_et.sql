/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-04 16:08:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_image_et`
-- ----------------------------
DROP TABLE IF EXISTS `t_image_et`;
CREATE TABLE `t_image_et` (
  `id` varchar(32) NOT NULL,
  `imgjianjie` varchar(300) DEFAULT NULL,
  `imgsfjs` int(3) DEFAULT NULL,
  `imgjg` decimal(10,2) DEFAULT NULL,
  `imglj` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_image_et
-- ----------------------------
