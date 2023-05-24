-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23/05/2023 às 23:46
-- Versão do servidor: 10.4.24-MariaDB
-- Versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `prova_lgfb`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `car_lgfb`
--

CREATE TABLE `car_lgfb` (
  `id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  `car_price` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `car_lgfb`
--

INSERT INTO `car_lgfb` (`id`, `year`, `salary`, `car_price`) VALUES
(2, 1997, '120.00', '7802.00'),
(3, 2002, '200.00', '11780.00'),
(4, 2007, '380.00', '18990.00'),
(5, 2012, '622.00', '27990.00'),
(6, 2017, '937.00', '34890.00'),
(7, 2022, '1212.00', '66590.00');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cesta_lgfb`
--

CREATE TABLE `cesta_lgfb` (
  `id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  `cesta` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `cesta_lgfb`
--

INSERT INTO `cesta_lgfb` (`id`, `year`, `salary`, `cesta`) VALUES
(2, 1997, '120.00', '109.00'),
(3, 2002, '200.00', '202.00'),
(4, 2007, '380.00', '214.00'),
(5, 2012, '622.00', '304.00'),
(6, 2017, '937.00', '424.00'),
(7, 2022, '1212.00', '791.00');

-- --------------------------------------------------------

--
-- Estrutura para tabela `dollar_lgfb`
--

CREATE TABLE `dollar_lgfb` (
  `id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  `dollar` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `dollar_lgfb`
--

INSERT INTO `dollar_lgfb` (`id`, `year`, `salary`, `dollar`) VALUES
(1, 1997, '120.00', '1.0000');

-- --------------------------------------------------------

--
-- Estrutura para tabela `gas_lgfb`
--

CREATE TABLE `gas_lgfb` (
  `id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  `gas` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `gas_lgfb`
--

INSERT INTO `gas_lgfb` (`id`, `year`, `salary`, `gas`) VALUES
(2, 1997, '120.00', '1.0000'),
(3, 2002, '200.00', '2.0000'),
(4, 2007, '380.00', '1.0000'),
(5, 2012, '622.00', '2.0000'),
(6, 2017, '937.00', '3.0000');

-- --------------------------------------------------------

--
-- Estrutura para tabela `pib_lgfb`
--

CREATE TABLE `pib_lgfb` (
  `id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `pib` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `pib_lgfb`
--

INSERT INTO `pib_lgfb` (`id`, `year`, `pib`) VALUES
(1, 2017, '888.0000');

-- --------------------------------------------------------

--
-- Estrutura para tabela `xeon_lgfb`
--

CREATE TABLE `xeon_lgfb` (
  `id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `tax` decimal(10,4) NOT NULL,
  `xeon` decimal(10,4) NOT NULL,
  `old_dollar` decimal(10,4) NOT NULL,
  `new_dollar` decimal(10,4) NOT NULL,
  `year_old_dollar` int(11) NOT NULL,
  `year_new_dollar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `car_lgfb`
--
ALTER TABLE `car_lgfb`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `cesta_lgfb`
--
ALTER TABLE `cesta_lgfb`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `dollar_lgfb`
--
ALTER TABLE `dollar_lgfb`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `gas_lgfb`
--
ALTER TABLE `gas_lgfb`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `pib_lgfb`
--
ALTER TABLE `pib_lgfb`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `xeon_lgfb`
--
ALTER TABLE `xeon_lgfb`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `car_lgfb`
--
ALTER TABLE `car_lgfb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `cesta_lgfb`
--
ALTER TABLE `cesta_lgfb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `dollar_lgfb`
--
ALTER TABLE `dollar_lgfb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `gas_lgfb`
--
ALTER TABLE `gas_lgfb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `pib_lgfb`
--
ALTER TABLE `pib_lgfb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `xeon_lgfb`
--
ALTER TABLE `xeon_lgfb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
