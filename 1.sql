/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.5.62 : Database - bishe_shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bishe_shop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bishe_shop`;

/*Table structure for table `t_goods` */

DROP TABLE IF EXISTS `t_goods`;

CREATE TABLE `t_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(256) NOT NULL,
  `goods_price` varchar(30) NOT NULL,
  `main_picture` varchar(256) NOT NULL,
  `detail_picture` varchar(256) NOT NULL,
  `create_time` varchar(14) NOT NULL,
  `goods_status` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_goods` */

insert  into `t_goods`(`id`,`goods_name`,`goods_price`,`main_picture`,`detail_picture`,`create_time`,`goods_status`) values (1,'年货节 手工网红曲奇饼干礼盒伴手礼铁盒装 春节过年特产置办零食','119.00','2_1.jpg','2_2.jpg|2_3.jpg|2_4.jpg','20190130223650',1),(2,'【三只松鼠_年货坚果大礼包1473g/8袋】每日坚果礼盒零食干果送礼','88.00','3_1.jpg','3_2.jpg|3_3.jpg|3_4.jpg','20190130223957',1),(3,'马克华菲圆领休闲套头韩版男士卫衣','100.00','1_1.jpg','1_2.jpg|1_3.jpg|1_4.jpg','20190130224729',1);

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(256) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `goods_name` varchar(256) NOT NULL,
  `main_picture` varchar(256) NOT NULL,
  `address` varchar(256) NOT NULL,
  `leave_word` varchar(256) DEFAULT NULL,
  `number` int(11) NOT NULL,
  `total_price` varchar(256) NOT NULL,
  `create_time` varchar(14) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_order` */

/*Table structure for table `t_users` */

DROP TABLE IF EXISTS `t_users`;

CREATE TABLE `t_users` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_users` */

insert  into `t_users`(`id`,`user_name`,`password`) values (1,'101','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
