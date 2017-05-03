/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-05-03 15:59:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `phone` varchar(11) NOT NULL COMMENT '手机号码',
  `groupid` int(2) DEFAULT NULL COMMENT '1为管理员，2为普通用户',
  `sex` int(1) DEFAULT NULL COMMENT '性别  1为男，2为女',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `nikename` varchar(25) DEFAULT NULL COMMENT '昵称',
  `reg_time` date DEFAULT NULL COMMENT '注册时间',
  `avatar` varchar(50) DEFAULT NULL COMMENT '头像',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `last_login_time` date DEFAULT NULL COMMENT '最后一次登录时间',
  `start_vip_sj` date DEFAULT NULL COMMENT 'vip开始时间',
  `token` varchar(32) DEFAULT NULL,
  `end_vip_sj` date DEFAULT NULL COMMENT 'vip结束时间',
  `updatetime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('719726e9763e4a0c9cb02678c4e2b2fa', '18759608988', '2', null, 'c81e728d9d4c2f636f067f89cc14862c', null, '2017-04-27', null, null, null, null, null, null, null);
INSERT INTO `t_user` VALUES ('b407ce26d24c429eabcc5acf4bedcc26', '18759608982', '1', '1', 'c4ca4238a0b923820dcc509a6f75849b', '1111', '2017-04-14', '22', '22', '2017-04-25', '2017-04-14', null, '2017-04-14', null);
