<?php
$host = "localhost";
$user = "root";
$password = "";
$db = "salao_beleza";


try {
    $conn = new PDO("mysql:host={$host}; dbname={$db}", $user, $password);
    //echo "Conexão realizada com sucesso";
} catch (Exception $err) {
    echo "Servidor instável, retorne em alguns minutos!";
}

?>

<!---->