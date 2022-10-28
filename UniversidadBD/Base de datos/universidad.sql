-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20221020.10dfc6d641
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2022 a las 03:00:02
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `codigo` varchar(15) COLLATE utf8_bin NOT NULL,
  `nombre` varchar(15) COLLATE utf8_bin NOT NULL,
  `apellido` varchar(15) COLLATE utf8_bin NOT NULL,
  `direccion` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`codigo`, `nombre`, `apellido`, `direccion`) VALUES
('05096', 'claudia', 'gomez', 'ufps'),
('1151850', 'Ricardo', 'Vargas', 'Av1 20-35'),
('1152002', 'Jairo', 'Urán', 'ufps'),
('1152006', 'Vladimir', 'Peña', 'ufps'),
('1152023', 'Rigo', 'lindo', 'ufps'),
('1152236', 'Juan', 'Cho', 'ufps'),
('11524506', 'Bayron', 'Vargas', 'ufps'),
('12345', 'Julio', 'Cortazar', 'calle 20 35-15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `codigo` varchar(10) COLLATE utf8_bin NOT NULL,
  `nombre` varchar(15) COLLATE utf8_bin NOT NULL,
  `creditos` varchar(10) COLLATE utf8_bin NOT NULL,
  `codProfesor` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`codigo`, `nombre`, `creditos`, `codProfesor`) VALUES
('2323', 'DatosAvanzados', '4', '1152002'),
('2323424', 'EstDatos', '4', '1152006');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codProfesor` (`codProfesor`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `materia_ibfk_1` FOREIGN KEY (`codProfesor`) REFERENCES `docente` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
