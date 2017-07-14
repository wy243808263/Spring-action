/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50538
Source Host           : localhost:3306
Source Database       : cg_tuji

Target Server Type    : MYSQL
Target Server Version : 50538
File Encoding         : 65001

Date: 2015-03-20 10:23:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `deleteStatus` bit(1) DEFAULT NULL COMMENT '删除状态',
  `address` varchar(255) DEFAULT NULL COMMENT '公司地址',
  `bigHeight` int(11) DEFAULT NULL COMMENT '网站最大高度',
  `bigWidth` int(11) DEFAULT NULL COMMENT '网站最大宽度',
  `closeReason` longtext COMMENT '关闭原因',
  `copyRight` varchar(255) DEFAULT NULL COMMENT 'copyRight',
  `websiteDescription` varchar(255) DEFAULT NULL COMMENT '网站描述',
  `websiteKeywords` varchar(255) DEFAULT NULL COMMENT '网站关键字',
  `websiteName` varchar(255) DEFAULT NULL COMMENT '网站名字',
  `websitePhone` varchar(255) DEFAULT NULL COMMENT '网站电话',
  `language` varchar(255) DEFAULT NULL COMMENT '网站语言',
  `ctx` varchar(255) DEFAULT NULL COMMENT '网站上下文路径',
  `emailEnable` bit(1) DEFAULT NULL COMMENT '开放邮箱',
  `emailHost` varchar(255) DEFAULT NULL COMMENT '邮箱主机',
  `emailPort` int(11) DEFAULT NULL COMMENT '邮箱端口',
  `emailPwd` varchar(255) DEFAULT NULL COMMENT '邮箱密码',
  `emailUser` varchar(255) DEFAULT NULL COMMENT '邮箱用户',
  `emailUsername` varchar(255) DEFAULT NULL COMMENT '邮箱用户名',
  `imageFileSize` int(11) DEFAULT NULL COMMENT '图片大小',
  `imageSaveType` varchar(255) DEFAULT NULL COMMENT '图片保存类型',
  `imageSuffix` varchar(255) DEFAULT NULL COMMENT '图片后缀名',
  `websiteCss` varchar(255) DEFAULT NULL COMMENT '网站的CSS',
  `combineWebServer` varchar(255) DEFAULT NULL COMMENT '合并网站的服务器路径',
  `imageWebServer` varchar(255) DEFAULT NULL COMMENT '网站图片服务器路径',
  `secondDomainOpen` bit(1) DEFAULT NULL COMMENT '是否使用二级域名',
  `creditrule` longtext COMMENT '信用值字段',
  `integral` bit(1) DEFAULT NULL COMMENT '是否开通积分',
  `uploadFilePath` varchar(255) DEFAULT NULL COMMENT '上传文件路径',
  `title` varchar(255) DEFAULT NULL COMMENT '网站标题',
  `hotSearch` varchar(255) DEFAULT NULL COMMENT '热门搜索',
  `logoId` varchar(255) DEFAULT NULL COMMENT 'Logo图',
  `codeStat` longtext COMMENT '第三方统计代码',
  `websiteState` bit(1) DEFAULT NULL COMMENT '站点状态',
  `visitorConsult` bit(1) DEFAULT NULL COMMENT '允许游客咨询',
  `securityCodeType` varchar(255) DEFAULT NULL COMMENT '验证码类型',
  `serviceTelphoneList` longtext COMMENT '平台客服电话',
  `serviceQqList` longtext COMMENT '平台客服QQ',
  `qqLogin` bit(1) DEFAULT NULL COMMENT '是否启用qq关联',
  `qqDomainCode` longtext COMMENT '域名验证信息',
  `qqLoginId` varchar(255) DEFAULT NULL COMMENT '应用标识',
  `qqLoginKey` varchar(255) DEFAULT NULL COMMENT '应用密钥',
  `smallWidth` int(11) DEFAULT NULL COMMENT '小图宽尺寸',
  `smallHeight` int(11) DEFAULT NULL COMMENT '小图高尺寸',
  `middleWidth` int(11) DEFAULT NULL COMMENT '中图宽尺寸',
  `middleHeight` int(11) DEFAULT NULL COMMENT '中图高尺寸',
  `infoImageId` bigint(20) DEFAULT NULL COMMENT '默认信息图片',
  `zoneImageId` bigint(20) DEFAULT NULL COMMENT '默认空间标志',
  `memberIconId` bigint(20) DEFAULT NULL COMMENT '默认会员头像',
  `emailTest` varchar(255) DEFAULT NULL COMMENT '邮件测试',
  `smsEnbale` bit(1) DEFAULT NULL COMMENT '开启短信功能',
  `smsUsername` varchar(255) DEFAULT NULL COMMENT '短信平台用户名',
  `smsPassword` varchar(255) DEFAULT NULL COMMENT '短信平台密码',
  `smsTest` varchar(255) DEFAULT NULL COMMENT '短信发送测试',
  `domainAllowCount` int(11) DEFAULT NULL COMMENT '允许修改次数',
  `sysDomain` longtext COMMENT '系统保留二级域名',
  `zoneAllow` bit(1) DEFAULT NULL COMMENT '允许空间申请',
  `disclaimer` longtext COMMENT '免责声明',
  `frontTemplate` bit(1) DEFAULT NULL COMMENT '前台公共模样',
  `template` bit(1) DEFAULT b'0' COMMENT '是否模板化',
  `sinaDomainCode` varchar(255) DEFAULT NULL COMMENT '新浪CODE',
  `sinaLogin` bit(1) DEFAULT NULL COMMENT '是否开放',
  `sinaLoginId` varchar(255) DEFAULT NULL COMMENT '登录ID',
  `sinaLoginKey` varchar(255) DEFAULT NULL COMMENT '登录密钥',
  `doubanLogin` bit(1) DEFAULT NULL COMMENT '豆瓣登录',
  `doubanLoginId` varchar(255) DEFAULT NULL COMMENT '登录api key',
  `doubanLoginKey` varchar(255) DEFAULT NULL COMMENT '登录Secret',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_config
-- ----------------------------
INSERT INTO `sys_config` VALUES ('1', '2014-06-16 17:12:12', '\0', '', '800', '800', 'dsfdsf', null, 'sdfsdf', 'dfdsfsd', '拎图网', null, 'zh_cn', null, '', 'ghfdg', '43', 'sdf', 'retet', 'sfsdfsd', '40000', 'sidYearImg', 'jpg,png', 'blue', null, 'http://localhost:8080/', '', '{\"creditrule29\":0,\"creditrule28\":0,\"creditrule27\":20,\"creditrule26\":10,\"creditrule25\":0,\"creditrule24\":0,\"creditrule23\":0,\"creditrule22\":0,\"creditrule21\":0,\"creditrule20\":0,\"creditrule2\":0,\"creditrule1\":20,\"creditrule4\":0,\"creditrule3\":0,\"creditrule0\":10,\"creditrule19\":0,\"creditrule18\":0,\"creditrule9\":0,\"creditrule7\":6,\"creditrule15\":0,\"creditrule8\":0,\"creditrule14\":0,\"creditrule5\":0,\"creditrule17\":0,\"creditrule6\":5,\"creditrule16\":0,\"creditrule11\":0,\"creditrule10\":0,\"creditrule13\":7,\"creditrule12\":4}', '\0', 'upload', 'sdf', '装修 |精装修 |外卖配送| 修建园林 |长途搬家 |家教| 保姆|长途搬家 |家教 |保姆1', '8', 'sdfds', '', '', 'normal', '5r45435', '345435', '', '345435', '345435', '345345', '224', '300', '550', '600', '1', null, '5', 'sdfsdf', '', 'fdg', 'sdfsdf', 'dfsadfsadf', '12', 'sadasd', '', '拎图网lintu5.com. 今日搭配网jrdapei.com。', '', '\0', null, '', '2312827215', '7b9d5c4dedb3b15f3d1a9f8e94ed0605', '', '065f740a8166323d131e5c1f843296b7', '436e397bd18c8bc5');
