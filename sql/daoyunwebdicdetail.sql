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
DROP TABLE IF EXISTS `dicd`;
CREATE TABLE `dicd` (
  `dic_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'dicID',
  `dic_itemkey` bigint NOT NULL COMMENT 'dicItemKey',
  `dic_itemvalue` varchar(32) NOT NULL COMMENT 'dicItemValue',
  `dic_status` bigint NOT NULL COMMENT 'dic状态',
  `dic_code` varchar(255) NOT NULL COMMENT 'dic码',
  PRIMARY KEY (`dic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='dicdetail表';

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `dicd` VALUES ('1',  '2','机器学习','0', 'mlmlmlml');
INSERT INTO `dicd` VALUES ('2',  '3','深度学习','0', 'dldldl');
INSERT INTO `dicd` VALUES ('3',  '4','大数据', '1','bdbdbd');
INSERT INTO `dicd` VALUES ('12', '1','attentionnlp', '0', 'a');
INSERT INTO `dicd` VALUES ('14',  '1','bbbb', '0','b');
