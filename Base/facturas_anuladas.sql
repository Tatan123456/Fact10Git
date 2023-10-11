-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 10-10-2023 a las 01:44:22
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fact10`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas_anuladas`
--

DROP TABLE IF EXISTS `facturas_anuladas`;
CREATE TABLE IF NOT EXISTS `facturas_anuladas` (
  `n_factura` int NOT NULL,
  `fecha_anulacion` varchar(255) DEFAULT NULL,
  `fecha_pago` varchar(255) DEFAULT NULL,
  `items_anulados` varchar(255) DEFAULT NULL,
  `motivo_anulacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`n_factura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `facturas_anuladas`
--

INSERT INTO `facturas_anuladas` (`n_factura`, `fecha_anulacion`, `fecha_pago`, `items_anulados`, `motivo_anulacion`) VALUES
(123, '22/10/2023', '25/09/2023', '01 , 03', 'Codigo 011'),
(456, '11/05/2023', '17/02/2023', '05', 'Codigo 012'),
(789, '23/06/2023', '05/03/2023', '01 , 05 , 06 ', 'Codigo 012');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
