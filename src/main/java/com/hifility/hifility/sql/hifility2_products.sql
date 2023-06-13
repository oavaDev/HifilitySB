-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: hifility2
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `subtitle` varchar(254) DEFAULT NULL,
  `description` varchar(254) DEFAULT NULL,
  `image` varchar(254) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (2,'ZSN PRO','KZ','1BA+1DD HiFi Hybrid Dual Driver In Ear Earbuds','Improved Hybrid Drivers,Exquisite Metal and Resin Design, Improved 0.75mm 2 Pin Detachable Cable, Ergonomic Design for Stable Wear','https://cdn.shopify.com/s/files/1/0040/7201/3924/products/KZ-ZSNPRO-IEM-1.jpg?v=1567348966',17.85),(3,'Stellaris','MOONDROP','Outstanding 14.5mm Planar Driver In-Ear Monitor','High-Precision Sub-Nanometer Driver Diaphragm,Fully Symmetrical Magnetic Circuit,Exquisite Starry Sky Theme Appearance,Comfortable Liquid Silicone Ear Tips','https://cdn.shopify.com/s/files/1/0040/7201/3924/products/1_53678b0c-66f3-4956-901b-6b3061135eb3.jpg?v=166435704',93.49),(4,'Timeless','7HZ','14.2mm Planar HiFi In-ear Earphone','Adopts Double-sided Array N52 Magnet and Ultra-thin Diaphragm,14.2mm Planar Driver,CNC Aluminum Shell,Detachable MMCX Cable,Lightweight and Comfortable','http://cdn.shopify.com/s/files/1/0040/7201/3924/products/7HZTimeless-2_3d709844-2bea-4125-938e-61febf3e320f_300x.jpg?v=1635258287',109.00),(5,'Salnotes Dioko','7HZ','14.6mm Planar Diaphragm Driver In Ear Earphone','Salnotes Dioko-14.6mm Planar Driver IEM,7Hz x Crinacle Tuning,N55 Magnet - Double-sided Array,Fine Tuned CNC-Machined Aluminum Shell,Tempered Glass & Sapphire Coating Surface,Premium OCC Copper Cable & Storage Box','https://cdn.shopify.com/s/files/1/0040/7201/3924/products/1_9_1818e743-5e56-4081-8837-7aff1cfcb675.jpg?v=1656312717',130.00),(6,'Heart Mirror Pro','HZSOUND','High Performance HiFi 10mm Dynamic Driver In-Ear Monitors','10MM CNT Carbon Nanotube Diaphragm,Professional Tuning Adjustments,Exquisite Heart-shaped Appearance,Detachable High Purity Cable Design,Ergonomic Design','https://cdn.shopify.com/s/files/1/0040/7201/3924/products/1_7_16e84831-3fdb-4a19-b448-2ada2600e090.jpg?v=1663150202',71.99);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-12 23:04:15
