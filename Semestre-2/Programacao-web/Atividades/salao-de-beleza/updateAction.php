<?php
require_once "./conn.php";

$id = filter_input(INPUT_POST,  'id');
$name = filter_input(INPUT_POST,  'name');
$email = filter_input(INPUT_POST,  'email');
$password = filter_input(INPUT_POST,  'password');
$passwordHash = password_hash($password, PASSWORD_DEFAULT);

$stmt = $conn->prepare("UPDATE user SET name = :name, email = :email, password = :password WHERE id = :id");

$stmt->bindValue(':id', $id);
$stmt->bindValue(':name', $name);
$stmt->bindValue(':email', $email);
$stmt->bindValue(':password', $passwordHash);


$stmt->execute();

echo "$id - $name - $email - $passwordHash";



header('Location: index.php');



?>
<!-- -->