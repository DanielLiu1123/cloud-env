/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.32-log : Database - seata_sharding_jdbc_1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`seata_sharding_jdbc_1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `seata_sharding_jdbc_1`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` varchar(20) NOT NULL COMMENT 'id',
  `user_id` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户id',
  `money` decimal(11,2) DEFAULT '0.00' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `account` */

insert  into `account`(`id`,`user_id`,`money`) values ('1','111','100.00');

/*Table structure for table `order_1` */

DROP TABLE IF EXISTS `order_1`;

CREATE TABLE `order_1` (
  `id` varchar(20) NOT NULL COMMENT 'id',
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `commodity_code` varchar(255) DEFAULT NULL COMMENT '商品编码',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `money` decimal(11,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_1` */

insert  into `order_1`(`id`,`user_id`,`commodity_code`,`count`,`money`) values ('1392797453348700161','111','2',10,'2.50');

/*Table structure for table `order_2` */

DROP TABLE IF EXISTS `order_2`;

CREATE TABLE `order_2` (
  `id` varchar(20) NOT NULL COMMENT 'id',
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `commodity_code` varchar(255) DEFAULT NULL COMMENT '商品编码',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `money` decimal(11,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_2` */

/*Table structure for table `storage_1` */

DROP TABLE IF EXISTS `storage_1`;

CREATE TABLE `storage_1` (
  `id` varchar(20) NOT NULL COMMENT 'id',
  `commodity_code` varchar(255) DEFAULT NULL COMMENT '商品编码',
  `count` int(11) DEFAULT NULL COMMENT '剩余数量',
  PRIMARY KEY (`id`),
  UNIQUE KEY `commodity_code` (`commodity_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storage_1` */

insert  into `storage_1`(`id`,`commodity_code`,`count`) values ('1','5',100),('2','1',90),('3','3',100),('4','2',80),('5','4',100),('6','6',100);

/*Table structure for table `storage_2` */

DROP TABLE IF EXISTS `storage_2`;

CREATE TABLE `storage_2` (
  `id` varchar(20) NOT NULL COMMENT 'id',
  `commodity_code` varchar(255) DEFAULT NULL COMMENT '商品编码',
  `count` int(11) DEFAULT NULL COMMENT '剩余数量',
  PRIMARY KEY (`id`),
  UNIQUE KEY `commodity_code` (`commodity_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storage_2` */

insert  into `storage_2`(`id`,`commodity_code`,`count`) values ('1','5',100),('2','1',100),('3','3',100),('4','2',80),('5','4',100),('6','6',100);

/*Table structure for table `undo_log` */

DROP TABLE IF EXISTS `undo_log`;

CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'increment id',
  `branch_id` bigint(20) NOT NULL COMMENT 'branch transaction id',
  `xid` varchar(100) NOT NULL COMMENT 'global transaction id',
  `context` varchar(128) NOT NULL COMMENT 'undo_log context,such as serialization',
  `rollback_info` longblob NOT NULL COMMENT 'rollback info',
  `log_status` int(11) NOT NULL COMMENT '0:normal status,1:defense status',
  `log_created` datetime NOT NULL COMMENT 'create datetime',
  `log_modified` datetime NOT NULL COMMENT 'modify datetime',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='AT transaction mode undo table';

/*Data for the table `undo_log` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
