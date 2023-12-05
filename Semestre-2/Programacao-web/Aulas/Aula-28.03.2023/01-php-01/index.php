<?php

$name = "Darcy Ribeiro";
$number1 = 10;
$number2 = 3;
$number3 = "3";




echo "Olá mundo!";
echo "<br>";

echo $name;
echo "<br>";
echo "<br>";
echo "<br>";

$result = $number1 + $number2;
echo $result;
echo "<br>";
echo gettype($result);
echo "<br><br>";

$result = $number1 - $number2;
echo $result;
echo "<br>";
echo gettype($result);
echo "<br><br>";

$result = $number1 * $number2;
echo $result;
echo "<br>";
echo gettype($result);
echo "<br><br>";

$result = $number1 / $number2;
echo $result;
echo "<br>";
echo gettype($result);
echo "<br><br>";

$result = $number1 % $number2;
echo $result;
echo "<br>";
echo gettype($result);
echo "<br>";

if (is_int($number3)) {
    echo '$number3 é um inteiro';
} else {
    echo '$number3 não é um inteiro';
}




?>