-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 05:27 PM
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
-- Database: `gms`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` varchar(11) DEFAULT NULL,
  `NICnumber` varchar(20) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `age` varchar(11) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `mobilenumber` varchar(20) DEFAULT NULL,
  `fathername` varchar(200) DEFAULT NULL,
  `mothername` varchar(200) DEFAULT NULL,
  `gymtime` varchar(50) DEFAULT NULL,
  `amount` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `NICnumber`, `name`, `age`, `gender`, `Email`, `mobilenumber`, `fathername`, `mothername`, `gymtime`, `amount`) VALUES
('1', '2002465986532', 'kamal', '21', 'Male', 'kamal@gmail.com', '0754896523', 'junathilaka', 'nayanathara', '04:00PM - 10:00PM', '5000'),
('3', '265986532147', 'sahan malinda', '26', 'Male', 'malinda@gmail.com', '0765986324', 'janaka bandara', 'kumari disanayaka', '06:00AM - 11:00AM', '7000'),
('4', '235698546', 'hashan gunasekara', '25', 'Male', 'hashan@gmail.com', '0765986325', 'pannila', 'naduni', '04:00PM - 10:00PM', '5000'),
('5', '123659854652', 'chathuni bandara', '26', 'Female', 'chathuni@gmail.com', '0775896325', 'gunathilaka', 'sayuri', '06:00AM - 11:00AM', '8000');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `paymentId` varchar(50) NOT NULL,
  `id` varchar(11) NOT NULL,
  `month` varchar(40) DEFAULT NULL,
  `amount` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`paymentId`, `id`, `month`, `amount`) VALUES
('1Jun-2024', '1', 'Jun-2024', '1000'),
('3Jun-2024', '3', 'Jun-2024', '5000'),
('4Jun-2024', '4', 'Jun-2024', '5000'),
('6Jun-2024', '6', 'Jun-2024', '5000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`paymentId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
