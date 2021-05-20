/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.32-log : Database - oauth2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`oauth2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `oauth2`;

/*Table structure for table `oauth_access_token` */

DROP TABLE IF EXISTS `oauth_access_token`;

CREATE TABLE `oauth_access_token` (
  `token_id` varchar(256) DEFAULT NULL COMMENT 'MD5åŠ å¯†çš„access_tokençš„å€¼',
  `token` blob COMMENT 'OAuth2AccessToken.javaå¯¹è±¡åºåˆ—åŒ–åçš„äºŒè¿›åˆ¶æ•°æ®',
  `authentication_id` varchar(256) NOT NULL COMMENT 'MD5åŠ å¯†è¿‡çš„username,client_id,scope',
  `user_name` varchar(256) DEFAULT NULL COMMENT 'ç™»å½•çš„ç”¨æˆ·å',
  `client_id` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯ID',
  `authentication` blob COMMENT 'OAuth2Authentication.javaå¯¹è±¡åºåˆ—åŒ–åçš„äºŒè¿›åˆ¶æ•°æ®',
  `refresh_token` varchar(256) DEFAULT NULL COMMENT 'MD5åŠ å¯†åçš„refresh_tokençš„å€¼',
  PRIMARY KEY (`authentication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='è®¿é—®ä»¤ç‰Œ';

/*Data for the table `oauth_access_token` */

insert  into `oauth_access_token`(`token_id`,`token`,`authentication_id`,`user_name`,`client_id`,`authentication`,`refresh_token`) values ('c1a7491d4fd5e0e934ba4152759f74b6','¬í\0sr\0Corg.springframework.security.oauth2.common.DefaultOAuth2AccessToken²6$úÎ\0L\0additionalInformationt\0Ljava/util/Map;L\0\nexpirationt\0Ljava/util/Date;L\0refreshTokent\0?Lorg/springframework/security/oauth2/common/OAuth2RefreshToken;L\0scopet\0Ljava/util/Set;L\0	tokenTypet\0Ljava/lang/String;L\0valueq\0~\0xpsr\0java.util.Collections$EmptyMapY6…ZÜçĞ\0\0xpsr\0java.util.DatehjKYt\0\0xpw\0\0yŠ.üÚxsr\0Lorg.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken/ßGcĞÉ·\0L\0\nexpirationq\0~\0xr\0Dorg.springframework.security.oauth2.common.DefaultOAuth2RefreshTokensá\ncTÔ^\0L\0valueq\0~\0xpt\0$c502b511-4c31-43dd-ae4e-1267f73a5e10sq\0~\0	w\0\0z\"\Z–Øxsr\0%java.util.Collections$UnmodifiableSet€’Ñ›€U\0\0xr\0,java.util.Collections$UnmodifiableCollectionB\0€Ë^÷\0L\0ct\0Ljava/util/Collection;xpsr\0java.util.LinkedHashSetØl×Z•İ*\0\0xr\0java.util.HashSetºD…•–¸·4\0\0xpw\0\0\0?@\0\0\0\0\0t\0readt\0writext\0bearert\0$61e5dc63-4935-48dc-ab3c-1005b243b2cf','2ffb986f99ad974087d5757b7ccd0ac6','admin','client01','¬í\0sr\0Aorg.springframework.security.oauth2.provider.OAuth2Authentication½@bR\0L\0\rstoredRequestt\0<Lorg/springframework/security/oauth2/provider/OAuth2Request;L\0userAuthenticationt\02Lorg/springframework/security/core/Authentication;xr\0Gorg.springframework.security.authentication.AbstractAuthenticationTokenÓª(~nGd\0Z\0\rauthenticatedL\0authoritiest\0Ljava/util/Collection;L\0detailst\0Ljava/lang/Object;xp\0sr\0&java.util.Collections$UnmodifiableListü%1µì\0L\0listt\0Ljava/util/List;xr\0,java.util.Collections$UnmodifiableCollectionB\0€Ë^÷\0L\0cq\0~\0xpsr\0java.util.ArrayListxÒ™Ça\0I\0sizexp\0\0\0w\0\0\0sr\0Borg.springframework.security.core.authority.SimpleGrantedAuthority\0\0\0\0\0\0\0L\0rolet\0Ljava/lang/String;xpt\0\nROLE_ADMINxq\0~\0psr\0:org.springframework.security.oauth2.provider.OAuth2Request\0\0\0\0\0\0\0\0Z\0approvedL\0authoritiesq\0~\0L\0\nextensionst\0Ljava/util/Map;L\0redirectUriq\0~\0L\0refresht\0;Lorg/springframework/security/oauth2/provider/TokenRequest;L\0resourceIdst\0Ljava/util/Set;L\0\rresponseTypesq\0~\0xr\08org.springframework.security.oauth2.provider.BaseRequest6(z>£qi½\0L\0clientIdq\0~\0L\0requestParametersq\0~\0L\0scopeq\0~\0xpt\0client01sr\0%java.util.Collections$UnmodifiableMapñ¥¨ştõB\0L\0mq\0~\0xpsr\0java.util.HashMapÚÁÃ`Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\0w\0\0\0\0\0\0t\0\rresponse_typet\0codet\0\rclient_secrett\0llw1123t\0codet\07a94m5t\0\ngrant_typet\0authorization_codet\0	client_idt\0client01xsr\0%java.util.Collections$UnmodifiableSet€’Ñ›€U\0\0xq\0~\0	sr\0java.util.LinkedHashSetØl×Z•İ*\0\0xr\0java.util.HashSetºD…•–¸·4\0\0xpw\0\0\0?@\0\0\0\0\0t\0readt\0writexsq\0~\0)w\0\0\0?@\0\0\0\0\0sq\0~\0\rt\0ROLE_ANYxsq\0~\0\Z?@\0\0\0\0\0\0w\0\0\0\0\0\0\0xt\0https://www.baidu.compsq\0~\0)w\0\0\0?@\0\0\0\0\0t\0resource-01xsq\0~\0)w\0\0\0?@\0\0\0\0\0q\0~\0xsr\0Oorg.springframework.security.authentication.UsernamePasswordAuthenticationToken\0\0\0\0\0\0\0L\0credentialsq\0~\0L\0	principalq\0~\0xq\0~\0sq\0~\0sq\0~\0\0\0\0w\0\0\0q\0~\0xq\0~\08sr\0Horg.springframework.security.web.authentication.WebAuthenticationDetails\0\0\0\0\0\0\0L\0\rremoteAddressq\0~\0L\0	sessionIdq\0~\0xpt\00:0:0:0:0:0:0:1t\0 8DDBD9F78835BB10B5E78D1D43138614psr\02org.springframework.security.core.userdetails.User\0\0\0\0\0\0\0Z\0accountNonExpiredZ\0accountNonLockedZ\0credentialsNonExpiredZ\0enabledL\0authoritiesq\0~\0L\0passwordq\0~\0L\0usernameq\0~\0xpsq\0~\0&sr\0java.util.TreeSetİ˜P“•í‡[\0\0xpsr\0Forg.springframework.security.core.userdetails.User$AuthorityComparator\0\0\0\0\0\0\0\0xpw\0\0\0q\0~\0xpt\0admin','54051a57d43efaded91f1effa2300e51'),('9563c965f89ab7143893a7e52b2ba1e0','¬í\0sr\0Corg.springframework.security.oauth2.common.DefaultOAuth2AccessToken²6$úÎ\0L\0additionalInformationt\0Ljava/util/Map;L\0\nexpirationt\0Ljava/util/Date;L\0refreshTokent\0?Lorg/springframework/security/oauth2/common/OAuth2RefreshToken;L\0scopet\0Ljava/util/Set;L\0	tokenTypet\0Ljava/lang/String;L\0valueq\0~\0xpsr\0java.util.Collections$EmptyMapY6…ZÜçĞ\0\0xpsr\0java.util.DatehjKYt\0\0xpw\0\0y‰ëAúxsr\0Lorg.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken/ßGcĞÉ·\0L\0\nexpirationq\0~\0xr\0Dorg.springframework.security.oauth2.common.DefaultOAuth2RefreshTokensá\ncTÔ^\0L\0valueq\0~\0xpt\0$4827c1ab-bf8f-4d00-b7bb-919b11463285sq\0~\0	w\0\0z!ÖÛúxsr\0%java.util.Collections$UnmodifiableSet€’Ñ›€U\0\0xr\0,java.util.Collections$UnmodifiableCollectionB\0€Ë^÷\0L\0ct\0Ljava/util/Collection;xpsr\0java.util.LinkedHashSetØl×Z•İ*\0\0xr\0java.util.HashSetºD…•–¸·4\0\0xpw\0\0\0?@\0\0\0\0\0t\0readt\0writet\0anyxt\0bearert\0$2ed5d6d1-6947-45eb-8d83-7b19116d18f3','4d8c669725a5d85ba104c6cdf7658b95','admin','client02','¬í\0sr\0Aorg.springframework.security.oauth2.provider.OAuth2Authentication½@bR\0L\0\rstoredRequestt\0<Lorg/springframework/security/oauth2/provider/OAuth2Request;L\0userAuthenticationt\02Lorg/springframework/security/core/Authentication;xr\0Gorg.springframework.security.authentication.AbstractAuthenticationTokenÓª(~nGd\0Z\0\rauthenticatedL\0authoritiest\0Ljava/util/Collection;L\0detailst\0Ljava/lang/Object;xp\0sr\0&java.util.Collections$UnmodifiableListü%1µì\0L\0listt\0Ljava/util/List;xr\0,java.util.Collections$UnmodifiableCollectionB\0€Ë^÷\0L\0cq\0~\0xpsr\0java.util.ArrayListxÒ™Ça\0I\0sizexp\0\0\0w\0\0\0sr\0Borg.springframework.security.core.authority.SimpleGrantedAuthority\0\0\0\0\0\0\0L\0rolet\0Ljava/lang/String;xpt\0\nROLE_ADMINxq\0~\0psr\0:org.springframework.security.oauth2.provider.OAuth2Request\0\0\0\0\0\0\0\0Z\0approvedL\0authoritiesq\0~\0L\0\nextensionst\0Ljava/util/Map;L\0redirectUriq\0~\0L\0refresht\0;Lorg/springframework/security/oauth2/provider/TokenRequest;L\0resourceIdst\0Ljava/util/Set;L\0\rresponseTypesq\0~\0xr\08org.springframework.security.oauth2.provider.BaseRequest6(z>£qi½\0L\0clientIdq\0~\0L\0requestParametersq\0~\0L\0scopeq\0~\0xpt\0client02sr\0%java.util.Collections$UnmodifiableMapñ¥¨ştõB\0L\0mq\0~\0xpsr\0java.util.HashMapÚÁÃ`Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\0w\0\0\0\0\0\0t\0\rresponse_typet\0codet\0\rclient_secrett\0llw1123t\0codet\0JJeXfDt\0\ngrant_typet\0authorization_codet\0	client_idt\0client02xsr\0%java.util.Collections$UnmodifiableSet€’Ñ›€U\0\0xq\0~\0	sr\0java.util.LinkedHashSetØl×Z•İ*\0\0xr\0java.util.HashSetºD…•–¸·4\0\0xpw\0\0\0?@\0\0\0\0\0t\0readt\0writet\0anyxsq\0~\0)w\0\0\0?@\0\0\0\0\0\0xsq\0~\0\Z?@\0\0\0\0\0\0w\0\0\0\0\0\0\0xt\0https://www.baidu.compsq\0~\0)w\0\0\0?@\0\0\0\0\0t\0resource-01xsq\0~\0)w\0\0\0?@\0\0\0\0\0q\0~\0xsr\0Oorg.springframework.security.authentication.UsernamePasswordAuthenticationToken\0\0\0\0\0\0\0L\0credentialsq\0~\0L\0	principalq\0~\0xq\0~\0sq\0~\0sq\0~\0\0\0\0w\0\0\0q\0~\0xq\0~\07sr\0Horg.springframework.security.web.authentication.WebAuthenticationDetails\0\0\0\0\0\0\0L\0\rremoteAddressq\0~\0L\0	sessionIdq\0~\0xpt\00:0:0:0:0:0:0:1t\0 E7EE59BC7E9CE33D0E4A009FE3C643B9psr\02org.springframework.security.core.userdetails.User\0\0\0\0\0\0\0Z\0accountNonExpiredZ\0accountNonLockedZ\0credentialsNonExpiredZ\0enabledL\0authoritiesq\0~\0L\0passwordq\0~\0L\0usernameq\0~\0xpsq\0~\0&sr\0java.util.TreeSetİ˜P“•í‡[\0\0xpsr\0Forg.springframework.security.core.userdetails.User$AuthorityComparator\0\0\0\0\0\0\0\0xpw\0\0\0q\0~\0xpt\0admin','385cb3289eb3905f9ed52035e7f66b7c');

/*Table structure for table `oauth_approvals` */

DROP TABLE IF EXISTS `oauth_approvals`;

CREATE TABLE `oauth_approvals` (
  `userId` varchar(256) DEFAULT NULL COMMENT 'ç™»å½•çš„ç”¨æˆ·å',
  `clientId` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯ID',
  `scope` varchar(256) DEFAULT NULL COMMENT 'ç”³è¯·çš„æƒé™',
  `status` varchar(10) DEFAULT NULL COMMENT 'çŠ¶æ€(Approveæˆ–Deny)',
  `expiresAt` datetime DEFAULT NULL COMMENT 'è¿‡æœŸæ—¶é—´',
  `lastModifiedAt` datetime DEFAULT NULL COMMENT 'æœ€ç»ˆä¿®æ”¹æ—¶é—´'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='æˆæƒè®°å½•';

/*Data for the table `oauth_approvals` */

insert  into `oauth_approvals`(`userId`,`clientId`,`scope`,`status`,`expiresAt`,`lastModifiedAt`) values ('admin','client02','write','APPROVED','2021-06-20 09:15:46','2021-05-20 09:15:46'),('admin','client02','read','APPROVED','2021-06-20 09:15:46','2021-05-20 09:15:46'),('admin','client02','any','APPROVED','2021-06-20 09:15:46','2021-05-20 09:15:46'),('admin','client01','write','APPROVED','2021-06-20 10:29:48','2021-05-20 10:29:48'),('admin','client01','read','APPROVED','2021-06-20 10:29:48','2021-05-20 10:29:48');

/*Table structure for table `oauth_client_details` */

DROP TABLE IF EXISTS `oauth_client_details`;

CREATE TABLE `oauth_client_details` (
  `client_id` varchar(128) NOT NULL COMMENT 'å®¢æˆ·ç«¯ID',
  `resource_ids` varchar(256) DEFAULT NULL COMMENT 'èµ„æºIDé›†åˆï¼Œå¤šä¸ªèµ„æºæ—¶ç”¨è‹±æ–‡é€—å·åˆ†éš”',
  `client_secret` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯å¯†åŒ™',
  `scope` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯ç”³è¯·çš„æƒé™èŒƒå›´',
  `authorized_grant_types` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯æ”¯æŒçš„grant_type',
  `web_server_redirect_uri` varchar(256) DEFAULT NULL COMMENT 'é‡å®šå‘URI',
  `authorities` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯æ‰€æ‹¥æœ‰çš„SpringSecurityçš„æƒé™å€¼ï¼Œå¤šä¸ªç”¨è‹±æ–‡é€—å·åˆ†éš”',
  `access_token_validity` int(11) DEFAULT NULL COMMENT 'è®¿é—®ä»¤ç‰Œæœ‰æ•ˆæ—¶é—´å€¼(å•ä½ç§’é»˜è®¤12å°æ—¶)',
  `refresh_token_validity` int(11) DEFAULT NULL COMMENT 'æ›´æ–°ä»¤ç‰Œæœ‰æ•ˆæ—¶é—´å€¼(å•ä½ç§’é»˜è®¤30å¤©)',
  `additional_information` varchar(4096) DEFAULT NULL COMMENT 'é¢„ç•™å­—æ®µ',
  `autoapprove` varchar(256) DEFAULT NULL COMMENT 'ç”¨æˆ·æ˜¯å¦è‡ªåŠ¨Approvalæ“ä½œ',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='å®¢æˆ·ç«¯ä¿¡æ¯';

/*Data for the table `oauth_client_details` */

insert  into `oauth_client_details`(`client_id`,`resource_ids`,`client_secret`,`scope`,`authorized_grant_types`,`web_server_redirect_uri`,`authorities`,`access_token_validity`,`refresh_token_validity`,`additional_information`,`autoapprove`) values ('client01','resource-01','$2a$10$mggZkFWqnIcR0g1wYsQSJuuY/hzIfZ.LdbVIK4EbOiNEEOk7PynXm','read,write','client_credentials,implicit,authorization_code,refresh_token,password','https://www.baidu.com','ROLE_ANY',86400,1296000,NULL,'false'),('client02','resource-01','$2a$10$mggZkFWqnIcR0g1wYsQSJuuY/hzIfZ.LdbVIK4EbOiNEEOk7PynXm','read,write,any','client_credentials,implicit,authorization_code,refresh_token,password','https://www.baidu.com',NULL,86400,1296000,NULL,'false');

/*Table structure for table `oauth_client_token` */

DROP TABLE IF EXISTS `oauth_client_token`;

CREATE TABLE `oauth_client_token` (
  `token_id` varchar(256) DEFAULT NULL COMMENT 'MD5åŠ å¯†çš„access_tokenå€¼',
  `token` blob COMMENT 'OAuth2AccessToken.javaå¯¹è±¡åºåˆ—åŒ–åçš„äºŒè¿›åˆ¶æ•°æ®',
  `authentication_id` varchar(128) NOT NULL COMMENT 'MD5åŠ å¯†è¿‡çš„username,client_id,scope',
  `user_name` varchar(256) DEFAULT NULL COMMENT 'ç™»å½•çš„ç”¨æˆ·å',
  `client_id` varchar(256) DEFAULT NULL COMMENT 'å®¢æˆ·ç«¯ID',
  PRIMARY KEY (`authentication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='è¯¥è¡¨ç”¨äºåœ¨å®¢æˆ·ç«¯ç³»ç»Ÿä¸­å­˜å‚¨ä»æœåŠ¡ç«¯è·å–çš„tokenæ•°æ®';

/*Data for the table `oauth_client_token` */

/*Table structure for table `oauth_code` */

DROP TABLE IF EXISTS `oauth_code`;

CREATE TABLE `oauth_code` (
  `code` varchar(256) DEFAULT NULL COMMENT 'æˆæƒç (æœªåŠ å¯†)',
  `authentication` blob COMMENT 'AuthorizationRequestHolder.javaå¯¹è±¡åºåˆ—åŒ–åçš„äºŒè¿›åˆ¶æ•°æ®'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='æˆæƒç ';

/*Data for the table `oauth_code` */

/*Table structure for table `oauth_refresh_token` */

DROP TABLE IF EXISTS `oauth_refresh_token`;

CREATE TABLE `oauth_refresh_token` (
  `token_id` varchar(256) DEFAULT NULL COMMENT 'MD5åŠ å¯†è¿‡çš„refresh_tokençš„å€¼',
  `token` blob COMMENT 'OAuth2RefreshToken.javaå¯¹è±¡åºåˆ—åŒ–åçš„äºŒè¿›åˆ¶æ•°æ®',
  `authentication` blob COMMENT 'OAuth2Authentication.javaå¯¹è±¡åºåˆ—åŒ–åçš„äºŒè¿›åˆ¶æ•°æ®'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='æ›´æ–°ä»¤ç‰Œ';

/*Data for the table `oauth_refresh_token` */

insert  into `oauth_refresh_token`(`token_id`,`token`,`authentication`) values ('385cb3289eb3905f9ed52035e7f66b7c','¬í\0sr\0Lorg.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken/ßGcĞÉ·\0L\0\nexpirationt\0Ljava/util/Date;xr\0Dorg.springframework.security.oauth2.common.DefaultOAuth2RefreshTokensá\ncTÔ^\0L\0valuet\0Ljava/lang/String;xpt\0$4827c1ab-bf8f-4d00-b7bb-919b11463285sr\0java.util.DatehjKYt\0\0xpw\0\0z!ÖÛúx','¬í\0sr\0Aorg.springframework.security.oauth2.provider.OAuth2Authentication½@bR\0L\0\rstoredRequestt\0<Lorg/springframework/security/oauth2/provider/OAuth2Request;L\0userAuthenticationt\02Lorg/springframework/security/core/Authentication;xr\0Gorg.springframework.security.authentication.AbstractAuthenticationTokenÓª(~nGd\0Z\0\rauthenticatedL\0authoritiest\0Ljava/util/Collection;L\0detailst\0Ljava/lang/Object;xp\0sr\0&java.util.Collections$UnmodifiableListü%1µì\0L\0listt\0Ljava/util/List;xr\0,java.util.Collections$UnmodifiableCollectionB\0€Ë^÷\0L\0cq\0~\0xpsr\0java.util.ArrayListxÒ™Ça\0I\0sizexp\0\0\0w\0\0\0sr\0Borg.springframework.security.core.authority.SimpleGrantedAuthority\0\0\0\0\0\0\0L\0rolet\0Ljava/lang/String;xpt\0\nROLE_ADMINxq\0~\0psr\0:org.springframework.security.oauth2.provider.OAuth2Request\0\0\0\0\0\0\0\0Z\0approvedL\0authoritiesq\0~\0L\0\nextensionst\0Ljava/util/Map;L\0redirectUriq\0~\0L\0refresht\0;Lorg/springframework/security/oauth2/provider/TokenRequest;L\0resourceIdst\0Ljava/util/Set;L\0\rresponseTypesq\0~\0xr\08org.springframework.security.oauth2.provider.BaseRequest6(z>£qi½\0L\0clientIdq\0~\0L\0requestParametersq\0~\0L\0scopeq\0~\0xpt\0client02sr\0%java.util.Collections$UnmodifiableMapñ¥¨ştõB\0L\0mq\0~\0xpsr\0java.util.HashMapÚÁÃ`Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\0w\0\0\0\0\0\0t\0\rresponse_typet\0codet\0\rclient_secrett\0llw1123t\0codet\0fyqzZjt\0\ngrant_typet\0authorization_codet\0	client_idt\0client02xsr\0%java.util.Collections$UnmodifiableSet€’Ñ›€U\0\0xq\0~\0	sr\0java.util.LinkedHashSetØl×Z•İ*\0\0xr\0java.util.HashSetºD…•–¸·4\0\0xpw\0\0\0?@\0\0\0\0\0t\0readt\0writet\0anyxsq\0~\0)w\0\0\0?@\0\0\0\0\0\0xsq\0~\0\Z?@\0\0\0\0\0\0w\0\0\0\0\0\0\0xt\0https://www.baidu.compsq\0~\0)w\0\0\0?@\0\0\0\0\0t\0resource-02xsq\0~\0)w\0\0\0?@\0\0\0\0\0q\0~\0xsr\0Oorg.springframework.security.authentication.UsernamePasswordAuthenticationToken\0\0\0\0\0\0\0L\0credentialsq\0~\0L\0	principalq\0~\0xq\0~\0sq\0~\0sq\0~\0\0\0\0w\0\0\0q\0~\0xq\0~\07sr\0Horg.springframework.security.web.authentication.WebAuthenticationDetails\0\0\0\0\0\0\0L\0\rremoteAddressq\0~\0L\0	sessionIdq\0~\0xpt\00:0:0:0:0:0:0:1t\0 E7EE59BC7E9CE33D0E4A009FE3C643B9psr\02org.springframework.security.core.userdetails.User\0\0\0\0\0\0\0Z\0accountNonExpiredZ\0accountNonLockedZ\0credentialsNonExpiredZ\0enabledL\0authoritiesq\0~\0L\0passwordq\0~\0L\0usernameq\0~\0xpsq\0~\0&sr\0java.util.TreeSetİ˜P“•í‡[\0\0xpsr\0Forg.springframework.security.core.userdetails.User$AuthorityComparator\0\0\0\0\0\0\0\0xpw\0\0\0q\0~\0xpt\0admin'),('54051a57d43efaded91f1effa2300e51','¬í\0sr\0Lorg.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken/ßGcĞÉ·\0L\0\nexpirationt\0Ljava/util/Date;xr\0Dorg.springframework.security.oauth2.common.DefaultOAuth2RefreshTokensá\ncTÔ^\0L\0valuet\0Ljava/lang/String;xpt\0$c502b511-4c31-43dd-ae4e-1267f73a5e10sr\0java.util.DatehjKYt\0\0xpw\0\0z\"\Z–Øx','¬í\0sr\0Aorg.springframework.security.oauth2.provider.OAuth2Authentication½@bR\0L\0\rstoredRequestt\0<Lorg/springframework/security/oauth2/provider/OAuth2Request;L\0userAuthenticationt\02Lorg/springframework/security/core/Authentication;xr\0Gorg.springframework.security.authentication.AbstractAuthenticationTokenÓª(~nGd\0Z\0\rauthenticatedL\0authoritiest\0Ljava/util/Collection;L\0detailst\0Ljava/lang/Object;xp\0sr\0&java.util.Collections$UnmodifiableListü%1µì\0L\0listt\0Ljava/util/List;xr\0,java.util.Collections$UnmodifiableCollectionB\0€Ë^÷\0L\0cq\0~\0xpsr\0java.util.ArrayListxÒ™Ça\0I\0sizexp\0\0\0w\0\0\0sr\0Borg.springframework.security.core.authority.SimpleGrantedAuthority\0\0\0\0\0\0\0L\0rolet\0Ljava/lang/String;xpt\0\nROLE_ADMINxq\0~\0psr\0:org.springframework.security.oauth2.provider.OAuth2Request\0\0\0\0\0\0\0\0Z\0approvedL\0authoritiesq\0~\0L\0\nextensionst\0Ljava/util/Map;L\0redirectUriq\0~\0L\0refresht\0;Lorg/springframework/security/oauth2/provider/TokenRequest;L\0resourceIdst\0Ljava/util/Set;L\0\rresponseTypesq\0~\0xr\08org.springframework.security.oauth2.provider.BaseRequest6(z>£qi½\0L\0clientIdq\0~\0L\0requestParametersq\0~\0L\0scopeq\0~\0xpt\0client01sr\0%java.util.Collections$UnmodifiableMapñ¥¨ştõB\0L\0mq\0~\0xpsr\0java.util.HashMapÚÁÃ`Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\0w\0\0\0\0\0\0t\0\rresponse_typet\0codet\0\rclient_secrett\0llw1123t\0codet\0Z8PlOAt\0\ngrant_typet\0authorization_codet\0	client_idt\0client01xsr\0%java.util.Collections$UnmodifiableSet€’Ñ›€U\0\0xq\0~\0	sr\0java.util.LinkedHashSetØl×Z•İ*\0\0xr\0java.util.HashSetºD…•–¸·4\0\0xpw\0\0\0?@\0\0\0\0\0t\0readt\0writexsq\0~\0)w\0\0\0?@\0\0\0\0\0sq\0~\0\rt\0ROLE_ANYxsq\0~\0\Z?@\0\0\0\0\0\0w\0\0\0\0\0\0\0xt\0https://www.baidu.compsq\0~\0)w\0\0\0?@\0\0\0\0\0t\0resource-01xsq\0~\0)w\0\0\0?@\0\0\0\0\0q\0~\0xsr\0Oorg.springframework.security.authentication.UsernamePasswordAuthenticationToken\0\0\0\0\0\0\0L\0credentialsq\0~\0L\0	principalq\0~\0xq\0~\0sq\0~\0sq\0~\0\0\0\0w\0\0\0q\0~\0xq\0~\08sr\0Horg.springframework.security.web.authentication.WebAuthenticationDetails\0\0\0\0\0\0\0L\0\rremoteAddressq\0~\0L\0	sessionIdq\0~\0xpt\00:0:0:0:0:0:0:1t\0 A576AC275C03D505246B3811F50239DCpsr\02org.springframework.security.core.userdetails.User\0\0\0\0\0\0\0Z\0accountNonExpiredZ\0accountNonLockedZ\0credentialsNonExpiredZ\0enabledL\0authoritiesq\0~\0L\0passwordq\0~\0L\0usernameq\0~\0xpsq\0~\0&sr\0java.util.TreeSetİ˜P“•í‡[\0\0xpsr\0Forg.springframework.security.core.userdetails.User$AuthorityComparator\0\0\0\0\0\0\0\0xpw\0\0\0q\0~\0xpt\0admin');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
