<?php

require_once "conn.php";

$name = filter_input(INPUT_POST, 'name');
$email = filter_input(INPUT_POST, 'email');
$birthday_date = filter_input(INPUT_POST, 'birthday_date');
$endereco = filter_input(INPUT_POST, 'endereco');
$bairro = filter_input(INPUT_POST, 'bairro');
$cidade = filter_input(INPUT_POST, 'cidade');
$estado = filter_input(INPUT_POST, 'estado');
$cep = filter_input(INPUT_POST, 'cep');


//preparar
$stmt = $conn->prepare("INSERT INTO cliente_salao (name,email,birthday_date,endereco,bairro,cidade,estado,cep) VALUES (:name,:email,:birthday_date, :endereco, :bairro, :cidade, :estado, :cep)");

//trocar
$stmt->bindValue(':name', $name);
$stmt->bindValue(':email', $email);
$stmt->bindValue(':birthday_date', $birthday_date);
$stmt->bindValue(':endereco', $endereco);
$stmt->bindValue(':bairro', $bairro);
$stmt->bindValue(':cidade', $cidade);
$stmt->bindValue(':estado', $estado);
$stmt->bindValue(':cep', $cep);


//executar
$stmt->execute();

echo "$name - $email - $birthday_date";
echo "<br>";
echo "$endereco - $bairro - $cidade - $estado - $cep";



//header('Location: ../index.php');
?>

<!--        -->