-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2022 at 08:14 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cricket_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `matches`
--

CREATE TABLE `matches` (
  `match_id` int(11) NOT NULL,
  `team1_id` int(11) NOT NULL,
  `team2_id` int(11) NOT NULL,
  `match_date` date DEFAULT NULL,
  `stadium_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matches`
--

INSERT INTO `matches` (`match_id`, `team1_id`, `team2_id`, `match_date`, `stadium_id`) VALUES
(31, 2, 4, '2022-01-03', 101),
(32, 3, 5, '2022-02-04', 102),
(35, 5, 1, '2022-03-05', 103),
(36, 1, 10, '2022-04-06', 103),
(37, 2, 9, '2022-05-07', 104),
(38, 3, 8, '2022-06-08', 105),
(39, 4, 7, '2022-07-09', 106),
(40, 5, 6, '2022-08-10', 107),
(41, 6, 5, '2022-09-11', 101),
(42, 7, 4, '2022-10-12', 108),
(43, 8, 3, '2022-11-13', 109),
(44, 9, 2, '2022-12-14', 110),
(45, 10, 1, '2022-01-15', 101),
(46, 1, 10, '2022-02-16', 102),
(47, 2, 9, '2022-03-17', 103),
(48, 3, 8, '2022-04-18', 104),
(49, 4, 7, '2022-05-19', 105),
(50, 5, 6, '2022-06-20', 106),
(51, 6, 5, '2022-07-22', 107),
(52, 7, 4, '2022-08-21', 108),
(53, 8, 3, '2022-09-22', 109),
(54, 9, 2, '2022-10-23', 110),
(55, 10, 1, '2022-11-24', 101);

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `player_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) NOT NULL,
  `phone_no` bigint(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `since` date DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `team_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`player_id`, `name`, `address`, `phone_no`, `dob`, `role`, `since`, `salary`, `team_id`) VALUES
(07, 'MS Dhoni', 'Chennai', 9658326542, '1975-01-12', 'Wicket Keeper', '2010-01-06', 10000000, 2),
(18, 'Jadeja', 'Chennaii', 5326457632, '2015-01-06', 'All Rounder', '2019-02-08', 800000, 2),
(27, 'Ajinkya Rahane', 'Chennai', 8657653254, '1978-01-11', 'All Ronder', '2015-03-14', 80000000, 2),
(18, 'Virat Kholi', 'Bangalore', 9865732546, '1988-01-12', 'Batsman', '2011-04-14', 170000000, 4),
(45, 'Rohit Sharma', 'Mumbai', 9865732874, '1988-01-13', 'Batsman', '2012-05-14', 170000000, 4),
(1, 'KL Rahul', 'Bangalore', 9856732874, '1988-01-14', 'Batsman', '2013-06-14', 90000000, 3),
(63, 'Suryakumar Yadav','Mumbai', 9835732874, '1990-09-15', 'Batsman', '2014-07-14', 170000000, 2),
(41, 'Shreyas Iyer', 'Mumbai', 9856452132, '1982-01-16', 'Batsman', '2015-08-14', 170000000, 1),
(32, 'Ishan Kishan', 'Mumbai', 9856213456, '1983-01-17', 'Batsman', '2016-09-14', 190000000, 5),
(17, 'Rishabh Pant', 'Mumbai', 9998732874, '1984-01-18', 'Batsman', '2017-10-14', 120000000, 6),
(8, 'Ravindra Jadeja','Mumbai', 9845612358, '1987-01-19', 'All-Rounder', '2018-11-14', 140000000, 7),
(20, 'Axar Patel', 'Mumbai', 9856425862, '1981-01-20', 'All-Rounder', '2001-12-14', 160000000, 8),
(33, 'Hardik Pandya', 'Mumbai', 9874563214, '1980-01-21', 'All-Rounder', '2002-01-14', 18000000, 9),
(54, 'Shardul Thakur', 'Mumbai', 9874512365, '1978-01-22', 'Batsman', '2004-02-14', 190000000, 10),
(99, 'Ravichandran Ashwin', 'Mumbai', 9856232145, '1977-01-23', 'Bowler', '2005-03-14', 100000000, 1),
(93, 'Jasprit Bumrah', 'Mumbai', 8541236985, '1976-01-24', 'Bowler', '2006-04-14', 110000000, 2),
(28, 'Rahul Chahar', 'Mumbai', 7856412358, '1975-01-25', 'Batsman', '2007-05-14', 120000000, 3),
(29, 'Varun Chakravarthy', 'Mumbai', 9874021532, '1993-01-26', 'Batsman', '2003-06-14', 130000000, 4),
(15, 'Bhuvneshwar Kumar', 'Mumbai', 9856425135, '1992-01-28', 'Bowler', '2003-07-14', 140000000, 5),
(90, 'Deepak Chahar', 'Mumbai', 1456247895, '1991-01-29', 'All-Rounder', '2003-08-14', 150000000, 6),
(25, 'Cheteshwar Pujara', 'Mumbai', 9845624701, '1990-01-30', 'All-Rounder', '2003-09-14', 19055000, 7),
(44, 'Hanuma Vihari', 'Mumbai', 8546525645, '1970-01-01', 'All-Rounder', '2003-10-14', 190000000, 8),
(97, 'Ishant Sharma', 'Mumbai', 7589641235, '1971-01-02', 'Batsman', '2003-11-14', 300002500, 9),
(79, 'Kedar Jadhav', 'Mumbai', 2548645315, '1972-01-03', 'Batsman', '2003-12-14', 897456000, 10),
(27, 'Khaleel Ahmed', 'Mumbai', 1258643586, '1973-01-04', 'All-Rounder', '2003-01-14', 984521000, 1),
(24, 'Krunal Pandya', 'Mumbai', 9584621476, '1974-01-05', 'All-Rounder', '2003-02-14', 84500000, 2),
(23, 'Kuldeep Yadav', 'Mumbai', 6584971236, '1975-01-06', 'Batsman', '2003-03-14', 7546000, 3),
(21, 'Manish Pandey', 'Mumbai', 3584568496, '1976-01-07', 'Batsman', '2002-04-14', 98450000, 4),
(16, 'Mayank Agarwal', 'Mumbai', 5684795613, '1977-01-08', 'Batsman', '2001-05-14', 560002300, 5),
(13, 'Mohammed Siraj', 'Mumbai', 9845632147, '1978-01-09', 'Bowler', '1995-06-14', 989856560, 6),
(96, 'Navdeep Saini', 'Mumbai', 7412589635, '1979-01-10', 'Batsman', '1998-07-14', 65000000, 7),
(100, 'Prithvi Shaw', 'Mumbai', 8523697415, '1989-01-11', 'Batsman', '1997-05-14', 7860000, 8),
(14, 'Sanju Samson', 'Mumbai', 8412563975, '1987-01-12', 'Batsman', '1996-08-14', 74510000, 9),
(88, 'Shahbaz Nadeem', 'Mumbai', 8456123970, '1986-01-13', 'Batsman', '1999-09-14', 895456000, 10),
(42, 'Shikhar Dhawan', 'Mumbai', 7856412356, '1985-01-14', 'Batsman', '2020-10-14', 895620000, 1),
(70, 'Shivam Dube', 'Mumbai', 91236458795, '1984-01-15', 'Bowler', '2009-11-14', 89300000, 2),
(77, 'Shubman Gill', 'Mumbai', 9874562584, '1983-01-16', 'Batsman', '2008-12-14', 160000000, 3),
(19, 'Umesh Yadav', 'Mumbai', 9865732874, '1982-01-17', 'Bowler', '2007-01-14', 89600000, 4),
(55, 'Washington Sundar', 'Mumbai', 9632587410, '1981-01-18', 'All-Rounder', '2020-02-14', 98356600, 5),
(6, 'Wriddhiman Saha', 'Mumbai', 9856412358, '1980-01-19', 'All-Rounder', '2005-03-14', 85265658, 6),
(3, 'Yuzvendra Chahal', 'Mumbai', 6548712395, '1989-01-20', 'All-Rounder', '2004-04-14', 455562686, 7),
(11, 'Mohammed Shami', 'Bangalore', 9865325325, '1994-01-21', 'Left-Handed Batsman', '2015-01-13', 120000000, 8);

-- --------------------------------------------------------

--
-- Table structure for table `scores`
--

CREATE TABLE `scores` (
  `match_id` int(11) DEFAULT NULL,
  `team_id` int(11) DEFAULT NULL,
  `scores` int(11) DEFAULT NULL,
  `result` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `scores`
--

INSERT INTO `scores` (`match_id`, `team_id`, `scores`, `result`) VALUES
(31, 2, 175, 'Won'),
(31, 4, 170, 'Lost'),
(32, 3, 165, 'Lost'),
(32, 5, 166, 'Won'),
(35, 5, 221, 'Won'),
(36, 4, 222, 'Won'),
(37, 10, 220, 'Lost'),
(38, 2, 120, 'Won'),
(39, 3, 130, 'Won'),
(40, 4, 140, 'Won'),
(41, 5, 150, 'Won'),
(42, 6, 160, 'Won'),
(43, 7, 180, 'Won'),
(44, 8, 190, 'Won'),
(45, 9, 200, 'Won'),
(46, 10, 210, 'Won'),
(47, 1, 222, 'Won'),
(48, 2, 121, 'Lost'),
(49, 3, 123, 'Lost'),
(52, 4, 125, 'Lost'),
(50, 5, 135, 'Lost'),
(51, 6, 145, 'Lost'),
(52, 7, 100, 'Lost'),
(53, 8, 98, 'Lost'),
(54, 9, 95, 'Lost'),
(55, 10, 115, 'Lost'),
(56, 1, 110, 'Lost'),
(57, 2, 125, 'Lost'),
(58, 3, 175, 'Lost'),
(59, 4, 145, 'Lost'),
(60, 5, 185, 'Lost'),
(51, 6, 165, 'Lost'),
(62, 7, 135, 'Lost'),
(63, 8, 225, 'Lost'),
(35, 6, 215, 'Lost');

-- --------------------------------------------------------

--
-- Table structure for table `stadium`
--

CREATE TABLE `stadium` (
  `stadium_id` int(11) NOT NULL,
  `stadium_name` varchar(255) NOT NULL,
  `stadium_location` varchar(255) DEFAULT NULL,
  `capacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stadium`
--

INSERT INTO `stadium` (`stadium_id`, `stadium_name`, `stadium_location`, `capacity`) VALUES
(101, 'M. Chinnaswamy Stadium', 'Bangalore', 40000),
(102, 'Eden Gardens', 'Kolkata', 80000),
(103, 'Narendra Modi Stadium', 'Ahmedabad', 132000),
(104, 'Rajiv Gandhi International Cricket Stadium', 'Hyderabad', 55000),
(105, 'Jawaharlal Nehru Stadium', 'Kerala', 33000),
(107, 'Himachel Pradesh Stadium', 'Himachel Pradesh', 120000),
(108, 'The National Stadium', 'Mumbai', 125000),
(109, 'Arun Stadium', 'Delhi', 10000),
(110, 'Jaitley Stadium', 'New Delhi', 220000),
(106, 'Green Park Stadium', 'Kanpur', 120000);

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `team_id` int(11) NOT NULL,
  `team_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`team_id`, `team_name`) VALUES
(2, 'Chennai Super King'),
(5, 'Delhi Capitals'),
(6, 'Lucknow SuperGiants'),
(1, 'Royal Challengers Bangalore'),
(3, 'Mumbai Indians'),
(7, 'Kolkata Knight Riders'),
(8, 'Sunrisers Hyderbad'),
(9, 'Gujrat Titans'),
(10, 'Rajasthan Royals'),
(4, 'Punjab Kings');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `matches`
--
ALTER TABLE `matches`
  ADD PRIMARY KEY (`match_id`),
  ADD KEY `stadium_id` (`stadium_id`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`player_id`),
  ADD KEY `team_id` (`team_id`);

--
-- Indexes for table `scores`
--
ALTER TABLE `scores`
  ADD KEY `match_id` (`match_id`),
  ADD KEY `team_id` (`team_id`);

--
-- Indexes for table `stadium`
--
ALTER TABLE `stadium`
  ADD PRIMARY KEY (`stadium_id`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`team_id`),
  ADD UNIQUE KEY `team_name` (`team_name`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `matches`
--
ALTER TABLE `matches`
  ADD CONSTRAINT `matches_ibfk_1` FOREIGN KEY (`stadium_id`) REFERENCES `stadium` (`stadium_id`) ON DELETE SET NULL;

--
-- Constraints for table `player`
--
ALTER TABLE `player`
  ADD CONSTRAINT `player_ibfk_1` FOREIGN KEY (`team_id`) REFERENCES `team` (`team_id`) ON DELETE SET NULL;

--
-- Constraints for table `scores`
--
ALTER TABLE `scores`
  ADD CONSTRAINT `scores_ibfk_1` FOREIGN KEY (`match_id`) REFERENCES `matches` (`match_id`) ON DELETE SET NULL,
  ADD CONSTRAINT `scores_ibfk_2` FOREIGN KEY (`team_id`) REFERENCES `team` (`team_id`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
