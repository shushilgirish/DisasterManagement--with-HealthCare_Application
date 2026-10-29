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
-- Table structure for table `searchreq`
--

DROP TABLE IF EXISTS `searchreq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `searchreq` (
  `customerid` varchar(50) NOT NULL,
  `decription` text,
  `userid` varchar(50) DEFAULT NULL,
  `Subject` varchar(50) DEFAULT NULL,
  `Location` varchar(50) DEFAULT NULL,
  `Nameofuser` varchar(50) DEFAULT NULL,
  `Nameofcustomer` varchar(50) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `searchreq`
--

LOCK TABLES `searchreq` WRITE;
/*!40000 ALTER TABLE `searchreq` DISABLE KEYS */;
INSERT INTO `searchreq` VALUES ('54644','Need assistance with Evacuation','User1','House Evacuation-Floods','Boston','John Doe','Bob Johnson','2023-01-15','NA'),('50565','Request for Food Supplies','User2','Need Food Supplies','Boston','Jane Smith','David Brown','2023-01-20','NA'),('57676','Help with evacuation of people stuck in floods','User3','Rescue','Los Angeles','Mike Johnson','Carter Evans','2023-01-10','NA'),('35644','Need assistance with Evacuation','User4','Rescue','Los Angeles','Emily Davis','Bob Johnson','2023-01-05','INPROGRESS'),('56545','Need assistance with Evacuation','User5','Technology Assistance','Los Angeles','Chris Evans','Olivia Lee','2023-01-12','COMPLETE'),('64565','Need assistance with Evacuation','User6','Transportation Support','New York','Olivia Brown','Michael Davis','2023-06-18','COMPLETE'),('45654','Need assistance with Evacuation','User7','Evacuation Assistance','New York','Michael Lee','Alice lee','2023-01-25','INPROGRESS');
/*!40000 ALTER TABLE `searchreq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 19:18:55
