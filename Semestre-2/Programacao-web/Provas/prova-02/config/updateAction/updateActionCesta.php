<?php
require_once "../conn.php";
include_once "../../inc/header.php";
include_once "../../inc/sidebar.php";

// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$cesta = filter_input(INPUT_POST, 'cesta');
$salary = filter_input(INPUT_POST, 'salary');

//NOME DA TABELA
$table = "cesta_lgfb";

///PREPARAR
$stmt = $conn->prepare("UPDATE $table SET year = :year, cesta = :cesta, salary = :salary WHERE id = :id");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':cesta', $cesta);
$stmt->bindValue(':salary', $salary);

//EXECUTAR 
$stmt->execute();

//TESTE SE ESTÁ ATUALIZANDO
/*
    echo "$id - $year - $cesta - $salary";
    echo "<br>";
*/

//REDIRECIONAR PARA PAGINA PRINCIPAL - CARRO
header('Location: ../../pages/cesta.php');

?>


<!--    -->