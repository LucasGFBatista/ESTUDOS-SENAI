<?php
require_once "../conn.php";
include_once "../../inc/header.php";
include_once "../../inc/sidebar.php";

// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$xeon = filter_input(INPUT_POST, 'xeon');
$tax = filter_input(INPUT_POST, 'tax');
$old_dollar = filter_input(INPUT_POST, 'old_dollar');
$new_dollar = filter_input(INPUT_POST, 'new_dollar');

//NOME DA TABELA
$table = "xen_lgfb";

///PREPARAR
$stmt = $conn->prepare("UPDATE $table SET year = :year, xeon = :xeon, tax = :tax, old_dollar = :old_dollar, new_dollar = :new_dollar WHERE id = :id");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':xeon', $xeon);
$stmt->bindValue(':tax', $tax);
$stmt->bindValue(':old_dollar', $old_dollar);
$stmt->bindValue(':new_dollar', $new_dollar);

//EXECUTAR 
$stmt->execute();

//TESTE SE ESTÁ ATUALIZANDO
/*
    echo "$id - $year - $xeon - $tax";
    echo "<br>";
*/

//REDIRECIONAR PARA PAGINA PRINCIPAL - CARRO
header('Location: ../../pages/xeon.php');

?>


<!--    -->