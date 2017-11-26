/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.16-log : Database - xmt_yueting
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xmt_yueting` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `xmt_yueting`;

/*Table structure for table `yt_admin` */

DROP TABLE IF EXISTS `yt_admin`;

CREATE TABLE `yt_admin` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` int(5) unsigned DEFAULT '0',
  `username` char(20) DEFAULT '',
  `password` char(32) DEFAULT '',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Table structure for table `yt_admin_log` */

DROP TABLE IF EXISTS `yt_admin_log`;

CREATE TABLE `yt_admin_log` (
  `sort` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `admin_id` int(11) NOT NULL DEFAULT '0' COMMENT '操作人编号',
  `admin_name` varchar(200) NOT NULL DEFAULT '' COMMENT '操作人名称',
  `addtime` int(11) NOT NULL DEFAULT '0' COMMENT '操作时间',
  `admin_ip` varchar(20) NOT NULL DEFAULT '' COMMENT '操作IP',
  `admin_agent` varchar(200) NOT NULL DEFAULT '' COMMENT '浏览器代理',
  `title` varchar(200) NOT NULL DEFAULT '' COMMENT '记录描述',
  `controller` varchar(200) NOT NULL DEFAULT '' COMMENT '操作模块',
  `action` varchar(20) NOT NULL DEFAULT '' COMMENT '操作类型',
  `objId` int(11) NOT NULL DEFAULT '0' COMMENT '操作对象ID',
  `olddata` text COMMENT '原始数据',
  `request` text COMMENT '请求',
  `responce` text COMMENT '响应',
  `describe` varchar(200) NOT NULL DEFAULT '' COMMENT '描述',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Table structure for table `yt_channel` */

DROP TABLE IF EXISTS `yt_channel`;

CREATE TABLE `yt_channel` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `channel_name` varchar(20) DEFAULT '',
  `ctime` int(10) DEFAULT '0',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='渠道表';

/*Table structure for table `yt_config` */

DROP TABLE IF EXISTS `yt_config`;

CREATE TABLE `yt_config` (
  `sort` varchar(64) NOT NULL,
  `value` text NOT NULL,
  PRIMARY KEY (`sort`),
  UNIQUE KEY `sort` (`sort`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `yt_config_ticket` */

DROP TABLE IF EXISTS `yt_config_ticket`;

CREATE TABLE `yt_config_ticket` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `amount` decimal(10,2) DEFAULT '0.00' COMMENT '金额，单位：元',
  `ticket` int(10) DEFAULT '0' COMMENT '充值阅听卷',
  `ticket_give` int(10) DEFAULT '0' COMMENT '赠送的阅听卷',
  `status` int(1) DEFAULT '1' COMMENT '状态：1正常 0下线',
  `ctime` int(10) DEFAULT '0',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Table structure for table `yt_novel` */

DROP TABLE IF EXISTS `yt_novel`;

CREATE TABLE `yt_novel` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bid` int(10) DEFAULT '0' COMMENT '长兄ID，0：没有兄弟，大于0：哥哥ID，即priorId',
  `title` varchar(64) DEFAULT '' COMMENT '书名',
  `cover` varchar(200) DEFAULT '' COMMENT '封面URL',
  `cat_parent_id` int(10) DEFAULT NULL COMMENT '小说栏目主分类ID',
  `cat_id` int(10) DEFAULT '0' COMMENT '小说栏目子分类ID',
  `cat_name` varchar(20) DEFAULT '' COMMENT '小说栏目名称',
  `writer` varchar(64) DEFAULT '' COMMENT '作者（原著）',
  `player` varchar(20) DEFAULT '' COMMENT '主播',
  `intro` text COMMENT '简介',
  `chapt_total` int(4) DEFAULT '0' COMMENT '章节总数',
  `is_end` int(1) DEFAULT '0' COMMENT '是否完结，1已完结 0未完结',
  `status` int(1) DEFAULT '1' COMMENT '状态：1正常 2下架 3删除',
  `click_num` int(10) DEFAULT '0' COMMENT '播放次数',
  `click_num_base` int(10) DEFAULT '0' COMMENT '基础播放次数',
  `ctime` int(10) DEFAULT '0',
  `utime` int(10) DEFAULT '0',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8 COMMENT='小说书名表';

/*Table structure for table `yt_novel_category` */

DROP TABLE IF EXISTS `yt_novel_category`;

CREATE TABLE `yt_novel_category` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` int(10) DEFAULT '0' COMMENT '父分类ID，顶级为0',
  `title` varchar(20) DEFAULT '' COMMENT '分类名称',
  `sort` int(10) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='小说分类表';

/*Table structure for table `yt_novel_chapt` */

DROP TABLE IF EXISTS `yt_novel_chapt`;

CREATE TABLE `yt_novel_chapt` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(1) DEFAULT '1' COMMENT '类型：1音频 2文本',
  `novel_id` int(11) DEFAULT '0' COMMENT '小说ID',
  `chapt` int(11) DEFAULT '0' COMMENT '章节号',
  `title` varchar(64) DEFAULT '' COMMENT '章节标题',
  `seconds` int(11) DEFAULT '0' COMMENT '本章节总秒数',
  `file_url` varchar(200) DEFAULT '' COMMENT '音频URL',
  `status` int(1) DEFAULT '1' COMMENT '状态：1在线 0下线',
  `vip` int(1) DEFAULT '0' COMMENT '1收费 0免费',
  `ctime` int(10) DEFAULT '0',
  `origin_novel_title` varchar(64) DEFAULT '' COMMENT '原始文件作品名称',
  `origin_chapt_title` varchar(64) DEFAULT '' COMMENT '原始文件章节名称',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `novel_id,chapt` (`novel_id`,`chapt`)
) ENGINE=InnoDB AUTO_INCREMENT=14366 DEFAULT CHARSET=utf8 COMMENT='小说章节表';

/*Table structure for table `yt_order` */

DROP TABLE IF EXISTS `yt_order`;

CREATE TABLE `yt_order` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `order_no` varchar(64) NOT NULL COMMENT '订单号，前缀B',
  `user_id` int(10) NOT NULL,
  `nick_name` varchar(64) DEFAULT '' COMMENT '昵称',
  `channel_id` int(10) DEFAULT '0',
  `channel_name` varchar(64) DEFAULT '',
  `novel_id` int(10) NOT NULL,
  `novel_title` varchar(32) DEFAULT '',
  `chapts` varchar(500) NOT NULL COMMENT '购买的章节号列表，如：1,2,3',
  `ticket` int(10) DEFAULT '0' COMMENT '订单总金额',
  `ctime` int(10) DEFAULT '0' COMMENT '订单创建时间',
  `is_pay` int(1) DEFAULT '0' COMMENT '是否支付：1已支付 0未支付',
  `pay_type` int(1) DEFAULT '1' COMMENT '支付方式：1余额支付',
  `pay_time` int(10) DEFAULT '0' COMMENT '订单支付时间',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `order_no` (`order_no`)
) ENGINE=InnoDB AUTO_INCREMENT=244 DEFAULT CHARSET=utf8 COMMENT='购买音频订单表';

/*Table structure for table `yt_order_recharge` */

DROP TABLE IF EXISTS `yt_order_recharge`;

CREATE TABLE `yt_order_recharge` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `order_no` varchar(32) DEFAULT '' COMMENT '订单号，前缀C',
  `user_id` int(10) DEFAULT '0',
  `channel_id` int(10) DEFAULT '0',
  `channel_name` varchar(32) DEFAULT '',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '总价',
  `ticket` int(10) DEFAULT '0' COMMENT '阅听券',
  `ticket_give` int(10) DEFAULT '0' COMMENT '赠送的阅听券',
  `pay_time` int(10) DEFAULT '0',
  `is_pay` int(1) DEFAULT '0',
  `pay_type` int(1) unsigned DEFAULT '1' COMMENT '1微信支付',
  `ctime` int(10) DEFAULT '0',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `orderno` (`order_no`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8 COMMENT='用户充值订单表';

/*Table structure for table `yt_position` */

DROP TABLE IF EXISTS `yt_position`;

CREATE TABLE `yt_position` (
  `sort` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` char(30) NOT NULL DEFAULT '',
  `listorder` smallint(5) unsigned DEFAULT '0',
  `thumb` varchar(150) DEFAULT '',
  `to_url` char(50) NOT NULL DEFAULT '' COMMENT '绑定分类id',
  `ctime` int(10) DEFAULT '0',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='推荐位';

/*Table structure for table `yt_position_data` */

DROP TABLE IF EXISTS `yt_position_data`;

CREATE TABLE `yt_position_data` (
  `sort` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `tid` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '内容id(暂用小说ID)',
  `typeid` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '推荐位所属模型(小说1;暂缺)',
  `posid` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '推荐位ID',
  `thumb` varchar(100) DEFAULT NULL,
  `to_url` varchar(200) DEFAULT NULL COMMENT '跳转链接',
  `data` mediumtext COMMENT '推荐位详细数据json',
  `listorder` mediumint(8) DEFAULT '0',
  `ctime` int(11) unsigned DEFAULT '0',
  PRIMARY KEY (`sort`),
  KEY `posid` (`posid`),
  KEY `listorder` (`listorder`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='推荐位信息';

/*Table structure for table `yt_record_buy` */

DROP TABLE IF EXISTS `yt_record_buy`;

CREATE TABLE `yt_record_buy` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `novel_id` int(10) DEFAULT '0',
  `user_id` int(10) DEFAULT '0',
  `chapt_json` text COMMENT '已购买章节号，如：[1,3,4]，代表已买第1第3第4章',
  `utime` int(10) DEFAULT '0' COMMENT '修改时间',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `novel_id,user_id` (`novel_id`,`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COMMENT='购买记录表';

/*Table structure for table `yt_record_listen` */

DROP TABLE IF EXISTS `yt_record_listen`;

CREATE TABLE `yt_record_listen` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT '0',
  `novel_id` int(10) DEFAULT '0',
  `recent` text COMMENT '最近收听，例：{"chapt":10,"seconds":25}',
  `progress` text COMMENT '收听进度，[{"chapt":1,"seconds":65},...]',
  `utime` int(10) DEFAULT '0' COMMENT '修改时间',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `user_id,novel_id` (`user_id`,`novel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=346 DEFAULT CHARSET=utf8 COMMENT='小说章节收听进度表';

/*Table structure for table `yt_record_login_recent` */

DROP TABLE IF EXISTS `yt_record_login_recent`;

CREATE TABLE `yt_record_login_recent` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT '0',
  `channel_id` int(10) DEFAULT '0',
  `login_time` int(10) DEFAULT '0' COMMENT '最近登录时间',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=418 DEFAULT CHARSET=utf8 COMMENT='渠道和用户最近登录表';

/*Table structure for table `yt_record_money` */

DROP TABLE IF EXISTS `yt_record_money`;

CREATE TABLE `yt_record_money` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT '0',
  `type` int(1) DEFAULT '1' COMMENT '类型：1充值 2消费',
  `ticket_change` int(10) DEFAULT '0' COMMENT '充值卷变动',
  `ticket_give_change` int(10) DEFAULT '0' COMMENT '赠送卷变动',
  `ticket_left` int(10) DEFAULT '0' COMMENT '充值卷余额',
  `ticket_give_left` int(10) DEFAULT '0' COMMENT '赠送卷余额',
  `order_no` varchar(32) DEFAULT '' COMMENT '订单号',
  `pay_type` tinyint(2) DEFAULT '1' COMMENT '支付类型(1微信)',
  `ctime` int(10) DEFAULT '0',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=281 DEFAULT CHARSET=utf8 COMMENT='充值消费金额变动表';

/*Table structure for table `yt_role` */

DROP TABLE IF EXISTS `yt_role`;

CREATE TABLE `yt_role` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` char(30) NOT NULL DEFAULT '' COMMENT '用户组名称',
  `acl` varchar(2500) NOT NULL COMMENT '权限控制',
  PRIMARY KEY (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户组';

/*Table structure for table `yt_user` */

DROP TABLE IF EXISTS `yt_user`;

CREATE TABLE `yt_user` (
  `sort` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_type` int(1) DEFAULT '1' COMMENT '用户类型：1公众号用户',
  `openid` varchar(64) DEFAULT '',
  `nickname` varchar(64) DEFAULT '',
  `sex` tinyint(2) DEFAULT '0',
  `headimgurl` varchar(256) DEFAULT '' COMMENT '头像URL',
  `unionid` varchar(64) DEFAULT '',
  `country` varchar(20) DEFAULT '',
  `province` varchar(20) DEFAULT '',
  `city` varchar(20) DEFAULT '',
  `from_channel_id` int(10) DEFAULT '0' COMMENT '来源渠道（第一次登录绑定）',
  `channel_id` int(10) DEFAULT '0' COMMENT '用户绑定渠道ID（第一次充值绑定）',
  `ticket` int(10) DEFAULT '0' COMMENT '总剩余阅听券',
  `ticket_recharge` int(10) DEFAULT '0' COMMENT '总剩余充值阅听卷',
  `ticket_give` int(10) DEFAULT '0' COMMENT '总剩余充值赠送阅听卷',
  `reg_ip` varchar(20) DEFAULT '' COMMENT '注册IP',
  `reg_time` int(10) DEFAULT '0' COMMENT '注册时间',
  PRIMARY KEY (`sort`),
  UNIQUE KEY `openid` (`openid`,`unionid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=417 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
