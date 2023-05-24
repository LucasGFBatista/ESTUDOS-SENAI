<?php
require_once "../config/conn.php";
include_once "../inc/header.php";
include_once "../inc/sidebar.php";

//NOME DA TABELA
$table = "xeon_lgfb";

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
        <th scope="col">XEON</th>
        <th scope="col">ANO DOLLAR PASSADO</th>
        <th scope="col">DOLLAR PASSADO</th>
        <th scope="col">ANO DOLLAR ATUAL</th>
        <th scope="col">DOLLAR ATUAL</th>

        <th scope="col">AÇÕES</th>
    </tr>
</thead>

<tbody>
    <?php
    foreach ($list as $item) :
    ?>
        <tr>
            <td><?= $item['year'] ?></td>
            <td>R$ <?= $item['xeon'] ?></td>
            <td><?= $item['year_old_dollar'] ?></td>
            <td><?= $item['old_dollar'] ?></td>
            <td><?= $item['year_new_dollar'] ?></td>
            <td><?= $item['new_dollar'] ?></td>
            <td>
                <a class="edit text-white bg-primary " href="updateXeon.php?id=<?= $item['id']; ?>">Editar</a>
                |
                <a class="del text-white bg-danger " href="../config/deletes/deleteXeon.php?id=<?= $item['id']; ?>">Deletar</a>
            </td>
        </tr>

    <?php endforeach; ?>
</tbody>
</table>

