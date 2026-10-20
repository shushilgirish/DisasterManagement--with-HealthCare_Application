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
-- Table structure for table `personteam`
--

DROP TABLE IF EXISTS `personteam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personteam` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Age` int DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `Ssn` int DEFAULT NULL,
  `phoneno` bigint DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `State` varchar(50) DEFAULT NULL,
  `Team` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=728935 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personteam`
--

LOCK TABLES `personteam` WRITE;
/*!40000 ALTER TABLE `personteam` DISABLE KEYS */;
INSERT INTO `personteam` VALUES (233442,'John Doe','Password123!2',25,'123 Main St','1998-01-15',123456789,9876543210,'USA','New York','NY','Logistics'),(244413,'Kayle Smith','Securepass@1',30,'456 Oak St','1992-05-20',987654321,6551234567,'USA','Los Angeles','CA','Logistics'),(343244,'Bob Johnson','Mypassword3!',35,'789 Pine St','1987-09-10',555987654,9998887777,'USA','Boston','MA','Logistics'),(422434,'Kent Johnson','Vmyp!1ssword',35,'789 Pine St','1982-09-10',555987654,7998887777,'USA','Boston','MA','Ersteam'),(423404,'Paul Doe','Password123!',25,'123 Main St','1998-01-15',123456789,9876543210,'USA','New York','NY','Ersteam'),(423434,'Roy Johnson','Vmypa#ssword',35,'789 Pine St','1987-09-10',555987654,7998887777,'USA','Boston','MA','Logistics'),(428934,'Joseph Johnson','Vmyp!1ssword',35,'789 Pine St','1982-09-10',555987654,7998887777,'USA','Boston','MA','Ersteam'),(432344,'Jane Smith','Securepass#2',30,'456 Oak St','1992-05-20',987654321,5551234567,'USA','Los Angeles','CA','Ersteam'),(622434,'Clark Johnson','Vmyp!1ssword',35,'789 Pine St','1982-09-10',555987654,7998887777,'USA','Boston','MA','Ersteam1'),(628934,'Bruce Johnson','Vmyp!1ssword',35,'789 Pine St','1982-09-10',555987654,7998887777,'USA','Boston','MA','Ersteam1'),(722434,'Diana Johnson','Vmyp!1ssword',35,'789 Pine St','1982-09-10',555987654,7998887777,'USA','Boston','MA','Ersteam2'),(728934,'Phil Johnson','Vmyp!1ssword',35,'789 Pine St','1982-09-10',555987654,7998887777,'USA','Boston','MA','Ersteam2');
/*!40000 ALTER TABLE `personteam` ENABLE KEYS */;
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
