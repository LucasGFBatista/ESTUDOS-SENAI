<?php
include "./inc/header.php";
require_once "./config/conn.php";

$id = filter_input(INPUT_GET, 'id');

//echo $id;

//preparar
$stmt = $conn->prepare("DELETE FROM cliente WHERE id = :id");

//trocar
$stmt->bindValue(':id', $id);

//executar
$stmt->execute();

header("Location; ./list.php");

?>

<?php include "./inc/footer.php"; ?>      