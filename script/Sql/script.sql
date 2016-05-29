-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.10 - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2016-05-29 11:24:13
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for reserva
DROP DATABASE IF EXISTS `reserva`;
CREATE DATABASE IF NOT EXISTS `reserva` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `reserva`;


-- Dumping structure for table reserva.asientos
DROP TABLE IF EXISTS `asientos`;
CREATE TABLE IF NOT EXISTS `asientos` (
  `IDASIENTO` int(11) NOT NULL,
  `CODIGO` varchar(10) DEFAULT NULL,
  `ESTADO` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`IDASIENTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.asientos: ~0 rows (approximately)
/*!40000 ALTER TABLE `asientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `asientos` ENABLE KEYS */;


-- Dumping structure for table reserva.bus
DROP TABLE IF EXISTS `bus`;
CREATE TABLE IF NOT EXISTS `bus` (
  `PLACA` varchar(50) DEFAULT NULL,
  `TIPO` varchar(50) DEFAULT NULL,
  `MODELO` varchar(50) DEFAULT NULL,
  `MARCA` varchar(50) DEFAULT NULL,
  `DISPONIBILIDAD` binary(50) DEFAULT NULL,
  `CAPACIDAD` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.bus: ~0 rows (approximately)
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;


-- Dumping structure for table reserva.ciudad
DROP TABLE IF EXISTS `ciudad`;
CREATE TABLE IF NOT EXISTS `ciudad` (
  `IDCIUDAD` int(11) NOT NULL,
  `CIUDAD` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDCIUDAD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.ciudad: ~0 rows (approximately)
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;


-- Dumping structure for table reserva.persona
DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `CEDULA` varchar(15) NOT NULL DEFAULT '',
  `NOMBRE` varchar(50) DEFAULT NULL,
  `APELLIDO` varchar(50) DEFAULT NULL,
  `TELEFONO` varchar(15) DEFAULT NULL,
  `IMAIL` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CEDULA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.persona: ~7 rows (approximately)
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`CEDULA`, `NOMBRE`, `APELLIDO`, `TELEFONO`, `IMAIL`) VALUES
	('', '', '', '', ''),
	('111', 'oswaldo', 'fdfdfd', '11111', '34erfdfd'),
	('233434', 'oswaldo', 'leal', '34343434', 'oswaldpale@hotmail.com'),
	('2334343434', 'oswaldo', 'leal', '34343434', 'oswaldpale@hotmail.com'),
	('3434', '14343', '4343', '3434', '3434'),
	('4232434343434', 'oswaldo', 'carlos', '11111', 'oswaldpale@hotmail.com'),
	('iii', 'oswaldo', 'fdfdfd', 'erer', '34erfdfd');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;


-- Dumping structure for table reserva.reserva
DROP TABLE IF EXISTS `reserva`;
CREATE TABLE IF NOT EXISTS `reserva` (
  `IDRESERVA` int(11) NOT NULL,
  `FECHA` varchar(45) DEFAULT NULL,
  `ESTADO` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDRESERVA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.reserva: ~0 rows (approximately)
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;


-- Dumping structure for table reserva.tipo_bus
DROP TABLE IF EXISTS `tipo_bus`;
CREATE TABLE IF NOT EXISTS `tipo_bus` (
  `idTipoBus` int(10) DEFAULT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.tipo_bus: ~0 rows (approximately)
/*!40000 ALTER TABLE `tipo_bus` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_bus` ENABLE KEYS */;


-- Dumping structure for table reserva.tiquete
DROP TABLE IF EXISTS `tiquete`;
CREATE TABLE IF NOT EXISTS `tiquete` (
  `IDTIQUETE` int(11) NOT NULL AUTO_INCREMENT,
  `PRECIO_CANCELADO` int(11) NOT NULL,
  `IDCIUDAD_ORIGEN` int(11) DEFAULT NULL,
  `IDCIUDAD_DESTINO` int(11) NOT NULL,
  `PLACA` varchar(10) DEFAULT NULL,
  `IDEMPLEADO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`IDTIQUETE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.tiquete: ~0 rows (approximately)
/*!40000 ALTER TABLE `tiquete` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiquete` ENABLE KEYS */;


-- Dumping structure for table reserva.usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `IDUSUARIO` varchar(15) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `APELLIDOS` varchar(50) DEFAULT NULL,
  `TELEFONO` varchar(15) DEFAULT NULL,
  `LOGIN` varchar(50) DEFAULT NULL,
  `CONTRASENA` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IDUSUARIO`),
  UNIQUE KEY `IDUSUARIO_UNIQUE` (`IDUSUARIO`),
  UNIQUE KEY `LOGIN` (`LOGIN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.usuario: ~1 rows (approximately)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`IDUSUARIO`, `NOMBRE`, `APELLIDOS`, `TELEFONO`, `LOGIN`, `CONTRASENA`) VALUES
	('1', 'OSWALDO', 'PAMO LEAL', '4343589', 'OPAMO', 'YULIER');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;


-- Dumping structure for table reserva.viaje
DROP TABLE IF EXISTS `viaje`;
CREATE TABLE IF NOT EXISTS `viaje` (
  `IDVIAJE` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `IDUSUARIO` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`IDVIAJE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.viaje: ~0 rows (approximately)
/*!40000 ALTER TABLE `viaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `viaje` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
