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
-- Table structure for table `personcitizen`
--

DROP TABLE IF EXISTS `personcitizen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personcitizen` (
  `Id` varchar(50) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Age` int DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `ssn` bigint DEFAULT NULL,
  `phoneno` bigint DEFAULT NULL,
  `Allergies` varchar(255) DEFAULT NULL,
  `Medication` varchar(255) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `State` varchar(50) DEFAULT NULL,
  `is_affected` tinyint(1) DEFAULT NULL,
  `needhospitaladmmission` varchar(3) DEFAULT NULL,
  `Hospitaladmitdate` varchar(20) DEFAULT NULL,
  `dischargedate` varchar(20) DEFAULT NULL,
  `bankbalance` float DEFAULT NULL,
  `Affecteddisastername` varchar(50) DEFAULT NULL,
  `money` int DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personcitizen`
--

LOCK TABLES `personcitizen` WRITE;
/*!40000 ALTER TABLE `personcitizen` DISABLE KEYS */;
INSERT INTO `personcitizen` VALUES ('06675','Scott Davis','Pa$ss123',32,'123 Birch St','1990-03-25',6356466,9876543231,'Nuts','Antibiotics','USA','New York City','New York',0,'no',NULL,NULL,10000,NULL,3000),('13554','John Doe','Password#123',30,'123 Main St','1992-05-15',6356466,9876543231,'Pollen','Aspirin','USA','Salem','MA',1,'yes','2023-01-01','2023-01-10',5000,'Earthquake',2000),('32432','Olivia Lee','Mypwd45@#%6',70,'987 Pine St','1952-06-10',6356466,9876543231,'Eggs','Insulin','USA','Los Angeles','California',1,'yes','2023-09-15','2023-09-30',15000,'Tsunami',5000),('35644','Bob Johnson','Secure#5pwd',40,'789 Pine St','1982-03-10',43245455,9876543231,'Shellfish','Antibiotics','USA','Los Angeles','California',1,'yes','2023-02-15','2023-02-25',10000,'Cyclone',3000),('45654','Alice Davis','Strongpa34#ss',28,'321 Cedar St','1994-11-05',6356466,9876543231,'Nuts','Paracetamol','USA','New York City','New York',0,'no',NULL,NULL,12000,NULL,2500),('50565','David Brown','Mypwd@3$456',42,'789 Oak St','1980-09-28',6356466,9876543231,'Peanuts','Antihistamine','USA','Boston','MA',0,'no',NULL,NULL,9000,NULL,3000),('54565','Michael Robinson','Securep@23$ass789',28,'654 Birch St','1995-02-20',6356466,9876543231,'Milk','Insulin','USA','New York City','New York',0,'no',NULL,NULL,6000,NULL,2200),('54644','Jane Smith','Pass43#@56',25,'456 Oak St','1997-08-22',6356466,9876543231,'Penicillin','Ibuprofen','USA','Boston','MA',0,'no',NULL,NULL,8000,NULL,1500),('54654','Olivia Lee','Pass#5123',50,'987 Maple St','1972-12-12',6356466,9876543231,'Eggs','Inhaler','USA','Los Angeles','California',1,'yes','2023-04-15','2023-04-30',11000,'Earthquake',4000),('54657','Ava Wilson','Sypw%$6d123',55,'321 Maple St','1968-05-20',6356466,9876543231,'Fish','Antihistamine','USA','Salem','MA',1,'yes','2023-10-10','2023-10-20',11000,'Cyclone',4000),('56455','Emma Taylor','Mypas#5sword',45,'321 Elm St','1977-07-05',6356466,9876543231,'Fish','Aspirin','USA','Salem','MA',1,'yes','2023-05-10','2023-05-20',8500,'Cyclone',1600),('56456','Christopher Evans','Secure@#pass456',33,'456 Pine St','1989-04-30',9876543231,9876543231,'Wheat','Paracetamol','USA','Boston','MA',0,'no',NULL,NULL,9500,NULL,2700),('56545','Lauren Wilson','Mypw@$5d789',60,'789 Oak St','1962-11-15',6356466,9876543231,'Shellfish','Antibiotics','USA','Los Angeles','California',1,'yes','2023-06-25','2023-07-05',12000,'Tsunami',3500),('56767','Carter Evans','Securepa#5^ss456',40,'456 Elm St','1982-02-28',6356466,9876543231,'Wheat','Ibuprofen','USA','Boston','MA',0,'yes',NULL,NULL,12000,NULL,3500),('57676','Mia Wilson','Mypw#%^d789',28,'789 Cedar St','1994-09-12',6356466,9876543231,'Shellfish','Paracetamol','USA','Los Angeles','California',1,'yes','2023-11-25','2023-12-05',13000,'Tsunami',4500),('64532','Sophia Robinson','Myp%^^wd123',48,'456 Birch St','1974-08-22',6356466,9876543231,'Dust','Cough Syrup','USA','Salem','MA',1,'yes','2023-08-10','2023-08-20',10000,'Earthquake',2800),('64565','Michael Davis','Pass@$789',19,'123 Cedar St','2004-03-08',6356466,9876543231,'Nuts','Ibuprofen','USA','New York City','New York',0,'no',NULL,NULL,7000,NULL,1800),('64655','Emily Miller','Sec$@#urepass123',35,'567 Pine St','1987-06-18',6356466,9876543231,'Dust','Cough Syrup','USA','Salem','MA',1,'yes','2023-03-01','2023-03-10',7500,'Tsunami',1800),('65456','Ethan Brown','Secu#%%repass123',33,'789 Elm St','1989-02-15',6356466,9876543231,'Pollen','Inhaler','USA','Boston','MA',0,'no',NULL,NULL,8000,NULL,2200),('76673','Jackson Davis','Pa^h&%&ss123',32,'123 Birch St','1990-03-25',6356466,9876543231,'Nuts','Antibiotics','USA','New York City','New York',0,'no',NULL,NULL,10000,NULL,3000),('76675','Jackson Davis','Pass$123',32,'123 Birch St','1990-03-25',6356466,9876543231,'Nuts','Antibiotics','USA','New York City','New York',0,'no',NULL,NULL,10000,NULL,3000),('86675','Michale Davis','Ppass1@23',32,'123 Birch St','1990-03-25',6356466,9876543231,'Nuts','Antibiotics','USA','New York City','New York',0,'no',NULL,NULL,10000,NULL,3000),('87566','Logan Taylor','Pas#$%s789',25,'654 Oak St','1998-12-03',6356466,9876543231,'Milk','Aspirin','USA','New York City','New York',0,'no',NULL,NULL,9000,NULL,2500),('96675','Roy Davis','Ppass1@23',32,'123 Birch St','1990-03-25',6356466,9876543231,'Nuts','Antibiotics','USA','New York City','New York',0,'no',NULL,NULL,10000,NULL,3000);
/*!40000 ALTER TABLE `personcitizen` ENABLE KEYS */;
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
