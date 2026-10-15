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
-- Table structure for table `disastermanagementdirectory`
--

DROP TABLE IF EXISTS `disastermanagementdirectory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disastermanagementdirectory` (
  `disid` int NOT NULL AUTO_INCREMENT,
  `disname` varchar(50) NOT NULL,
  `state_affec` varchar(50) NOT NULL,
  `city_name` varchar(50) NOT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`disid`),
  CONSTRAINT `disastermanagementdirectory_chk_1` CHECK ((`status` in (_utf8mb4'COMPLETE',_utf8mb4'INPROGRESS')))
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disastermanagementdirectory`
--

LOCK TABLES `disastermanagementdirectory` WRITE;
/*!40000 ALTER TABLE `disastermanagementdirectory` DISABLE KEYS */;
INSERT INTO `disastermanagementdirectory` VALUES (1,'Earthquake','Massachusetts','Boston','COMPLETE'),(2,'Tsunami','Massachusetts','Boston','COMPLETE'),(3,'Cyclone','Massachusetts','Boston','INPROGRESS'),(4,'Earthquake','New York','New York City','COMPLETE'),(5,'Tsunami','California','Los Angeles','COMPLETE'),(6,'Earthquake','Massachusetts','Salem','INPROGRESS'),(7,'Tsunami','Massachusetts','Salem','INPROGRESS'),(8,'Earthquake','New York','New York City','COMPLETE'),(9,'Tsunami','New York','New York City','COMPLETE'),(10,'Cyclone','California','Los Angeles','COMPLETE'),(11,'Tsunami','California','Los Angeles','COMPLETE'),(12,'Forest-Fire','California','Los Angeles','COMPLETE');
/*!40000 ALTER TABLE `disastermanagementdirectory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-19 19:18:56
