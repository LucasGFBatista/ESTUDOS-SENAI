<?php

require_once "../conn.php";

$year = filter_input(INPUT_POST, 'year');
$dollar = filter_input(INPUT_POST, 'dollar');
$salary = filter_input(INPUT_POST, 'salary');

//nome tabela
$table = "dollar_lgfb";

//PREPARAR
$stmt = $conn->prepare("INSERT INTO $table (year, dollar, salary) VALUES (:year, :dollar,:salary)");

//TROCAR
$stmt->bindValue(':year', $year);
$stmt->bindValue(':dollar', $dollar);
$stmt->bindValue(':salary', $salary);

//EXECUTAR
$stmt->execute();

// Teste de conexão com o banco de dados

//echo "$year - $salary - $dollar";

header('Location: ../../pages/dollar.php');

?>


<!--    -->