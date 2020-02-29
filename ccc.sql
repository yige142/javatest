/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ccc

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-02-29 14:34:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `c_tt`
-- ----------------------------
DROP TABLE IF EXISTS `c_tt`;
CREATE TABLE `c_tt` (
  `id` mediumint(20) NOT NULL AUTO_INCREMENT,
  `text` varchar(40) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_tt
-- ----------------------------
INSERT INTO `c_tt` VALUES ('1', 'C', '200');
INSERT INTO `c_tt` VALUES ('2', 'Cddd', '2123dfd');
INSERT INTO `c_tt` VALUES ('3', '小六', 'kfc');
INSERT INTO `c_tt` VALUES ('4', 'ffdsf', 'aaaaa');
INSERT INTO `c_tt` VALUES ('5', 'ffdsf2', 'xiexiaomao');
INSERT INTO `c_tt` VALUES ('6', 'ffdsf2', 'aaaaa');
INSERT INTO `c_tt` VALUES ('7', 'ffdsf2', 'aaaaa');
INSERT INTO `c_tt` VALUES ('8', 'ffdsf2', 'aaaaa');
INSERT INTO `c_tt` VALUES ('10', '王五', '烧饼');
