/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-03 15:58:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_model`
-- ----------------------------
DROP TABLE IF EXISTS `t_model`;
CREATE TABLE `t_model` (
  `id` varchar(32) NOT NULL,
  `modelname` varchar(20) DEFAULT NULL,
  `modelage` int(3) DEFAULT NULL,
  `modelsex` int(3) DEFAULT NULL,
  `modelbirthday` date DEFAULT NULL,
  `modelphone` varchar(11) DEFAULT NULL,
  `modelheight` decimal(10,2) DEFAULT NULL,
  `modelweight` decimal(10,2) DEFAULT NULL,
  `modelwaist` decimal(10,2) DEFAULT NULL,
  `modelcup` varchar(10) DEFAULT NULL,
  `modelbust` decimal(10,2) DEFAULT NULL,
  `modelHipline` decimal(10,2) DEFAULT NULL,
  `modelavatar` varchar(200) DEFAULT NULL,
  `modelemail` varchar(30) DEFAULT NULL,
  `modelnickname` varchar(20) DEFAULT NULL,
  `modelintroduction` varchar(500) DEFAULT NULL,
  `modelcjsj` date DEFAULT NULL,
  `modelbq` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_model
-- ----------------------------
INSERT INTO `t_model` VALUES ('b407ce26d24c429eabcc5acf4bedcc24', 'ni', '20', '1', '2017-05-11', '18759608888', '176.55', '111.30', '50.00', ' A', '50.00', '40.00', '1', '785744@qq.com', 'nini', 'hgjggjhj5555', '2017-05-11', '2017-05-17');
