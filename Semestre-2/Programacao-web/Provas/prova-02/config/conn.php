<?php

$host = "localhost";
$db = "prova_lgfb";
$user = "root";
$password = "";

try {
  //PDO(dados do servidor, usuario, senha)
  $conn = new PDO("mysql:host={$host}; dbname={$db}", $user, $password);

  //echo "Conexão ok";

} catch (PDOException $err) {
  // echo "Ocorreu um erro: ".$err;

  echo "Servidor instável entre novamente mais tarde!";
}
?>
<!--    -->