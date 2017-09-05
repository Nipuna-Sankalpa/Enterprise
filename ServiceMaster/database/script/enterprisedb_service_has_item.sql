-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: enterprisedb
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `service_has_item`
--

LOCK TABLES `service_has_item` WRITE;
/*!40000 ALTER TABLE `service_has_item` DISABLE KEYS */;
INSERT INTO `service_has_item` VALUES ('ITM1000','SVR1001',5,1250,125,1125,'2017-09-02','15:55:19',1,NULL,NULL,NULL,'MOBIL-CALTEX-BREAK OIL 25 ML',1,1),('ITM1000','SVR1002',10,2500,500,2000,'2017-09-02','16:33:41',1,NULL,NULL,NULL,'MOBIL-CALTEX-BREAK OIL 25 ML',2,1),('ITM1001','SVR1003',1,6500,0,6500,'2017-09-02','19:22:11',1,'2017-09-02','00:00:00',1,'PANDA FULL SERVICE',3,2),('ITM1000','SVR1004',1,250,0,250,'2017-09-03','14:00:25',1,'2017-09-03','00:00:00',1,'MOBIL-CALTEX-BREAK OIL 25 ML',4,1),('ITM1002','SVR1004',1,1200,0,1200,'2017-09-03','14:00:25',1,'2017-09-03','00:00:00',1,'PANDA BODY WASH',5,1),('ITM1003','SVR1004',1,700,0,700,'2017-09-03','14:00:25',1,'2017-09-03','00:00:00',1,'PANDA CARPET WASH',6,1),('ITM1004','SVR1004',1,1600,0,1600,'2017-09-03','14:00:25',1,'2017-09-03','00:00:00',1,'PANDA UNDER WASH',7,1),('ITM1000','SVR1003',1,250,0,250,NULL,NULL,NULL,'2017-09-02','15:25:17',1,'MOBIL-CALTEX-BREAK OIL 25 ML',8,1),('ITM1002','SVR1003',1,1200,0,1200,NULL,NULL,NULL,'2017-09-02','15:25:17',1,'PANDA BODY WASH',9,1),('ITM1003','SVR1003',1,700,0,700,NULL,NULL,NULL,'2017-09-02','15:25:17',1,'PANDA CARPET WASH',10,1),('ITM1004','SVR1003',1,1600,0,1600,NULL,NULL,NULL,'2017-09-02','15:25:17',1,'PANDA UNDER WASH',11,1);
/*!40000 ALTER TABLE `service_has_item` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-05  0:04:30
