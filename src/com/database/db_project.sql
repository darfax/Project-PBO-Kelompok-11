-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2023 at 11:15 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

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
  `pathPhoto` varchar(100) DEFAULT NULL,
  `highScore` int(255) DEFAULT NULL,
  `totalWin` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ponggame`
--

INSERT INTO `ponggame` (`id`, `username`, `password`, `pathPhoto`, `highScore`, `totalWin`) VALUES
(10, 'adin', '123', 'src\\upload\\adin.png', 16, 20),
(12, 'Ansel', '1234', 'src\\upload\\Ansel.png', 15, 26),
(16, 'yuan', '1', 'src\\upload\\customer.jpg', 11, 2),
(17, 'pakde', '2', 'src\\upload\\customer.jpg', 0, 0),
(18, 'darfa', 'asd', 'src\\upload\\customer.jpg', 2, 0);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
