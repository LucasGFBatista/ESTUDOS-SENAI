<?php
include "header.php";
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

<div class="container py-5">
    <form action="updateAction.php" method="post">


            <input type="hidden" name="id" value="<?=$list['id'];?>">
        </div>
        <div>
            <label for="name">Digite o nome do usuario </label>
            <input type="text" name="name" value="<?=$list['name'];?>">
        </div>

        <div>
            <label for="email">Digite o email do usuario </label>
            <input type="email" name="email" value="<?=$list['email'];?>">
        </div>

        <div>
            <label for="password">Digite a senha do usuario </label>
            <input type="password" name="password" id="password">
        </div>

        <div>
            <button type="submit">Cadastrar</button>
        </div>

    </form>

</div>

<?php include "footer.php"; ?>