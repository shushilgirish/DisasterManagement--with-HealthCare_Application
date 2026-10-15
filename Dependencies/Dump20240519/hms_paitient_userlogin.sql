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
-- Table structure for table `paitient_userlogin`
--

DROP TABLE IF EXISTS `paitient_userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paitient_userlogin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `paitient_id` int NOT NULL,
  `username` char(6) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `paitient_id` (`paitient_id`),
  CONSTRAINT `paitient_userlogin_ibfk_1` FOREIGN KEY (`paitient_id`) REFERENCES `paitient_record` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paitient_userlogin`
--

LOCK TABLES `paitient_userlogin` WRITE;
/*!40000 ALTER TABLE `paitient_userlogin` DISABLE KEYS */;
INSERT INTO `paitient_userlogin` VALUES (1,1,'pat1','Abc1234!'),(2,2,'pat2','Abc1234!'),(3,3,'pat3','Abc1234!'),(4,4,'pat4','Abc1234!'),(5,5,'pat5','Abc1234!'),(6,6,'pat6','Abc1234!'),(7,7,'pat7','Abc1234!'),(8,8,'pat8','Abc1234!'),(9,9,'pat9','Abc1234!'),(10,10,'pat10','Abc1234!'),(11,11,'pat11','Abc1234!'),(12,12,'pat12','Abc1234!'),(13,13,'pat13','Abc1234!'),(14,14,'pat14','Abc1234!'),(15,15,'pat15','Abc1234!'),(16,16,'pat16','Abc1234!'),(17,17,'pat17','Abc1234!'),(18,18,'pat18','Abc1234!'),(19,19,'pat19','Abc1234!'),(20,20,'pat20','Abc1234!'),(21,21,'pat21','Abc1234!'),(22,22,'pat22','Abc1234!');
/*!40000 ALTER TABLE `paitient_userlogin` ENABLE KEYS */;
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
