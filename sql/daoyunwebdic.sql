/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : daoyunweb

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-03-01 15:58:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `dic`;
CREATE TABLE `dic` (
  `dic_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'dicID',
  `dic_name` varchar(255) NOT NULL COMMENT 'dic名称',
  `dic_code` varchar(255) NOT NULL COMMENT 'dic码',
  `dic_detail` varchar(255) NOT NULL COMMENT 'dic描述',
  PRIMARY KEY (`dic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='dic表';

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `dic` VALUES ('1', '机器学习', '2', 'mlmlmlml');
INSERT INTO `dic` VALUES ('2', '深度学习', '3', 'dldldl');
INSERT INTO `dic` VALUES ('3', '大数据', '4', 'bdbdbd');
INSERT INTO `dic` VALUES ('12', 'attentionnlp', '1', 'a');
INSERT INTO `dic` VALUES ('14', 'bbbb', '1', 'b');
