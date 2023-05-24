<?php
require_once "../conn.php";
include_once "../../inc/header.php";
include_once "../../inc/sidebar.php";

// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$pib = filter_input(INPUT_POST, 'pib');

//NOME DA TABELA
$table = "pib_lgfb";

///PREPARAR
$stmt = $conn->prepare("UPDATE $table SET year = :year, pib = :pib WHERE id = :id");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':pib', $pib);

//EXECUTAR 
$stmt->execute();

//TESTE SE ESTÁ ATUALIZANDO
/*
    echo "$id - $year - $pib;
    echo "<br>";
*/

//REDIRECIONAR PARA PAGINA PRINCIPAL - CARRO
header('Location: ../../pages/pib.php');

?>


<!--    -->