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
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('ITM1000','MOBIL-CALTEX-BREAK OIL 25 ML',250,10,1,1,'2017-09-03','19:47:01',1,NULL,NULL,NULL,'BREAK OIL 25 ML CAN','SUB1000','SLT1000','UOM1000','UOM1000','MAN1003',1),('ITM1001','PANDA FULL SERVICE',6500,0,0,1,'2017-09-02','15:11:25',1,NULL,NULL,NULL,'MICRO PANDA FULL SERVICE','SUB1001','SLT1000','UOM1000','UOM1000','MAN1000',1),('ITM1002','PANDA BODY WASH',1200,0,0,1,'2017-09-02','17:30:50',1,NULL,NULL,NULL,'MICRO PANDA BODY WASH','SUB1003','SLT1000','UOM1000','UOM1000','MAN1000',1),('ITM1003','PANDA CARPET WASH',700,0,0,1,'2017-09-02','17:31:32',1,NULL,NULL,NULL,'MICRO PANDA CARPET WASH','SUB1002','SLT1000','UOM1000','UOM1000','MAN1000',1),('ITM1004','PANDA UNDER WASH',1600,0,0,1,'2017-09-03','19:47:42',1,NULL,NULL,NULL,'MICRO PANDA UNDER WASH','SUB1004','SLT1000','UOM1000','UOM1000','MAN1000',2);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-05  0:04:31
