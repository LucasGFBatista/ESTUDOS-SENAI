<?php
require_once "../conn.php";
include "../inc/header.php";
include_once "../inc/sidebar.php";

$id = filter_input(INPUT_GET, 'id');

//echo $id;

$table = "cesta_lgfb";

//preparar
$stmt = $conn->prepare("DELETE FROM $table WHERE id = :id");

//trocar
$stmt->bindValue(':id', $id);

//executar
$stmt->execute();

header('Location: ../../pages/cesta.php');

?>
<?php include "./inc/footer.php"; ?>

<!--    -->