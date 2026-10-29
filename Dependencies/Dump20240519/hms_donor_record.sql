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
-- Table structure for table `donor_record`
--

DROP TABLE IF EXISTS `donor_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donor_record` (
  `id` int NOT NULL AUTO_INCREMENT,
  `donor_name` varchar(255) NOT NULL,
  `donor_type` varchar(50) DEFAULT NULL,
  `blood_type` varchar(3) DEFAULT NULL,
  `donor_age` int NOT NULL,
  `donor_gender` varchar(1) NOT NULL,
  `health_condition` varchar(4) DEFAULT NULL,
  `organ_donation` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `donor_record_chk_1` CHECK ((`donor_type` in (_utf8mb4'Organ_Donate',_utf8mb4'Blood_Donate'))),
  CONSTRAINT `donor_record_chk_2` CHECK ((`health_condition` in (_utf8mb4'Good',_utf8mb4'Bad')))
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donor_record`
--

LOCK TABLES `donor_record` WRITE;
/*!40000 ALTER TABLE `donor_record` DISABLE KEYS */;
INSERT INTO `donor_record` VALUES (1,'Alice Johnson','Organ_Donate','A+',25,'F','Good','Heart'),(2,'Bob Smith','Blood_Donate','O-',40,'M','Bad','NA'),(3,'Charlie Brown','Organ_Donate','B+',30,'M','Good','Liver'),(4,'Diana White','Blood_Donate','AB-',35,'F','Good','NA'),(5,'Eva Davis','Organ_Donate','A-',28,'F','Bad','Kidney'),(7,'Shushil','Organ_Donate','A+',19,'M','Good','Kidney'),(8,'Shushil','Organ_Donate','A+',25,'M','Good','Kidney'),(9,'sam','Organ_Donate','A+',2,'M','Good','Kidney');
/*!40000 ALTER TABLE `donor_record` ENABLE KEYS */;
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
