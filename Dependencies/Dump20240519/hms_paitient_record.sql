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
-- Table structure for table `paitient_record`
--

DROP TABLE IF EXISTS `paitient_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paitient_record` (
  `id` int NOT NULL AUTO_INCREMENT,
  `PatientName` varchar(200) NOT NULL,
  `PatientDisease` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `date` varchar(200) NOT NULL,
  `time` varchar(200) NOT NULL,
  `Age` int NOT NULL,
  `sex` char(1) NOT NULL,
  `bloodtype` varchar(5) NOT NULL,
  `Allergies` varchar(255) DEFAULT NULL,
  `Medication` varchar(255) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `State` varchar(50) DEFAULT NULL,
  `is_affected` tinyint(1) DEFAULT NULL,
  `needhospitaladmmission` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paitient_record`
--

LOCK TABLES `paitient_record` WRITE;
/*!40000 ALTER TABLE `paitient_record` DISABLE KEYS */;
INSERT INTO `paitient_record` VALUES (1,'John Doe','Fever','2023-01-01','10:00 AM',25,'M','A+','No','No','USA','Chicago','California',1,'Yes'),(2,'Jane Smith','Headache','2023-02-15','11:30 AM',35,'F','B-','Yes','No','USA','Chicago','Texas',0,'No'),(3,'Alice Johnson','Cough','2023-03-10','02:15 PM',42,'F','O+','Yes','No','USA','Phoenix','Texas',1,'No'),(4,'Mark Davis','Allergies','2023-04-05','03:30 PM',18,'M','A-','No','Yes','USA','Los Angeles','California',1,'Yes'),(5,'Emily Miller','Stomachache','2023-05-20','09:45 AM',50,'F','B+','Yes','No','USA','New York','California',1,'No'),(6,'Daniel White','Sprained Ankle','2023-06-07','01:20 PM',31,'M','O-','No','Yes','USA','Houston','Texas',0,'Yes'),(7,'Sophia Wilson','Flu','2023-07-12','05:55 PM',68,'F','A+','Yes','Yes','USA','New York','Texas',0,'No'),(8,'David Brown','Migraine','2023-08-25','08:10 AM',22,'M','B-','Yes','Yes','USA','Chicago','Texas',0,'No'),(9,'Olivia Lee','Broken Arm','2023-09-30','12:00 PM',75,'F','O+','Yes','No','USA','Chicago','California',1,'Yes'),(10,'Michael Robinson','Diabetes','2023-10-15','06:30 PM',40,'M','A-','Yes','Yes','USA','New York','New York',1,'No'),(11,'Emma Taylor','Asthma','2023-11-20','09:00 AM',60,'F','B+','Yes','Yes','USA','Los Angeles','Texas',0,'Yes'),(12,'Christopher Evans','High Blood Pressure','2023-12-05','02:45 PM',28,'M','O-','No','Yes','USA','Houston','California',0,'Yes'),(13,'Lauren Wilson','Fractured Leg','2024-01-10','04:30 PM',57,'F','A+','No','No','USA','Los Angeles','Texas',0,'Yes'),(14,'Michael Davis','Obesity','2024-02-15','11:15 AM',19,'M','B-','No','Yes','USA','Los Angeles','Texas',0,'No'),(15,'Sophia Robinson','Bronchitis','2024-03-01','03:00 PM',48,'F','O+','No','Yes','USA','Chicago','Illinois',0,'No'),(16,'Ethan Brown','Skin Rash','2024-04-15','07:45 AM',33,'M','A+','No','Yes','USA','New York','California',1,'No'),(17,'Olivia Lee','Arthritis','2024-05-20','12:30 PM',70,'F','B+','Yes','Yes','USA','Los Angeles','California',0,'Yes'),(18,'Logan Taylor','Sinusitis','2024-06-25','02:15 PM',25,'M','O-','No','No','USA','Los Angeles','California',0,'No'),(19,'Mia Wilson','Ear Infection','2024-07-10','05:00 PM',55,'F','A-','No','No','USA','Phoenix','Illinois',0,'Yes'),(20,'Noah Davis','Gastroenteritis','2024-08-15','09:30 AM',38,'M','B+','Yes','Yes','USA','Chicago','New York',0,'Yes'),(21,'Ava Robinson','Urinary Tract Infection','2024-09-20','01:15 PM',45,'F','O-','Yes','Yes','USA','Chicago','Illinois',1,'Yes'),(22,'Liam Miller','Allergies','2024-10-25','04:00 PM',15,'M','A+','Yes','No','USA','Chicago','Illinois',0,'Yes');
/*!40000 ALTER TABLE `paitient_record` ENABLE KEYS */;
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
