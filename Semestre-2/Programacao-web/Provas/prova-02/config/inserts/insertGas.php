<?php

require_once "../conn.php";

$year = filter_input(INPUT_POST, 'year');
$gas = filter_input(INPUT_POST, 'gas');
$salary = filter_input(INPUT_POST, 'salary');

//nome tabela
$table = "gas_lgfb";

//PREPARAR
$stmt = $conn->prepare("INSERT INTO $table (year, gas, salary) VALUES (:year, :gas,:salary)");

//TROCAR
$stmt->bindValue(':year', $year);
$stmt->bindValue(':gas', $gas);
$stmt->bindValue(':salary', $salary);

//EXECUTAR
$stmt->execute();

// Teste de conexão com o banco de dados

//echo "$year - $salary - $gas";

header('Location: ../../pages/gas.php');

?>


<!--    -->