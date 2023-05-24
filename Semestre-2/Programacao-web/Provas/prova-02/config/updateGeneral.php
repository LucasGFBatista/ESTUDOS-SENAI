<?php
$id = filter_input(INPUT_GET, 'id');

//echo $id;

//preparar
$stmt = $conn->prepare("SELECT * FROM $table WHERE id = :id");
//trocar
$stmt->bindValue(':id', $id);
//executar

$stmt->execute();

$list = $stmt->fetch(PDO::FETCH_ASSOC);