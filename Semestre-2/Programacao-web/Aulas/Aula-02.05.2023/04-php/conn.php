<?php
$host = "localhost";
$user = "root";
$password = "";
$db = "crud_pdo";


try {
    $conn = new PDO("mysql:host={$host}; dbname={$db}", $user, $password);
    //echo "Conexão realizada com sucesso";
} catch (Exception $err) {
    echo "Servidor insáveçl, retorne em alguns minutos!";
}

?>

<!---->