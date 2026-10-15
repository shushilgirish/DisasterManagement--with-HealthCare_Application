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
-- Table structure for table `requestin`
--

DROP TABLE IF EXISTS `requestin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requestin` (
  `id` int DEFAULT NULL,
  `Reason` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL,
  `Requestedby` varchar(255) DEFAULT NULL,
  `amountRaised` decimal(10,2) DEFAULT NULL,
  `Requestedfrom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requestin`
--

LOCK TABLES `requestin` WRITE;
/*!40000 ALTER TABLE `requestin` DISABLE KEYS */;
INSERT INTO `requestin` VALUES (3423443,'Charity trust','Funds Required tho help people in California during Natural disaster',10000.50,'ONGOING','Bob Johnson',10000.50,'Requested from 1'),(3423443,'Funding event','Funds Required tho help people in California during Natural disaster',7500.30,'COMPLETE','Bob Johnson',30.15,'Requested from 2'),(2335358,'Give a Hand','Funds Required tho help people in Boston during Natural disaster',22100.50,'ONGOING','Bob Johnson',12200.50,'Requested from 1'),(2442333,'Rise to Help','Funds Required tho help people in New York during Natural disaster',7500.30,'COMPLETE','Jane Smith',30.15,'Requested from 2'),(2442333,'Charity trust','Funds Required tho help people in New York during Natural disaster',10000.50,'ONGOING','Jane Smith',10000.50,'Requested from 1');
/*!40000 ALTER TABLE `requestin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 19:18:57
