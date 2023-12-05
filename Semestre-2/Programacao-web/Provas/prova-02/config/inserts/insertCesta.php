<?php

require_once "../conn.php";

$year = filter_input(INPUT_POST, 'year');
$cesta = filter_input(INPUT_POST, 'cesta');
$salary = filter_input(INPUT_POST, 'salary');

//nome tabela
$table = "cesta_lgfb";

//PREPARAR
$stmt = $conn->prepare("INSERT INTO $table (year, cesta, salary) VALUES (:year, :cesta,:salary)");

//TROCAR
$stmt->bindValue(':year', $year);
$stmt->bindValue(':cesta', $cesta);
$stmt->bindValue(':salary', $salary);

//EXECUTAR
$stmt->execute();

// Teste de conexão com o banco de dados

//echo "$year - $salary - $cesta";

header('Location: ../../pages/cesta.php');

?>


<!--    -->