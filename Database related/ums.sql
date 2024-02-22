-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2022 at 12:12 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ums`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_student`
--

CREATE TABLE `attendance_student` (
  `RegNo` varchar(30) NOT NULL,
  `Date` varchar(30) NOT NULL,
  `first` varchar(30) NOT NULL,
  `second` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance_student`
--

INSERT INTO `attendance_student` (`RegNo`, `Date`, `first`, `second`) VALUES
('eb3/56347/21', 'Fri Mar 2022', 'Present', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_teacher`
--

CREATE TABLE `attendance_teacher` (
  `emp_id` varchar(30) NOT NULL,
  `Date` varchar(30) NOT NULL,
  `first` varchar(30) NOT NULL,
  `second` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `RegNo` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `fathers_name` varchar(50) NOT NULL,
  `course` varchar(30) NOT NULL,
  `faculty` varchar(20) NOT NULL,
  `semester` varchar(30) NOT NULL,
  `fee_paid` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`RegNo`, `name`, `fathers_name`, `course`, `faculty`, `semester`, `fee_paid`) VALUES
('eb3/56347/21', 'mashaa macharia', 'Nesh vickie', 'Computer science', 'FSET', '1st', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(123456, 'Macharia', 'mashaa');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `RegNo` varchar(50) NOT NULL,
  `marks1` varchar(50) NOT NULL,
  `marks2` varchar(50) NOT NULL,
  `marks3` varchar(50) NOT NULL,
  `marks4` varchar(50) NOT NULL,
  `marks5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `name` varchar(250) NOT NULL,
  `fathers_name` varchar(250) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `otherNo` varchar(30) NOT NULL,
  `RegNo` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `faculty` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `otherNo`, `RegNo`, `course`, `faculty`) VALUES
('Mashaa macharia', 'nesh vickie', '20', '11/02/2002', 'Chuka', '0797105298', 'mashaa@gmail.com','0797105297', 'eb3/56347/21','computer science', 'FSET');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `regNo` varchar(30) NOT NULL,
  `subject1` varchar(50) NOT NULL,
  `subject2` varchar(50) NOT NULL,
  `subject3` varchar(50) NOT NULL,
  `subject4` varchar(50) NOT NULL,
  `subject5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(250) NOT NULL,
  `fathers_name` varchar(250) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `otherNo` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `emp_id` varchar(20) NOT NULL,
  `dep` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
