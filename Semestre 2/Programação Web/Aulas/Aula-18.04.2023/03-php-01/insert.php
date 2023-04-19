<?php
include "conn.php";

$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];


//echo "$name - $email - $password";

//preparar
$stmt = $conn->prepare("INSERT INTO student (namedb, emaildb, passdb) VALUES (:namedb, :emaildb, :passdb)");

//trocar 

$stmt->bindValue(':namedb', $name);
$stmt->bindValue(':emaildb', $email);
$stmt->bindValue(':passdb', $password);

//executar
$stmt->execute();


header('Location: index.php');

?>