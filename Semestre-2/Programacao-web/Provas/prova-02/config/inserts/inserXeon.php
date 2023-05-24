<?php

require_once "../conn.php";

// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$xeon = filter_input(INPUT_POST, 'xeon');
$tax = filter_input(INPUT_POST, 'tax');
$old_dollar = filter_input(INPUT_POST, 'old_dollar');
$new_dollar = filter_input(INPUT_POST, 'new_dollar');


//nome tabela
$table = "xeon_lgfb";

//PREPARAR
$stmt = $conn->prepare("INSERT INTO $table (year, year_old_dollar,year_new_dollar,xeon, tax, new_dollar, old_dollar) VALUES (:year, :year_old_dollar,: year_new_dollar,: xeon, :tax, :new_dollar, :old_dollar)");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':xeon', $xeon);
$stmt->bindValue(':tax', $tax);
$stmt->bindValue(':old_dollar', $old_dollar);
$stmt->bindValue(':new_dollar', $new_dollar);

//EXECUTAR
$stmt->execute();

// Teste de conexão com o banco de dados

//echo "$year - $salary - $year_old_dollar,year_new_dollar,xeon, tax, new_dollar, old_dollar";

header('Location: ../../pages/xeon.php');

?>


<!--    -->