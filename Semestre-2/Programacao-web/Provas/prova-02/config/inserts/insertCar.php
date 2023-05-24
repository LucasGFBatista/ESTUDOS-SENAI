<?php

require_once "../conn.php";

$year = filter_input(INPUT_POST, 'year');
$car_price = filter_input(INPUT_POST, 'car_price');
$salary = filter_input(INPUT_POST, 'salary');

//nome tabela
$table = "car_lgfb";

//PREPARAR
$stmt = $conn->prepare("INSERT INTO $table (year, car_price, salary) VALUES (:year, :car_price,:salary)");

//TROCAR
$stmt->bindValue(':year', $year);
$stmt->bindValue(':car_price', $car_price);
$stmt->bindValue(':salary', $salary);

//EXECUTAR
$stmt->execute();

// Teste de conexão com o banco de dados

//echo "$year - $salary - $car_price";

header('Location: ../../pages/car.php');

?>


<!--    -->