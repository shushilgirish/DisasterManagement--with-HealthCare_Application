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
-- Table structure for table `volunteers`
--

DROP TABLE IF EXISTS `volunteers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteers` (
  `idvol` int DEFAULT NULL,
  `eventTitle` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Location` varchar(255) DEFAULT NULL,
  `volunteersRequired` int DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL,
  `nopplSignedUp` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteers`
--

LOCK TABLES `volunteers` WRITE;
/*!40000 ALTER TABLE `volunteers` DISABLE KEYS */;
INSERT INTO `volunteers` VALUES (2335358,'Volunteer for Greater City','Volunters Required to help people in Boston','2023-01-15','Boston',10,'COMPLETE',5),(2335358,'Give a Hand','Volunters Required tho help people in Boston','2023-02-20','Boston',15,'INPROGRESS',8),(2442333,'Rise to Help','Volunters Required tho help people in New York','2023-01-15','New York',10,'COMPLETE',5),(2442333,'Rise up','Volunters Required tho help people in New York','2023-02-20','New York',15,'INPROGRESS',8),(3423443,'Help on way','Volunters Required tho help people in California','2023-01-15','California',10,'COMPLETE',5),(3423443,'Volunteer event','Volunters Required to help people in California','2023-01-15','California',10,'INPROGRESS',5),(2335358,'Volunteer','Volunters Required to help people in Boston','2023-01-15','Boston',10,'INPROGRESS',5),(2335358,'Rise up together','Volunters Required tho help people in Boston','2023-02-20','Boston',15,'INPROGRESS',8),(2442333,'March together','Volunters Required tho help people in New York','2023-01-15','New York',10,'INPROGRESS',5),(2442333,'Walk forward','Volunters Required tho help people in New York','2023-02-20','New York',15,'INPROGRESS',8);
/*!40000 ALTER TABLE `volunteers` ENABLE KEYS */;
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
