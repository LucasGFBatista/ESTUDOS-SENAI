<?php
require_once "../conn.php";
include_once "../../inc/header.php";
include_once "../../inc/sidebar.php";


// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$gas = filter_input(INPUT_POST, 'gas');
$salary = filter_input(INPUT_POST, 'salary');

//NOME DA TABELA
$table = "gas_lgfb";

///PREPARAR
$stmt = $conn->prepare("UPDATE $table SET year = :year, gas = :gas, salary = :salary WHERE id = :id");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':gas', $gas);
$stmt->bindValue(':salary', $salary);

//EXECUTAR 
$stmt->execute();

//TESTE SE ESTÁ ATUALIZANDO
/*
    echo "$id - $year - $gas - $salary";
    echo "<br>";
*/

//REDIRECIONAR PARA PAGINA PRINCIPAL - CARRO
header('Location: ../../pages/gas.php');

?>


<!--    -->