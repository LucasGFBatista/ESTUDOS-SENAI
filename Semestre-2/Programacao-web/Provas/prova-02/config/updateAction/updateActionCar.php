<?php
require_once "../conn.php";
include_once "../../inc/header.php";
include_once "../../inc/sidebar.php";

// DECLARAÇÃO DE VARIAVEIS 
$id = filter_input(INPUT_POST,  'id');
$year = filter_input(INPUT_POST, 'year');
$car_price = filter_input(INPUT_POST, 'car_price');
$salary = filter_input(INPUT_POST, 'salary');

//NOME DA TABELA
$table = "car_lgfb";

///PREPARAR
$stmt = $conn->prepare("UPDATE $table SET year = :year, car_price = :car_price, salary = :salary WHERE id = :id");

//TROCAR
$stmt->bindValue(':id',$id);
$stmt->bindValue(':year', $year);
$stmt->bindValue(':car_price', $car_price);
$stmt->bindValue(':salary', $salary);

//EXECUTAR 
$stmt->execute();

//TESTE SE ESTÁ ATUALIZANDO
/*
    echo "$id - $year - $car_price - $salary";
    echo "<br>";
*/

//REDIRECIONAR PARA PAGINA PRINCIPAL - CARRO
header('Location: ../../pages/car.php');

?>


<!--    -->