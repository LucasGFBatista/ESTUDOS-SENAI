<?php
require_once "../conn.php";
include "../inc/header.php";
include_once "../inc/sidebar.php";

$id = filter_input(INPUT_GET, 'id');

//echo $id;

$table = "pib_lgfb";

//preparar
$stmt = $conn->prepare("DELETE FROM $table WHERE id = :id");

//trocar
$stmt->bindValue(':id', $id);

//executar
$stmt->execute();

header('Location: ../../pages/pib.php');

?>
<?php include "./inc/footer.php"; ?>

<!--    -->