<?php

/*
A estudante Dandara da Silva
$n1 = 7
$n2 = 9
$n3 = 6
$media = ($n1 + $n2 + $n3)/3
se a media >= 7
aprovada
se a media >= 4
conselho
senão 
reprovada
*/

$student = "Dandara da Silva";
$n1 = 7;
$n2 = 9;
$n3 = 6;

$avarage = ($n1 + $n2 + $n3) / 3;




if ($avarage >= 7) {
    echo "A aluna $student ficou com média igual a $avarage e foi APROVADA!";
} else if ($avarage >= 4) {
    echo "A aluna $student ficou com média igual a $avarage e foi para o CONSELHO!";
} else {
    echo "A aluna $student ficou com média igual a $avarage e foi para o REPROVADA!";
}



?>