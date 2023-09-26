CREATE DATABASE  IF NOT EXISTS `e_commerce` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `e_commerce`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: e_commerce
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carrinho_compras`
--

DROP TABLE IF EXISTS `carrinho_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrinho_compras` (
  `sessao` varchar(32) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtd` int(11) NOT NULL,
  `val_unit` decimal(10,2) NOT NULL,
  `desconto` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `data_hora_sessa` datetime NOT NULL,
  KEY `id_produto` (`id_produto`),
  KEY `ix_cc_1` (`sessao`),
  CONSTRAINT `carrinho_compras_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrinho_compras`
--

LOCK TABLES `carrinho_compras` WRITE;
/*!40000 ALTER TABLE `carrinho_compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrinho_compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Eletrônicos'),(2,'Roupas'),(3,'Livros'),(4,'Móveis');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidades`
--

DROP TABLE IF EXISTS `cidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidades` (
  `id_cidade` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cidade` varchar(70) NOT NULL,
  `cod_mun` char(7) NOT NULL,
  `cod_uf` tinyint(2) NOT NULL,
  PRIMARY KEY (`id_cidade`),
  KEY `fk_cid_1` (`cod_uf`),
  CONSTRAINT `fk_cid_1` FOREIGN KEY (`cod_uf`) REFERENCES `unidade_federal` (`cod_uf`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidades`
--

LOCK TABLES `cidades` WRITE;
/*!40000 ALTER TABLE `cidades` DISABLE KEYS */;
INSERT INTO `cidades` VALUES (1,'Rio de Janeiro','3304557',1),(2,'São Paulo','3550308',2),(3,'Manaus','1302603',3),(4,'Belo Horizonte','3106200',4);
/*!40000 ALTER TABLE `cidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_endereco`
--

DROP TABLE IF EXISTS `cliente_endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_endereco` (
  `id_endereco` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` int(11) NOT NULL,
  `tipo` enum('P','A') NOT NULL,
  `endereco` varchar(60) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `id_cidade` int(11) NOT NULL,
  PRIMARY KEY (`id_endereco`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_cidade` (`id_cidade`),
  CONSTRAINT `cliente_endereco_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `cliente_endereco_ibfk_2` FOREIGN KEY (`id_cidade`) REFERENCES `cidades` (`id_cidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_endereco`
--

LOCK TABLES `cliente_endereco` WRITE;
/*!40000 ALTER TABLE `cliente_endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente_endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(32) NOT NULL,
  `sobrenome` varchar(32) NOT NULL,
  `email` varchar(60) NOT NULL,
  `senha` varchar(32) NOT NULL,
  `data_nasc` date NOT NULL,
  `data_cadastro` datetime NOT NULL,
  `ult_acesso` datetime DEFAULT NULL,
  `ult_compra` datetime DEFAULT NULL,
  `situacao` enum('A','B') NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'João','Silva','joao@example.com','senha123','1990-05-15','2023-09-25 10:00:00',NULL,NULL,'A'),(2,'Maria','Santos','maria@example.com','senha456','1985-08-20','2023-09-25 11:30:00',NULL,NULL,'A'),(3,'Carlos','Lima','carlos@example.com','senha789','1992-03-10','2023-09-25 14:15:00',NULL,NULL,'A'),(4,'Lucas','Gonçalves','lucas.gf.batista@gmail.com','AnaTeAmo','0000-00-00','2023-09-25 13:47:00',NULL,NULL,'A'),(5,'Ana','Lopes','laysmalhuda@gmail.com','lays2304','1997-03-24','2023-09-25 13:47:00',NULL,NULL,'A'),(6,'Ana','Ferreira','ana@example.com','senha101','1988-11-05','2023-09-25 16:45:00',NULL,NULL,'A');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cond_pagto`
--

DROP TABLE IF EXISTS `cond_pagto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cond_pagto` (
  `id_pagto` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `tipo` enum('C','D','B') NOT NULL,
  PRIMARY KEY (`id_pagto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cond_pagto`
--

LOCK TABLES `cond_pagto` WRITE;
/*!40000 ALTER TABLE `cond_pagto` DISABLE KEYS */;
/*!40000 ALTER TABLE `cond_pagto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cond_pagto_det`
--

DROP TABLE IF EXISTS `cond_pagto_det`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cond_pagto_det` (
  `id_pagto` int(11) NOT NULL,
  `parcela` int(11) NOT NULL,
  `percentual` decimal(10,2) NOT NULL,
  `dias` int(11) NOT NULL,
  KEY `id_pagto` (`id_pagto`),
  CONSTRAINT `cond_pagto_det_ibfk_1` FOREIGN KEY (`id_pagto`) REFERENCES `cond_pagto` (`id_pagto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cond_pagto_det`
--

LOCK TABLES `cond_pagto_det` WRITE;
/*!40000 ALTER TABLE `cond_pagto_det` DISABLE KEYS */;
/*!40000 ALTER TABLE `cond_pagto_det` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estoque`
--

DROP TABLE IF EXISTS `estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estoque` (
  `id_produto` int(11) NOT NULL,
  `estoque_total` int(11) NOT NULL,
  `estoque_livre` int(11) DEFAULT NULL,
  `estoque_reservado` int(11) DEFAULT NULL,
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `estoque_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estoque`
--

LOCK TABLES `estoque` WRITE;
/*!40000 ALTER TABLE `estoque` DISABLE KEYS */;
INSERT INTO `estoque` VALUES (6,30,20,10),(7,48,28,20),(8,61,31,30);
/*!40000 ALTER TABLE `estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fabricantes`
--

DROP TABLE IF EXISTS `fabricantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fabricantes` (
  `id_fabricante` int(11) NOT NULL AUTO_INCREMENT,
  `nome_fabricante` varchar(50) NOT NULL,
  PRIMARY KEY (`id_fabricante`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricantes`
--

LOCK TABLES `fabricantes` WRITE;
/*!40000 ALTER TABLE `fabricantes` DISABLE KEYS */;
INSERT INTO `fabricantes` VALUES (1,'Sony'),(2,'Samsung'),(3,'Nike'),(4,'IKEA');
/*!40000 ALTER TABLE `fabricantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nf_itens`
--

DROP TABLE IF EXISTS `nf_itens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nf_itens` (
  `num_nota` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtd` int(11) NOT NULL,
  `val_unit` decimal(10,2) NOT NULL,
  `desconto` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  KEY `num_nota` (`num_nota`),
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `nf_itens_ibfk_1` FOREIGN KEY (`num_nota`) REFERENCES `nota_fiscal` (`num_nota`),
  CONSTRAINT `nf_itens_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nf_itens`
--

LOCK TABLES `nf_itens` WRITE;
/*!40000 ALTER TABLE `nf_itens` DISABLE KEYS */;
/*!40000 ALTER TABLE `nf_itens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nf_obs`
--

DROP TABLE IF EXISTS `nf_obs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nf_obs` (
  `num_nota` int(11) NOT NULL,
  `obs` varchar(255) NOT NULL,
  KEY `num_nota` (`num_nota`),
  CONSTRAINT `nf_obs_ibfk_1` FOREIGN KEY (`num_nota`) REFERENCES `nota_fiscal` (`num_nota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nf_obs`
--

LOCK TABLES `nf_obs` WRITE;
/*!40000 ALTER TABLE `nf_obs` DISABLE KEYS */;
/*!40000 ALTER TABLE `nf_obs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nota_fiscal`
--

DROP TABLE IF EXISTS `nota_fiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nota_fiscal` (
  `num_nota` int(11) NOT NULL AUTO_INCREMENT,
  `num_ped_ref` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_endereco` int(11) NOT NULL,
  `id_pagto` int(11) NOT NULL,
  `total_prod` decimal(10,2) DEFAULT NULL,
  `total_frete` decimal(10,2) DEFAULT NULL,
  `total_desc` decimal(10,2) DEFAULT NULL,
  `total_nf` decimal(10,2) DEFAULT NULL,
  `data_nf` datetime NOT NULL,
  `status_nf` enum('N','C','D') DEFAULT NULL,
  `id_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`num_nota`),
  KEY `num_ped_ref` (`num_ped_ref`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_endereco` (`id_endereco`),
  KEY `id_pagto` (`id_pagto`),
  CONSTRAINT `nota_fiscal_ibfk_1` FOREIGN KEY (`num_ped_ref`) REFERENCES `pedidos` (`num_pedido`),
  CONSTRAINT `nota_fiscal_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `nota_fiscal_ibfk_3` FOREIGN KEY (`id_endereco`) REFERENCES `cliente_endereco` (`id_endereco`),
  CONSTRAINT `nota_fiscal_ibfk_4` FOREIGN KEY (`id_pagto`) REFERENCES `cond_pagto_det` (`id_pagto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nota_fiscal`
--

LOCK TABLES `nota_fiscal` WRITE;
/*!40000 ALTER TABLE `nota_fiscal` DISABLE KEYS */;
/*!40000 ALTER TABLE `nota_fiscal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido_itens`
--

DROP TABLE IF EXISTS `pedido_itens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido_itens` (
  `num_pedido` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtd` int(11) NOT NULL,
  `val_unit` decimal(10,2) NOT NULL,
  `desconto` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  KEY `num_pedido` (`num_pedido`),
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `pedido_itens_ibfk_1` FOREIGN KEY (`num_pedido`) REFERENCES `pedidos` (`num_pedido`),
  CONSTRAINT `pedido_itens_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido_itens`
--

LOCK TABLES `pedido_itens` WRITE;
/*!40000 ALTER TABLE `pedido_itens` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido_itens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido_obs`
--

DROP TABLE IF EXISTS `pedido_obs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido_obs` (
  `num_pedido` int(11) NOT NULL,
  `obs` varchar(255) NOT NULL,
  KEY `num_pedido` (`num_pedido`),
  CONSTRAINT `pedido_obs_ibfk_1` FOREIGN KEY (`num_pedido`) REFERENCES `pedidos` (`num_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido_obs`
--

LOCK TABLES `pedido_obs` WRITE;
/*!40000 ALTER TABLE `pedido_obs` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido_obs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `num_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` int(11) NOT NULL,
  `id_endereco` int(11) NOT NULL,
  `id_pagto` int(11) NOT NULL,
  `total_prod` decimal(10,2) DEFAULT NULL,
  `total_frete` decimal(10,2) DEFAULT NULL,
  `total_desc` decimal(10,2) DEFAULT NULL,
  `total_pedido` decimal(10,2) DEFAULT NULL,
  `data_pedido` datetime NOT NULL,
  `previsao_entrega` date DEFAULT NULL,
  `efetiva_entrega` date DEFAULT NULL,
  `status_ped` enum('A','S','F','T','E') DEFAULT NULL,
  PRIMARY KEY (`num_pedido`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_endereco` (`id_endereco`),
  KEY `id_pagto` (`id_pagto`),
  CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `pedidos_ibfk_2` FOREIGN KEY (`id_endereco`) REFERENCES `cliente_endereco` (`id_endereco`),
  CONSTRAINT `pedidos_ibfk_3` FOREIGN KEY (`id_pagto`) REFERENCES `cond_pagto` (`id_pagto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `id_fabricante` int(11) NOT NULL,
  `preco_custo` decimal(10,2) DEFAULT NULL,
  `preco_venda` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_produto`),
  KEY `id_categoria` (`id_categoria`),
  KEY `id_fabricante` (`id_fabricante`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`),
  CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_fabricante`) REFERENCES `fabricantes` (`id_fabricante`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Smartphone XYZ',1,1,300.00,499.99),(2,'Notebook ABC',1,2,700.00,999.99),(3,'Camiseta Casual',2,3,20.00,39.99),(4,'Livro de Ficção',3,4,10.00,19.99),(5,'Tablet Pro X',1,2,250.00,399.99),(6,'Câmera Digital Y',1,1,150.00,299.99),(7,'Sapato Esportivo Z',2,3,50.00,89.99),(8,'Livro de História A',3,4,15.00,29.99),(9,'Estante de Livros B',4,4,80.00,149.99),(10,'Blusa Feminina C',2,3,25.00,49.99),(11,'Jogo de Videogame D',1,1,30.00,59.99),(12,'Cadeira de Escritório E',4,4,120.00,199.99);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto_caracter`
--

DROP TABLE IF EXISTS `produto_caracter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto_caracter` (
  `id_produto` int(11) NOT NULL,
  `caracteristica` varchar(50) NOT NULL,
  `valor` varchar(50) NOT NULL,
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `produto_caracter_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto_caracter`
--

LOCK TABLES `produto_caracter` WRITE;
/*!40000 ALTER TABLE `produto_caracter` DISABLE KEYS */;
INSERT INTO `produto_caracter` VALUES (6,'Telefone de ultima geracao','499.99'),(7,'Notebook super rapido','999.99'),(8,'Camiseta da moda','19.99');
/*!40000 ALTER TABLE `produto_caracter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rastreabilidade`
--

DROP TABLE IF EXISTS `rastreabilidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rastreabilidade` (
  `num_pedido` int(11) NOT NULL,
  `status_ped` char(1) NOT NULL,
  `data_hora` datetime NOT NULL,
  `id_user` varchar(50) DEFAULT NULL,
  KEY `num_pedido` (`num_pedido`),
  CONSTRAINT `rastreabilidade_ibfk_1` FOREIGN KEY (`num_pedido`) REFERENCES `pedidos` (`num_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rastreabilidade`
--

LOCK TABLES `rastreabilidade` WRITE;
/*!40000 ALTER TABLE `rastreabilidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `rastreabilidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidade_federal`
--

DROP TABLE IF EXISTS `unidade_federal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidade_federal` (
  `cod_uf` tinyint(4) NOT NULL,
  `uf` char(2) NOT NULL,
  `nome_uf` varchar(50) NOT NULL,
  PRIMARY KEY (`cod_uf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidade_federal`
--

LOCK TABLES `unidade_federal` WRITE;
/*!40000 ALTER TABLE `unidade_federal` DISABLE KEYS */;
INSERT INTO `unidade_federal` VALUES (1,'AC','Acre'),(2,'AL','Alagoas'),(3,'AM','Amazonas'),(4,'AP','Amapá');
/*!40000 ALTER TABLE `unidade_federal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nome_user` varchar(50) NOT NULL,
  `email_user` varchar(60) NOT NULL,
  `senha` varchar(32) NOT NULL,
  `data_cadastro` datetime NOT NULL,
  `status` enum('A','B') DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `ix_usr_1` (`email_user`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'João Silva','joao@example.com','senha123','2023-09-25 21:07:15','A'),(2,'Maria Santos','maria@example.com','senha456','2023-09-25 21:07:15','A'),(3,'Carlos Lima','carlos@example.com','senha789','2023-09-25 21:07:15','A'),(4,'Ana Ferreira','ana@example.com','senha101','2023-09-25 21:07:15','A');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vw_clientes_enderecos`
--

DROP TABLE IF EXISTS `vw_clientes_enderecos`;
/*!50001 DROP VIEW IF EXISTS `vw_clientes_enderecos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_clientes_enderecos` AS SELECT 
 1 AS `id_cliente`,
 1 AS `nome`,
 1 AS `sobrenome`,
 1 AS `email`,
 1 AS `endereco`,
 1 AS `numero`,
 1 AS `bairro`,
 1 AS `cep`,
 1 AS `nome_cidade`,
 1 AS `uf`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_clientes_sem_compras`
--

DROP TABLE IF EXISTS `vw_clientes_sem_compras`;
/*!50001 DROP VIEW IF EXISTS `vw_clientes_sem_compras`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_clientes_sem_compras` AS SELECT 
 1 AS `id_cliente`,
 1 AS `nome`,
 1 AS `sobrenome`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_estoque_produtos`
--

DROP TABLE IF EXISTS `vw_estoque_produtos`;
/*!50001 DROP VIEW IF EXISTS `vw_estoque_produtos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_estoque_produtos` AS SELECT 
 1 AS `id_produto`,
 1 AS `descricao`,
 1 AS `estoque_total`,
 1 AS `estoque_livre`,
 1 AS `estoque_reservado`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_faturamento_por_categoria`
--

DROP TABLE IF EXISTS `vw_faturamento_por_categoria`;
/*!50001 DROP VIEW IF EXISTS `vw_faturamento_por_categoria`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_faturamento_por_categoria` AS SELECT 
 1 AS `categoria`,
 1 AS `faturamento_total`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_faturamento_produto`
--

DROP TABLE IF EXISTS `vw_faturamento_produto`;
/*!50001 DROP VIEW IF EXISTS `vw_faturamento_produto`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_faturamento_produto` AS SELECT 
 1 AS `id_produto`,
 1 AS `descricao`,
 1 AS `faturamento_total`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_pedidos_por_cliente`
--

DROP TABLE IF EXISTS `vw_pedidos_por_cliente`;
/*!50001 DROP VIEW IF EXISTS `vw_pedidos_por_cliente`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_pedidos_por_cliente` AS SELECT 
 1 AS `id_cliente`,
 1 AS `nome`,
 1 AS `total_pedidos`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_produtos_categorias`
--

DROP TABLE IF EXISTS `vw_produtos_categorias`;
/*!50001 DROP VIEW IF EXISTS `vw_produtos_categorias`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_produtos_categorias` AS SELECT 
 1 AS `id_produto`,
 1 AS `produto`,
 1 AS `categoria`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vw_clientes_enderecos`
--

/*!50001 DROP VIEW IF EXISTS `vw_clientes_enderecos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_clientes_enderecos` AS select `cli`.`id_cliente` AS `id_cliente`,`cli`.`nome` AS `nome`,`cli`.`sobrenome` AS `sobrenome`,`cli`.`email` AS `email`,`ce`.`endereco` AS `endereco`,`ce`.`numero` AS `numero`,`ce`.`bairro` AS `bairro`,`ce`.`cep` AS `cep`,`cid`.`nome_cidade` AS `nome_cidade`,`uf`.`uf` AS `uf` from (((`clientes` `cli` join `cliente_endereco` `ce` on(`cli`.`id_cliente` = `ce`.`id_cliente`)) join `cidades` `cid` on(`ce`.`id_cidade` = `cid`.`id_cidade`)) join `unidade_federal` `uf` on(`cid`.`cod_uf` = `uf`.`cod_uf`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_clientes_sem_compras`
--

/*!50001 DROP VIEW IF EXISTS `vw_clientes_sem_compras`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_clientes_sem_compras` AS select `clientes`.`id_cliente` AS `id_cliente`,`clientes`.`nome` AS `nome`,`clientes`.`sobrenome` AS `sobrenome` from `clientes` where !(`clientes`.`id_cliente` in (select distinct `pedidos`.`id_cliente` from `pedidos`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_estoque_produtos`
--

/*!50001 DROP VIEW IF EXISTS `vw_estoque_produtos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_estoque_produtos` AS select `p`.`id_produto` AS `id_produto`,`p`.`descricao` AS `descricao`,`e`.`estoque_total` AS `estoque_total`,`e`.`estoque_livre` AS `estoque_livre`,`e`.`estoque_reservado` AS `estoque_reservado` from (`produto` `p` join `estoque` `e` on(`p`.`id_produto` = `e`.`id_produto`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_faturamento_por_categoria`
--

/*!50001 DROP VIEW IF EXISTS `vw_faturamento_por_categoria`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_faturamento_por_categoria` AS select `c`.`descricao` AS `categoria`,sum(`p`.`preco_venda` * `i`.`qtd`) AS `faturamento_total` from ((`categorias` `c` join `produto` `p` on(`c`.`id_categoria` = `p`.`id_categoria`)) join `pedido_itens` `i` on(`p`.`id_produto` = `i`.`id_produto`)) group by `c`.`descricao` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_faturamento_produto`
--

/*!50001 DROP VIEW IF EXISTS `vw_faturamento_produto`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_faturamento_produto` AS select `p`.`id_produto` AS `id_produto`,`p`.`descricao` AS `descricao`,sum(`pi`.`qtd` * `pi`.`val_unit`) AS `faturamento_total` from (`produto` `p` join `pedido_itens` `pi` on(`p`.`id_produto` = `pi`.`id_produto`)) group by `p`.`id_produto` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_pedidos_por_cliente`
--

/*!50001 DROP VIEW IF EXISTS `vw_pedidos_por_cliente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_pedidos_por_cliente` AS select `c`.`id_cliente` AS `id_cliente`,`c`.`nome` AS `nome`,count(`pd`.`num_pedido`) AS `total_pedidos` from (`clientes` `c` left join `pedidos` `pd` on(`c`.`id_cliente` = `pd`.`id_cliente`)) group by `c`.`id_cliente` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_produtos_categorias`
--

/*!50001 DROP VIEW IF EXISTS `vw_produtos_categorias`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_produtos_categorias` AS select `p`.`id_produto` AS `id_produto`,`p`.`descricao` AS `produto`,`c`.`descricao` AS `categoria` from (`produto` `p` join `categorias` `c` on(`p`.`id_categoria` = `c`.`id_categoria`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-25 21:21:05
