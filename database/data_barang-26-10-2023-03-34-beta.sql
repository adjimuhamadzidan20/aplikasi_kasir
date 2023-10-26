-- MariaDB dump 10.19  Distrib 10.6.12-MariaDB, for Linux (x86_64)
--
-- Host: mysql.hostinger.ro    Database: u574849695_22
-- ------------------------------------------------------
-- Server version	10.6.12-MariaDB-cll-lve

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `data_barang`
--

DROP TABLE IF EXISTS `data_barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_barang` (
  `id_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `katagori` varchar(100) NOT NULL,
  `harga_satuan` int(100) NOT NULL,
  `jumlah_stok` int(100) NOT NULL,
  PRIMARY KEY (`id_barang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_barang`
--

LOCK TABLES `data_barang` WRITE;
/*!40000 ALTER TABLE `data_barang` DISABLE KEYS */;
INSERT INTO `data_barang` VALUES ('ITM000','Ernser, Huel and Cassin',' Minuman',45000,30),('ITM001','Thiel, Haag and Lindgren',' Kosmetik',20000,25),('ITM002','Ankunding-Trantow',' Peralatan Tulis/Kantor',12000,80),('ITM003','Jacobi Ltd',' Akseseoris',20000,80),('ITM004','Romaguera Group',' Akseseoris',45000,30),('ITM005','Nicolas-Murphy','Makanan',15000,10),('ITM006','Hane Group',' Detergen',20000,80),('ITM007','Konopelski-Simonis',' Detergen',15000,80),('ITM008','Rohan LLC',' Minuman',20000,50),('ITM009','Carter, Romaguera and Grady',' Bumbu Masak',45000,25),('ITM010','Jast-Greenholt','Makanan',12000,80),('ITM011','Stroman-Gulgowski',' Sayuran',15000,30),('ITM013','Brakus PLC',' Akseseoris',20000,12),('ITM014','Little LLC',' Peralatan Rumah',20000,80),('ITM015','Bogisich, Rau and Ernser',' Bumbu Masak',15000,12),('ITM017','Nicolas-Conroy',' Peralatan Tulis/Kantor',15000,12),('ITM018','Brown Group',' Kosmetik',12000,30),('ITM019','Simonis Group',' Peralatan Tulis/Kantor',12000,30),('ITM020','Kessler, Schmidt and Skiles',' Akseseoris',15000,10),('ITM023','Glover Inc',' Peralatan Berat',20000,10),('ITM024','Hammes PLC',' Peralatan Berat',12000,25),('ITM025','Bednar, Schowalter and Spinka',' Sayuran',20000,30),('ITM026','Hyatt-Prosacco',' Minuman',12000,12),('ITM027','Pollich and Sons',' Akseseoris',15000,10),('ITM028','Cassin PLC',' Kosmetik',20000,25),('ITM029','Emmerich Inc',' Detergen',20000,12),('ITM030','McCullough-Terry',' Akseseoris',15000,80),('ITM031','Runolfsson, Zulauf and Champlin',' Peralatan Rumah',12000,50),('ITM032','Tillman and Sons',' Bumbu Masak',15000,80),('ITM033','Kuvalis, Bechtelar and Armstrong',' Sayuran',15000,10),('ITM034','Hammes LLC',' Peralatan Rumah',20000,80),('ITM035','Greenfelder, Feil and Terry',' Sayuran',12000,10),('ITM036','Hilll Inc',' Peralatan Berat',12000,30),('ITM037','Cremin-Hammes',' Minuman',15000,50),('ITM038','Hayes, Kris and Conroy',' Peralatan Berat',45000,12),('ITM039','Stehr, Ruecker and Nitzsche',' Peralatan Tulis/Kantor',45000,12),('ITM040','Cummings-Huels',' Detergen',20000,10),('ITM041','Reichel, Cassin and Harber',' Bumbu Masak',12000,10),('ITM042','Beier, Wilkinson and Hane',' Peralatan Rumah',15000,80),('ITM043','Rogahn LLC',' Detergen',20000,80),('ITM044','Kuphal Ltd',' Peralatan Tulis/Kantor',45000,50),('ITM045','Shanahan and Sons',' Bumbu Masak',15000,50),('ITM046','Rowe-Willms',' Akseseoris',20000,80),('ITM047','Grimes, Toy and Ratke',' Detergen',20000,12),('ITM050','Gusikowski-Collier',' Kosmetik',45000,10),('ITM051','Grimes-DuBuque',' Peralatan Tulis/Kantor',12000,10),('ITM052','Kertzmann, Wiegand and Corwin',' Bumbu Masak',15000,50),('ITM054','Roberts-Mitchell','Makanan',45000,10),('ITM055','Gleichner-Lesch',' Bumbu Masak',15000,80),('ITM056','Jacobs, Bashirian and Dickinson',' Sayuran',20000,10),('ITM058','Prohaska-Nolan',' Peralatan Tulis/Kantor',12000,12),('ITM059','McLaughlin Group',' Peralatan Berat',45000,50),('ITM060','Towne, Pouros and Will',' Sayuran',15000,25),('ITM062','Mohr Inc',' Kosmetik',15000,50),('ITM063','Schmitt and Sons',' Minuman',15000,80),('ITM064','Greenfelder-Weimann','Makanan',12000,50),('ITM066','Nolan-Dooley',' Detergen',45000,50),('ITM067','Ortiz LLC',' Peralatan Berat',15000,25),('ITM068','Sawayn LLC',' Kosmetik',20000,12),('ITM069','Fay Inc',' Bumbu Masak',20000,80),('ITM070','Padberg, Huel and Berge',' Peralatan Rumah',45000,50),('ITM071','Wehner, Von and Hettinger',' Kosmetik',20000,30),('ITM072','Murazik-McCullough',' Peralatan Tulis/Kantor',15000,50),('ITM075','Nicolas-Thompson',' Akseseoris',15000,50),('ITM076','Bosco Ltd',' Detergen',15000,25),('ITM080','Becker LLC',' Peralatan Berat',45000,80),('ITM081','Krajcik-Turcotte',' Peralatan Berat',45000,12),('ITM083','Sauer and Sons','Makanan',15000,50),('ITM084','Kris-Green',' Peralatan Rumah',20000,25),('ITM086','Waelchi Ltd',' Peralatan Tulis/Kantor',15000,12),('ITM087','Goldner Ltd',' Peralatan Tulis/Kantor',12000,50),('ITM090','Moore-Carter','Makanan',12000,25),('ITM091','Buckridge-Morissette',' Akseseoris',45000,80),('ITM092','Quigley-Lesch',' Sayuran',45000,10),('ITM093','Dibbert and Sons',' Detergen',20000,50),('ITM095','Lakin-Moore','Makanan',12000,25),('ITM096','Hettinger-Grimes',' Peralatan Tulis/Kantor',20000,12),('ITM097','Jacobson-Ortiz',' Detergen',20000,25),('ITM098','Yundt, Effertz and Kirlin','Makanan',12000,80),('ITM099','Terry, Simonis and McDermott',' Kosmetik',45000,10);
/*!40000 ALTER TABLE `data_barang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-26  3:34:49
