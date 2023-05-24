<?php
require_once "../config/conn.php";
include_once "../inc/header.php";
include_once "../inc/sidebar.php";

//NOME DA TABELA
$table = "pib_lgfb";

//preparar
$stmt = $conn->prepare("SELECT * FROM $table");


//executar
$stmt->execute();
//listar
$list = $stmt->fetchAll(PDO::FETCH_ASSOC);

//var_dump($list);

?>

<table class="table">

<thead>
    <tr>
        <th scope="col">ANO</th>
        <th scope="col">PIB</th>
        <th scope="col">AÇÕES</th>
    </tr>
</thead>

<tbody>
    <?php
    foreach ($list as $item) :
    ?>
        <tr>
            <td><?= $item['year'] ?></td>
            <td><?= $item['pib'] ?> tri</td>
            <td>
                <a class="edit text-white bg-primary " href="updatePib.php?id=<?= $item['id']; ?>">Editar</a>
                |
                <a class="del text-white bg-danger " href="../config/deletes/deletePib.php?id=<?= $item['id']; ?>">Deletar</a>
            </td>
        </tr>

    <?php endforeach; ?>
</tbody>
</table>

