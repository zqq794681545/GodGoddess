/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-03 15:58:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_model_imggroup`
-- ----------------------------
DROP TABLE IF EXISTS `t_model_imggroup`;
CREATE TABLE `t_model_imggroup` (
  `id` varchar(32) NOT NULL DEFAULT '' COMMENT '主键',
  `imggroupname` varchar(32) DEFAULT NULL,
  `modelid` varchar(32) DEFAULT NULL,
  `imggroupgrfm` varchar(200) DEFAULT NULL,
  `imgfmsize` int(5) DEFAULT NULL,
  `imggroupbt` varchar(32) DEFAULT NULL,
  `imggrouptype` int(3) DEFAULT NULL,
  `imggroupgrbs` int(3) DEFAULT NULL,
  `imggroupid` varchar(32) DEFAULT NULL,
  `imggroupgxsj` date DEFAULT NULL,
  `imggroupgxr` varchar(32) DEFAULT NULL,
  `imggroupdzrs` int(5) DEFAULT NULL,
  `imggroupsee` int(5) DEFAULT NULL,
  `imggroupvip` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_model_imggroup
-- ----------------------------
INSERT INTO `t_model_imggroup` VALUES ('0450e5f7513e46b6bf7ff77c42aad832', null, 'b407ce26d24c429eabcc5acf4bedcc24', '11', '2', '可爱', '1', '2', '0450e5f7513e46b6bf7ff77c42aa1111', '2017-05-11', 'ww', '342', '322', '2');
