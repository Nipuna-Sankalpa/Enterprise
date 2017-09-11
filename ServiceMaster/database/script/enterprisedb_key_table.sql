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
-- Dumping data for table `key_table`
--

LOCK TABLES `key_table` WRITE;
/*!40000 ALTER TABLE `key_table` DISABLE KEYS */;
INSERT INTO `key_table` VALUES (1,'ADD',1002,'Address codes','2017-01-01','12:00:00',1,'2017-09-09','20:50:43',1),(2,'TEL',1002,'Telephone codes','2017-01-01','12:00:00',1,'2017-09-09','20:50:53',1),(3,'BPT',1002,'Business partner codes','2017-01-01','12:00:00',1,'2017-09-09','20:52:07',1),(4,'STO',1001,'Storage','2017-09-09','20:37:13',1,NULL,NULL,NULL),(5,'RAC',1001,'Racks','2017-09-09','20:37:36',1,NULL,NULL,NULL),(6,'SLT',1002,'Rack slots','2017-09-09','20:37:58',1,'2017-09-09','20:38:15',1),(7,'LOC',1003,'Location','2017-09-09','20:38:44',1,'2017-09-09','20:39:12',1),(8,'PRN',1001,'Printer','2017-09-09','20:39:31',1,NULL,NULL,NULL),(9,'CAT',1004,'Category','2017-09-09','20:40:02',1,'2017-09-10','21:02:05',1),(10,'SUB',1007,'Sub Category','2017-09-09','20:47:52',1,'2017-09-10','21:03:18',1),(11,'ITP',1002,'Item type','2017-09-09','20:48:29',1,'2017-09-09','20:48:44',1),(13,'VHT',1001,'Vehicle type','2017-09-09','22:25:22',1,NULL,NULL,NULL),(14,'VEH',1001,'Vehivle','2017-09-09','22:25:50',1,NULL,NULL,NULL),(30,'ITM',1010,'Item codes','2017-09-10','22:40:57',1,'2017-09-10','23:01:33',1),(31,'BOM',1002,'Bill of metirial codes','2017-09-10','23:03:25',1,'2017-09-11','11:27:44',1),(32,'BOI',1006,'Bill of metirial item code','2017-09-10','23:03:57',1,'2017-09-11','11:27:44',1),(33,'SVR',1010,'Service','2017-09-11','10:17:09',1,'2017-09-11','14:20:03',1),(34,'INV',1010,'Invoices','2017-09-11','10:17:23',1,'2017-09-11','14:20:06',1),(35,'PAY',1010,'Payment','2017-09-11','10:17:57',1,'2017-09-11','14:20:18',1),(36,'GRN',1001,'Good receive note','2017-09-11','12:02:33',1,NULL,NULL,NULL);
/*!40000 ALTER TABLE `key_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-11 14:34:17