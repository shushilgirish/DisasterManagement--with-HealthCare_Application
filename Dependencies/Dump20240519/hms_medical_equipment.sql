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
-- Table structure for table `medical_equipment`
--

DROP TABLE IF EXISTS `medical_equipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_equipment` (
  `productid` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `deviceType` varchar(50) NOT NULL,
  `supplier_id` int DEFAULT NULL,
  PRIMARY KEY (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_equipment`
--

LOCK TABLES `medical_equipment` WRITE;
/*!40000 ALTER TABLE `medical_equipment` DISABLE KEYS */;
INSERT INTO `medical_equipment` VALUES (1,'Hospital Stretchers',5000,'medicalDevice',2),(2,'Defibrillators',8000,'medicalDevice',3),(3,'Anesthesia Machines',12000,'medicalDevice',4),(4,'Patient Monitors',6000,'medicalDevice',1),(5,'Sterilizers',10000,'medicalDevice',2),(6,'EKG/ECG Machines',7000,'medicalDevice',1),(7,'Surgical Tables',15000,'medicalDevice',3),(8,'Blanket and Fluid Warmers',2000,'medicalDevice',1),(9,'Electrosurgical Units',9000,'medicalDevice',1),(10,'Surgical Lights',3000,'medicalDevice',3);
/*!40000 ALTER TABLE `medical_equipment` ENABLE KEYS */;
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
