<?php
include "./inc/header.php";
require_once "conn.php";

$id = filter_input(INPUT_GET, 'id');


//echo $id;

//preparar
$stmt = $conn->prepare("SELECT * FROM user WHERE id = :id");
//trocar
$stmt->bindValue(':id', $id);
//executar

$stmt->execute();

$list = $stmt->fetch(PDO::FETCH_ASSOC);

?>


<form action="updateAction.php" method="post">
    <div class="container py-5">

        <input type="hidden" name="id" value="<?= $list['id']; ?>" readonly>

        <div class="mb-3">
            <label for="name">Digite o nome do usuario </label>
            <input type="text" name="name" value="<?= $list['name']; ?> ">
        </div>

        <div class="mb-3">
            <label for="email">Digite o email do usuario </label>
            <input type="email" name="email" value="<?= $list['email']; ?>">
        </div>

        <div class="mb-3">
            <label for="password">Digite a senha do usuario </label>
            <input type="password" name="password" value="">
        </div>

        <div>
            <button type="submit" class="btn btn-primary">Atualizar</button>
        </div>
    </div>
</form>

</div>

<!-- FOOTER -->
<?php
include "./inc/footer.php";
?>