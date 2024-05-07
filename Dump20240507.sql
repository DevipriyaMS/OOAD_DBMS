-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: humanresource_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (1,'IT'),(2,'Marketing'),(3,'Operations'),(4,'Learning and Development'),(5,'Sales'),(6,'Finance'),(7,'Customer Service');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `contact` bigint DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `job_roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'John','Doe','1990-03-15',1234567890,'123 Main St, Anytown','2020-01-15',1),(2,'Jane','Smith','1985-07-21',9876543210,'456 Elm St, Othertown','2018-05-10',2),(3,'Michael','Johnson','1995-11-08',5555555555,'789 Oak St, Anothertown','2021-03-20',3),(4,'Emily','Brown','1988-09-30',9998887770,'321 Pine St, Somewhere','2017-11-02',1),(5,'David','Garcia','1992-02-18',1112223330,'654 Cedar St, Nowhere','2019-09-05',4),(6,'Jessica','Martinez','1987-06-25',4443332220,'987 Maple St, Anywhere','2016-08-12',2),(7,'Daniel','Rodriguez','1993-12-04',6667778880,'741 Birch St, Everytown','2022-02-28',5),(8,'Sarah','Wilson','1998-05-09',3334445550,'852 Spruce St, Nowhere','2020-10-17',6),(9,'Christopher','Lopez','1984-08-12',8889990000,'963 Fir St, Somewhere','2015-04-23',5),(10,'Amanda','Taylor','1991-01-27',2223334440,'159 Walnut St, Anothertown','2018-12-10',7),(11,'Brandon','Jackson','1996-04-05',7778889990,'369 Oak St, Anytown','2023-05-20',8),(12,'Lauren','Hernandez','1989-10-22',5556667770,'852 Pine St, Othertown','2019-08-15',9),(13,'Kevin','Young','1994-03-17',3332221110,'741 Cedar St, Somewhere','2020-12-03',10),(14,'Megan','Lee','1986-07-11',9990001110,'456 Birch St, Nowhere','2017-06-08',11),(15,'Ryan','Gonzalez','1990-12-28',6665554440,'123 Elm St, Anywhere','2021-01-30',7),(16,'Stephanie','Perez','1997-08-03',2223334440,'963 Maple St, Everytown','2018-04-12',6),(17,'Kyle','Sanchez','1983-05-16',8887776660,'654 Oak St, Anothertown','2016-10-25',4),(18,'Taylor','Rivera','1995-01-09',4445556660,'357 Cedar St, Somewhere','2022-11-07',5),(19,'Hannah','Nguyen','1987-09-14',1112223330,'852 Pine St, Nowhere','2018-02-18',10),(20,'Justin','Kim','1992-06-30',9998887770,'123 Fir St, Anothertown','2019-07-24',3);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_roles`
--

DROP TABLE IF EXISTS `job_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `job_roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dept_id` int DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `job_roles_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `departments` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_roles`
--

LOCK TABLES `job_roles` WRITE;
/*!40000 ALTER TABLE `job_roles` DISABLE KEYS */;
INSERT INTO `job_roles` VALUES (1,1,'Associative Software Engineer'),(2,1,'Senior Software Engineer'),(3,2,'Business Analyst'),(4,2,'Quality Analyst'),(5,3,'Operations Manager'),(6,4,'L&D Director'),(7,4,'L&D Intern'),(8,5,'Sales Manager'),(9,6,'Finance Director'),(10,6,'Accountant'),(11,7,'Client Support Head');
/*!40000 ALTER TABLE `job_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_details`
--

DROP TABLE IF EXISTS `leave_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `leave_type` varchar(255) DEFAULT NULL,
  `allowed_duration` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_details`
--

LOCK TABLES `leave_details` WRITE;
/*!40000 ALTER TABLE `leave_details` DISABLE KEYS */;
INSERT INTO `leave_details` VALUES (1,'Annual Leave',20),(2,'Sick Leave',10),(3,'Unpaid Leave',NULL),(4,'Maternity Leave',12),(5,'Paternity Leave',5),(6,'Vacation Leave',15),(7,'Study Leave',10),(8,'Bereavement Leave',5);
/*!40000 ALTER TABLE `leave_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_records`
--

DROP TABLE IF EXISTS `leave_records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_records` (
  `leave_requestid` int NOT NULL AUTO_INCREMENT,
  `employee_id` int DEFAULT NULL,
  `leavetype_id` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `approved_by` int DEFAULT NULL,
  `approval_date` date DEFAULT NULL,
  `status` varchar(35) DEFAULT NULL,
  `comments` varchar(30) DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`leave_requestid`),
  KEY `employee_id` (`employee_id`),
  KEY `leavetype_id` (`leavetype_id`),
  KEY `approved_by` (`approved_by`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `leave_records_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `leave_records_ibfk_2` FOREIGN KEY (`leavetype_id`) REFERENCES `leave_details` (`id`),
  CONSTRAINT `leave_records_ibfk_3` FOREIGN KEY (`approved_by`) REFERENCES `employees` (`id`),
  CONSTRAINT `leave_records_ibfk_4` FOREIGN KEY (`created_by`) REFERENCES `employees` (`id`),
  CONSTRAINT `leave_records_ibfk_5` FOREIGN KEY (`updated_by`) REFERENCES `employees` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_records`
--

LOCK TABLES `leave_records` WRITE;
/*!40000 ALTER TABLE `leave_records` DISABLE KEYS */;
INSERT INTO `leave_records` VALUES (1,1,1,'2024-04-01','2024-04-15',3,'2024-03-30','Approved','Vacation',1,3,'2024-03-28','2024-03-29'),(2,2,2,'2024-03-10','2024-03-14',1,'2024-03-09','Approved','Illness',1,1,'2024-03-07','2024-03-08'),(3,3,1,'2024-04-20','2024-04-25',2,'2024-04-18','Approved','Vacation',2,1,'2024-04-15','2024-04-17'),(4,2,3,'2024-05-05','2024-05-07',NULL,NULL,'Pending','Personal',3,1,'2024-05-01','2024-05-01'),(5,5,1,'2024-02-15','2024-02-16',4,'2024-02-14','Approved','Vacation',4,4,'2024-02-12','2024-02-13'),(6,2,2,'2024-01-10','2024-01-12',5,'2024-01-08','Approved','Illness',5,2,'2024-01-07','2024-01-07'),(7,3,5,'2024-04-10','2024-04-12',NULL,NULL,'Pending','Training',6,3,'2024-04-01','2024-04-01'),(8,8,6,'2024-03-01','2024-03-05',7,'2024-02-28','Approved','Vacation',7,4,'2024-02-25','2024-02-27'),(9,1,1,'2024-05-10','2024-05-12',2,'2024-05-09','Approved','Vacation',1,2,'2024-05-08','2024-05-08'),(10,3,3,'2024-05-01','2024-05-05',1,'2024-04-30','Approved','Personal',3,1,'2024-04-29','2024-04-29'),(11,5,2,'2024-05-15','2024-05-17',4,'2024-05-14','Approved','Illness',5,4,'2024-05-13','2024-05-13'),(12,7,6,'2024-05-20','2024-05-22',NULL,NULL,'Pending','Training',6,3,'2024-05-19','2024-05-19'),(13,2,1,'2024-05-25','2024-05-27',3,'2024-05-24','Approved','Vacation',2,1,'2024-05-23','2024-05-23'),(14,4,5,'2024-05-08','2024-05-09',5,'2024-05-07','Approved','Bereavement',4,5,'2024-05-06','2024-05-06'),(15,2,2,'2024-04-17','2024-04-19',4,'2024-04-15','Approved','Hospital Emergency',2,4,'2024-04-15','2024-04-16');
/*!40000 ALTER TABLE `leave_records` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pay_roll`
--

DROP TABLE IF EXISTS `pay_roll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pay_roll` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int DEFAULT NULL,
  `basepay` double DEFAULT NULL,
  `lossofpay` double DEFAULT NULL,
  `paydate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `pay_roll_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pay_roll`
--

LOCK TABLES `pay_roll` WRITE;
/*!40000 ALTER TABLE `pay_roll` DISABLE KEYS */;
INSERT INTO `pay_roll` VALUES (1,1,50000,1000,'2024-04-30'),(2,2,55000,5000,'2024-04-30'),(3,3,60000,2000,'2024-04-30'),(4,4,52000,0,'2024-04-30'),(5,5,58000,0,'2024-04-30'),(6,6,62000,0,'2024-04-30'),(7,7,55000,1500,'2024-04-30'),(8,8,50000,1000,'2024-05-31'),(9,9,55000,0,'2024-05-31'),(10,10,60000,0,'2024-05-31'),(11,11,52000,0,'2024-05-31');
/*!40000 ALTER TABLE `pay_roll` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:11:46
