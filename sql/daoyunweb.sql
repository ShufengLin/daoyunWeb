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
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `paper_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'paperID',
  `name` varchar(100) NOT NULL COMMENT 'paper名称',
  `number` int NOT NULL COMMENT 'paper数量',
  `detail` varchar(200) NOT NULL COMMENT 'paper描述',
  PRIMARY KEY (`paper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='paper表';

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `paper` VALUES ('1', '机器学习', '2', 'mlmlmlml');
INSERT INTO `paper` VALUES ('2', '深度学习', '3', 'dldldl');
INSERT INTO `paper` VALUES ('3', '大数据', '4', 'bdbdbd');
INSERT INTO `paper` VALUES ('12', 'attentionnlp', '1', 'a');
INSERT INTO `paper` VALUES ('14', 'bbbb', '1', 'b');
