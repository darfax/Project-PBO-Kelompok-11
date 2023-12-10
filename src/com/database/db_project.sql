-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2023 at 10:12 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `ponggame`
--

CREATE TABLE `ponggame` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(30) NOT NULL,
  `pathPhoto` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ponggame`
--

INSERT INTO `ponggame` (`id`, `username`, `password`, `pathPhoto`) VALUES
(7, 'adin', '123', 'D:\\PRAKTIKUM PBO\\Project-PBO-Kelompok-11\\src\\upload\\adin.jpg'),
(8, 'yuan', 'yuan', 'D:\\PRAKTIKUM PBO\\Project-PBO-Kelompok-11\\src\\upload\\yuan.jpg'),
(9, 'ajik', 'kontol', 'D:\\PRAKTIKUM PBO\\Project-PBO-Kelompok-11\\src\\upload\\ajik.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ponggame`
--
ALTER TABLE `ponggame`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ponggame`
--
ALTER TABLE `ponggame`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
