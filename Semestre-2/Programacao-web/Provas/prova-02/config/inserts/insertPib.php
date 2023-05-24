<?php

require_once "../conn.php";

$year = filter_input(INPUT_POST, 'year');
$pib = filter_input(INPUT_POST, 'pib');

//nome tabela
$table = "pib_lgfb";

//PREPARAR
$stmt = $conn->prepare("INSERT INTO $table (year, pib) VALUES (:year, :pib)");

//TROCAR
$stmt->bindValue(':year', $year);
$stmt->bindValue(':pib', $pib);

//EXECUTAR
$stmt->execute();

// Teste de conexão com o banco de dados

//echo "$year - $salary - $pib";

header('Location: ../../pages/pib.php');

?>


<!--    -->