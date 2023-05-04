<?php 

require_once "conn.php";

$name = filter_input(INPUT_POST, 'name');
$email = filter_input(INPUT_POST, 'email');
$password = filter_input(INPUT_POST, 'password');
$passwordHash = password_hash($password, PASSWORD_DEFAULT);

//echo "$name - $email - $password - $passwordHash";

//preparar
$stmt = $conn->prepare("INSERT INTO user (name,email,password) VALUES (:name,:email,:password)");
//trocar
$stmt ->bindValue(':name',$name);
$stmt ->bindValue(':email',$email);
$stmt ->bindValue(':password',$passwordHash);

//executar
$stmt->execute();


header('Location: index.php');
?>