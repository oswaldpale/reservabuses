-- MySQL Script generated by MySQL Workbench
-- 03/31/16 13:13:03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`USUARIO` (
  `IDUSUARIO` VARCHAR(15) NOT NULL COMMENT '',
  `NOMBRE` VARCHAR(30) NULL COMMENT '',
  `APELLIDOS` VARCHAR(50) NULL COMMENT '',
  `TELEFONO` VARCHAR(15) NULL COMMENT '',
  PRIMARY KEY (`IDUSUARIO`)  COMMENT '',
  UNIQUE INDEX `IDUSUARIO_UNIQUE` (`IDUSUARIO` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TIQUETE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TIQUETE` (
  `IDTIQUETE` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `PRECIO_CANCELADO` INT NOT NULL COMMENT '',
  `IDCIUDAD_ORIGEN` INT NULL COMMENT '',
  `IDCIUDAD_DESTINO` INT NOT NULL COMMENT '',
  `PLACA` VARCHAR(10) NULL COMMENT '',
  `IDEMPLEADO` VARCHAR(15) NULL COMMENT '',
  PRIMARY KEY (`IDTIQUETE`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CIUDAD`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CIUDAD` (
  `IDCIUDAD` INT NOT NULL COMMENT '',
  `CIUDAD` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`IDCIUDAD`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`RESERVA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`RESERVA` (
  `IDRESERVA` INT NOT NULL COMMENT '',
  `FECHA` VARCHAR(45) NULL COMMENT '',
  `ID_ASIENDO` INT NULL COMMENT '',
  PRIMARY KEY (`IDRESERVA`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ASIENTOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ASIENTOS` (
  `IDASIENTO` INT NOT NULL COMMENT '',
  `CODIGO` VARCHAR(10) NULL COMMENT '',
  `ESTADO` TINYINT(4) NULL COMMENT '',
  PRIMARY KEY (`IDASIENTO`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`VIAJE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`VIAJE` (
  `IDVIAJE` INT NOT NULL COMMENT '',
  `FECHA` DATE NULL COMMENT '',
  `HORA_SALIDA` TIME(24) NULL COMMENT '',
  `HORA_LLEGADA_EST` TIME(24) NULL COMMENT '',
  `IDUSUARIO` VARCHAR(15) NULL COMMENT '',
  PRIMARY KEY (`IDVIAJE`)  COMMENT '')
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;