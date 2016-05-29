-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.20 - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2016-05-29 17:54:42
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for reserva
CREATE DATABASE IF NOT EXISTS `reserva` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `reserva`;


-- Dumping structure for table reserva.asientos
CREATE TABLE IF NOT EXISTS `asientos` (
  `IDASIENTO` int(11) NOT NULL,
  `CODIGO` varchar(10) DEFAULT NULL,
  `ESTADO` set('DISPONIBLE','OCUPADO') DEFAULT NULL,
  `IDTIPOBUS` int(10) DEFAULT NULL,
  PRIMARY KEY (`IDASIENTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.asientos: ~30 rows (approximately)
/*!40000 ALTER TABLE `asientos` DISABLE KEYS */;
INSERT INTO `asientos` (`IDASIENTO`, `CODIGO`, `ESTADO`, `IDTIPOBUS`) VALUES
	(1, 'N01', 'OCUPADO', 1),
	(2, 'N02', 'OCUPADO', 1),
	(3, 'N03', 'DISPONIBLE', 1),
	(4, 'N04', 'DISPONIBLE', 1),
	(5, 'N05', 'DISPONIBLE', 1),
	(6, 'N06', 'DISPONIBLE', 1),
	(7, 'N07', 'DISPONIBLE', 1),
	(8, 'N08', 'DISPONIBLE', 1),
	(9, 'N09', 'DISPONIBLE', 1),
	(10, 'N10', 'DISPONIBLE', 1),
	(11, 'N11', 'DISPONIBLE', 1),
	(12, 'N12', 'DISPONIBLE', 1),
	(13, 'N13', 'DISPONIBLE', 1),
	(14, 'N14', 'DISPONIBLE', 1),
	(15, 'N15', 'DISPONIBLE', 1),
	(16, 'N16', 'DISPONIBLE', 1),
	(17, 'N17', 'DISPONIBLE', 1),
	(18, 'N18', 'DISPONIBLE', 1),
	(19, 'N19', 'DISPONIBLE', 1),
	(20, 'N20', 'DISPONIBLE', 1),
	(21, 'N21', 'DISPONIBLE', 1),
	(22, 'N22', 'DISPONIBLE', 1),
	(23, 'N23', 'DISPONIBLE', 1),
	(24, 'N24', 'DISPONIBLE', 1),
	(25, 'N25', 'DISPONIBLE', 1),
	(26, 'N26', 'DISPONIBLE', 1),
	(27, 'N27', 'DISPONIBLE', 1),
	(28, 'N28', 'DISPONIBLE', 1),
	(29, 'N29', 'DISPONIBLE', 1),
	(30, 'N30', 'DISPONIBLE', 1);
/*!40000 ALTER TABLE `asientos` ENABLE KEYS */;


-- Dumping structure for table reserva.asiento_tiquete
CREATE TABLE IF NOT EXISTS `asiento_tiquete` (
  `IDTIQUETE` int(10) DEFAULT NULL,
  `IDASIENTO` int(10) DEFAULT NULL,
  `ESTADO` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.asiento_tiquete: ~0 rows (approximately)
/*!40000 ALTER TABLE `asiento_tiquete` DISABLE KEYS */;
/*!40000 ALTER TABLE `asiento_tiquete` ENABLE KEYS */;


-- Dumping structure for table reserva.bus
CREATE TABLE IF NOT EXISTS `bus` (
  `PLACA` varchar(50) DEFAULT NULL,
  `MODELO` varchar(50) DEFAULT NULL,
  `MARCA` varchar(50) DEFAULT NULL,
  `DISPONIBILIDAD` int(2) DEFAULT NULL,
  `CODIGO` int(10) NOT NULL DEFAULT '0',
  `IDTIPOBUS` int(10) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.bus: ~0 rows (approximately)
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;


-- Dumping structure for table reserva.ciudad
CREATE TABLE IF NOT EXISTS `ciudad` (
  `IDCIUDAD` int(11) NOT NULL,
  `CIUDAD` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDCIUDAD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.ciudad: ~5 rows (approximately)
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
INSERT INTO `ciudad` (`IDCIUDAD`, `CIUDAD`) VALUES
	(1, 'florencia'),
	(2, 'neiva'),
	(3, 'ibague'),
	(4, 'bogota'),
	(5, 'pereira'),
	(6, 'cucuta');
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;


-- Dumping structure for table reserva.horario
CREATE TABLE IF NOT EXISTS `horario` (
  `CODIGO` int(10) DEFAULT NULL,
  `HORA` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.horario: ~23 rows (approximately)
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` (`CODIGO`, `HORA`) VALUES
	(1, '12:00:00'),
	(2, '01:00:00'),
	(3, '02:00:00'),
	(4, '03:00:00'),
	(5, '04:00:00'),
	(6, '05:00:00'),
	(7, '06:00:00'),
	(8, '08:00:00'),
	(9, '09:00:00'),
	(10, '10:00:00'),
	(11, '11:00:00'),
	(13, '13:00:00'),
	(14, '14:00:00'),
	(15, '15:00:00'),
	(16, '16:00:00'),
	(17, '17:00:00'),
	(18, '18:00:00'),
	(19, '19:00:00'),
	(20, '20:00:00'),
	(21, '21:00:00'),
	(22, '22:00:00'),
	(23, '23:00:00'),
	(24, '24:00:00');
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;


-- Dumping structure for table reserva.persona
CREATE TABLE IF NOT EXISTS `persona` (
  `CEDULA` varchar(15) NOT NULL DEFAULT '',
  `NOMBRE` varchar(50) DEFAULT NULL,
  `APELLIDO` varchar(50) DEFAULT NULL,
  `TELEFONO` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CEDULA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.persona: ~0 rows (approximately)
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`CEDULA`, `NOMBRE`, `APELLIDO`, `TELEFONO`, `EMAIL`) VALUES
	('1117523865', 'CRISRIAN', 'MENESES', '3165723624', 'CHRISTAFARI20102@GMAIL.COM'),
	('1231232', 'JULIO', 'CASQUITO', '4341208', 'CASQUITO123@GMAIL.COM');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;


-- Dumping structure for table reserva.reserva
CREATE TABLE IF NOT EXISTS `reserva` (
  `IDRESERVA` int(11) NOT NULL,
  `FECHA` varchar(45) DEFAULT NULL,
  `ESTADO` int(11) DEFAULT NULL,
  `IDTIQUETE` int(11) DEFAULT NULL,
  `IDPERSONA` int(10) DEFAULT NULL,
  `IDUSUARIO` int(10) DEFAULT NULL,
  `IDVIAJEDESTINO` int(10) DEFAULT NULL,
  `IDVIAJEORIGEN` int(10) DEFAULT NULL,
  `IDBUS` int(10) DEFAULT NULL,
  PRIMARY KEY (`IDRESERVA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.reserva: ~0 rows (approximately)
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;


-- Dumping structure for table reserva.tipo_bus
CREATE TABLE IF NOT EXISTS `tipo_bus` (
  `CODIGO` int(10) NOT NULL DEFAULT '0',
  `NOMBRE` varchar(50) DEFAULT NULL,
  `CAPACIDAD` int(11) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.tipo_bus: ~1 rows (approximately)
/*!40000 ALTER TABLE `tipo_bus` DISABLE KEYS */;
INSERT INTO `tipo_bus` (`CODIGO`, `NOMBRE`, `CAPACIDAD`) VALUES
	(1, 'NAVETTE', 30);
/*!40000 ALTER TABLE `tipo_bus` ENABLE KEYS */;


-- Dumping structure for table reserva.tiquete
CREATE TABLE IF NOT EXISTS `tiquete` (
  `IDTIQUETE` int(11) NOT NULL AUTO_INCREMENT,
  `PRECIO` int(11) NOT NULL,
  `IDCIUDAD_ORIGEN` int(11) DEFAULT NULL,
  `IDCIUDAD_DESTINO` int(11) NOT NULL,
  `IDBUS` int(10) DEFAULT NULL,
  `CANTIDAD_ASIENTO` int(10) DEFAULT NULL,
  PRIMARY KEY (`IDTIQUETE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.tiquete: ~0 rows (approximately)
/*!40000 ALTER TABLE `tiquete` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiquete` ENABLE KEYS */;


-- Dumping structure for table reserva.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `IDUSUARIO` varchar(15) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `ESTADO` set('DISPONIBLE','OCUPADO') DEFAULT NULL,
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
INSERT INTO `usuario` (`IDUSUARIO`, `NOMBRE`, `ESTADO`, `APELLIDOS`, `TELEFONO`, `LOGIN`, `CONTRASENA`) VALUES
	('1', 'OSWALDO', NULL, 'PAMO LEAL', '4343589', 'OPAMO', 'karito'),
	('2', 'CHRISTIAN', NULL, 'MENESES', '4341208', 'CHRISTAFARI', 'ROOT');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;


-- Dumping structure for table reserva.viaje
CREATE TABLE IF NOT EXISTS `viaje` (
  `IDVIAJE` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `IDRESERVA` int(10) DEFAULT NULL,
  `IDCIUDADORIGEN` int(10) DEFAULT NULL,
  `IDCIUDADDESTINO` int(10) DEFAULT NULL,
  `PRECIO` int(10) DEFAULT NULL,
  PRIMARY KEY (`IDVIAJE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table reserva.viaje: ~0 rows (approximately)
/*!40000 ALTER TABLE `viaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `viaje` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
