<?php

$host = "localhost";
$db = "school";
$user = "root";
$pass = "";


$conn = new PDO("mysql:host={$host};dbname={$db}",$user,$pass);

//echo "Conectou";
//next class goin to use the trycathc


?>