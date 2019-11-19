SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `subject` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学科',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of t_teacher
-- ----------------------------
INSERT INTO `t_teacher` VALUES ('1', 'Mic', '40', '英语');
INSERT INTO `t_teacher` VALUES ('2', 'Tom', '50', '数学');
INSERT INTO `t_teacher` VALUES ('3', 'jack', '60', '物理');
