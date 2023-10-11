-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 11-10-2023 a las 01:32:46
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
-- Estructura de tabla para la tabla `cierre_de_caja`
--

DROP TABLE IF EXISTS `cierre_de_caja`;
CREATE TABLE IF NOT EXISTS `cierre_de_caja` (
  `Valor_Vendido` int NOT NULL,
  `Ganacias` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Valor_Vendido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas_por_cobrar`
--

DROP TABLE IF EXISTS `cuentas_por_cobrar`;
CREATE TABLE IF NOT EXISTS `cuentas_por_cobrar` (
  `n_factura` int NOT NULL,
  `detalle` varchar(255) DEFAULT NULL,
  `forma_de_pago` varchar(255) DEFAULT NULL,
  `n_de_cuenta` varchar(255) DEFAULT NULL,
  `total_a_pagar` varchar(255) DEFAULT NULL,
  `valor_de_item` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`n_factura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `cuentas_por_cobrar`
--

INSERT INTO `cuentas_por_cobrar` (`n_factura`, `detalle`, `forma_de_pago`, `n_de_cuenta`, `total_a_pagar`, `valor_de_item`) VALUES
(123, 'Martillo', 'Efectivo', '456', '52000', '50000'),
(456, 'arroz', 'Efectivo', '789', '1620', '1550'),
(789, 'Pala', 'Targeta', '458', '48500', '45600'),
(963, 'Carne', 'Fiado', '741', '2530', '24500');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descuentos_promociones`
--

DROP TABLE IF EXISTS `descuentos_promociones`;
CREATE TABLE IF NOT EXISTS `descuentos_promociones` (
  `Cod_Producto` int NOT NULL,
  `Vigencia_Promocion` varchar(20) DEFAULT NULL,
  `Vigencia_Descuento` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`Cod_Producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devoluciones`
--

DROP TABLE IF EXISTS `devoluciones`;
CREATE TABLE IF NOT EXISTS `devoluciones` (
  `n_factura` int NOT NULL,
  `fecha_devolucion` varchar(255) DEFAULT NULL,
  `motivo_devolucion` varchar(255) DEFAULT NULL,
  `n_devolucio` int DEFAULT NULL,
  `n_devolucion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`n_factura`),
  KEY `FK1lejqhj1hfvgdoq7xr2wm8wnr` (`n_devolucio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `devoluciones`
--

INSERT INTO `devoluciones` (`n_factura`, `fecha_devolucion`, `motivo_devolucion`, `n_devolucio`, `n_devolucion`) VALUES
(123, '12/25/1995', 'Codigo 011', 456, NULL),
(456, '20/09/2022', 'Codigo 012', 963, NULL),
(789, '25/04/2023', 'Codigo 011', 789, NULL);

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
(789, '23/06/2023', '05/04/2023', '01 , 05 , 06 ', 'Codigo 012');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingreso_factura`
--

DROP TABLE IF EXISTS `ingreso_factura`;
CREATE TABLE IF NOT EXISTS `ingreso_factura` (
  `N_Factura` int NOT NULL,
  `Cod_Producto` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`N_Factura`),
  KEY `Cod_Producto` (`Cod_Producto`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

DROP TABLE IF EXISTS `pago`;
CREATE TABLE IF NOT EXISTS `pago` (
  `Cod_Producto` int NOT NULL,
  `Nombre_Producto` varchar(20) DEFAULT NULL,
  `Presentacion_Producto` varchar(20) DEFAULT NULL,
  `Valor_Total` varchar(20) DEFAULT NULL,
  `Valor_a_Pagar` varchar(20) DEFAULT NULL,
  `Tipos_de_Pago` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Cod_Producto`),
  KEY `Presentacion_Producto` (`Presentacion_Producto`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

DROP TABLE IF EXISTS `precios`;
CREATE TABLE IF NOT EXISTS `precios` (
  `Cod_Producto` int NOT NULL,
  `Presentacion_Producto` varchar(20) DEFAULT NULL,
  `Productos_Existentes` varchar(20) DEFAULT NULL,
  `Fecha_De_Ingreso` varchar(20) DEFAULT NULL,
  `Fecha_De_Vencimiento` varchar(20) DEFAULT NULL,
  `Valor_Producto` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Cod_Producto`),
  KEY `Presentacion_Producto` (`Presentacion_Producto`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `Cod_Usuario` int NOT NULL,
  `Credenciales_Usuario` varchar(20) DEFAULT NULL,
  `Correo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Cod_Usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `devoluciones`
--
ALTER TABLE `devoluciones`
  ADD CONSTRAINT `FK1lejqhj1hfvgdoq7xr2wm8wnr` FOREIGN KEY (`n_devolucio`) REFERENCES `cuentas_por_cobrar` (`n_factura`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
