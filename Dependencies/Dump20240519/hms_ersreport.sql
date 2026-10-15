-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ersreport`
--

DROP TABLE IF EXISTS `ersreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ersreport` (
  `ersid` bigint NOT NULL,
  `Diaster_id` int NOT NULL,
  `number_ofpplaffected` double DEFAULT NULL,
  `number_ofchildaffected` double DEFAULT NULL,
  `propertiy_dmg` double DEFAULT NULL,
  `number_ofpplcriticalcndition` double DEFAULT NULL,
  `number_ofminorinjuries` double DEFAULT NULL,
  `startdatetime` varchar(50) DEFAULT NULL,
  `enddatetime` varchar(50) DEFAULT NULL,
  `magnitude` float DEFAULT NULL,
  `numberpplmisssing` double DEFAULT NULL,
  `Severity` varchar(50) DEFAULT NULL,
  `Description` text,
  `immediateadmit` double DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Assignedtologid` varchar(50) DEFAULT NULL,
  `logstatus` varchar(50) DEFAULT NULL,
  `disastertype` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ersreport`
--

LOCK TABLES `ersreport` WRITE;
/*!40000 ALTER TABLE `ersreport` DISABLE KEYS */;
INSERT INTO `ersreport` VALUES (422434,1,270,50,34500,2,10,'2023-01-01 10:00 AM','2023-01-01 02:00 PM',5.5,2,'Severity2','A severe earthquake hit Boston City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',30,'COMPLETE','NA','NA','Earthquake','Boston','Massachusetts'),(422434,2,160,50,15000,10,10,'2023-01-01 10:00 AM','2023-01-01 02:00 PM',4.5,8,'Severity2','A severe Tsunami hit Boston City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',30,'INPROGRESS','NA','NA','Tsunami','Boston','Massachusetts'),(423404,4,200,50,14200,5,11,'2023-01-01 10:00 AM','2023-01-01 02:00 PM',9.5,1,'Severity2','A severe earthquake hit New York City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',31,'COMPLETE','NA','NA','Earthquake','New York City','New York'),(432344,5,390,50,14300,7,11,'2023-01-01 10:00 AM','2023-01-01 02:00 PM',10.5,5,'Severity1','A severe Tsunami hit Los Angeles City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',20,'COMPLETE','NA','NA','Tsunami','Los Angeles','California'),(423404,8,200,50,35500,20,11,'2023-11-01 10:00 AM','2023-11-01 02:00 PM',3.5,7,'Severity1','A severe Cyclone hit New York City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',20,'INPROGRESS','NA','NA','Earthquake','New York City','New York'),(423404,9,159,50,32443,2,12,'2023-11-01 10:00 AM','2023-11-01 02:00 PM',6.5,5,'Severity3','A severe Tsunami hit New York City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',10,'COMPLETE','NA','NA','Tsunami','New York City','New York'),(432344,10,120,50,12454,12,10,'2023-23-01 10:00 AM','2023-23-01 02:00 PM',7.5,18,'NA','A severe Cyclone hit Los Angeles causing widespread devastation. Many buildings collapsed, and numerous people were injured.',15,'COMPLETE','NA','NA','Cyclone','Los Angeles','California'),(432344,11,240,50,13444,5,14,'2023-01-07 10:00 AM','2023-01-07 02:00 PM',9.5,8,'NA','A severe Tsunami hit Los Angeles City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',12,'INPROGRESS','NA','NA','Tsunami','Los Angeles','California'),(432344,12,100,50,13323,7,11,'2023-01-03 10:00 AM','2023-01-03 02:00 PM',6.5,7,'NA','A severe Forest-Fire hit Los Angeles City causing widespread devastation. Many buildings collapsed, and numerous people were injured.',20,'INPROGRESS','NA','NA','Forest-Fire','Los Angeles','California');
/*!40000 ALTER TABLE `ersreport` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 19:18:58
