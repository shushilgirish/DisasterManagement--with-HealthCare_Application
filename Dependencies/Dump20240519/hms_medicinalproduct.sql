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
-- Table structure for table `medicinalproduct`
--

DROP TABLE IF EXISTS `medicinalproduct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicinalproduct` (
  `productid` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `medicine_type` varchar(50) NOT NULL,
  `expiry_date` date NOT NULL,
  `supplier_id` int DEFAULT NULL,
  PRIMARY KEY (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicinalproduct`
--

LOCK TABLES `medicinalproduct` WRITE;
/*!40000 ALTER TABLE `medicinalproduct` DISABLE KEYS */;
INSERT INTO `medicinalproduct` VALUES (1,'Paracetamol',5,'Pain Relief','2023-12-31',5),(2,'Amoxicillin',10,'Antibiotic','2024-06-30',1),(3,'Omeprazole',8,'Gastric Medication','2023-09-15',4),(4,'Atorvastatin',15,'Cholesterol Control','2025-03-20',3),(5,'Ibuprofen',7,'Anti-Inflammatory','2023-11-28',5),(6,'Metformin',12,'Diabetes Medication','2024-05-10',2),(7,'Ciprofloxacin',9,'Antibiotic','2024-08-18',4),(8,'Lisinopril',11,'Blood Pressure Control','2023-10-22',4),(9,'Aspirin',6,'Cardiovascular Health','2023-12-31',3),(10,'Diazepam',14,'Anxiolytic','2024-04-12',2);
/*!40000 ALTER TABLE `medicinalproduct` ENABLE KEYS */;
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
