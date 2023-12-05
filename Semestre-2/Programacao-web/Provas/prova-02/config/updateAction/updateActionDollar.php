<?php
require_once "../conn.php";
include_once "../../inc/header.php";
include_once "../../inc/sidebar.php";

// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$dollar = filter_input(INPUT_POST, 'dollar');
$salary = filter_input(INPUT_POST, 'salary');

//NOME DA TABELA
$table = "dollar_lgfb";

///PREPARAR
$stmt = $conn->prepare("UPDATE $table SET year = :year, dollar = :dollar, salary = :salary WHERE id = :id");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':dollar', $dollar);
$stmt->bindValue(':salary', $salary);

//EXECUTAR 
$stmt->execute();

//TESTE SE ESTÁ ATUALIZANDO
/*
    echo "$id - $year - $dollar - $salary";
    echo "<br>";
*/

//REDIRECIONAR PARA PAGINA PRINCIPAL - CARRO
header('Location: ../../pages/dollar.php');

?>


<!--    -->