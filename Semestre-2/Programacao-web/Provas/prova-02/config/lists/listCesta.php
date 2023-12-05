<?php
require_once "../config/conn.php";
include "../inc/header.php";
include_once "../inc/sidebar.php";

//NOME DA TABELA
$table = "cesta_lgfb";

//preparar
$stmt = $conn->prepare("SELECT * FROM $table");


//executar
$stmt->execute();
//listar
$list = $stmt->fetchAll(PDO::FETCH_ASSOC);

//var_dump($list);

?>

<table class="table" width="100%" height="auto">

<thead>
    <tr>
        <th scope="col">ANO</th>
        <th scope="col">SALARIO MINIMO</th>
        <th scope="col">CESTA</th>
        <th scope="col">AÇÕES</th>
    </tr>
</thead>

<tbody>
    <?php
    foreach ($list as $item) :
    ?>
        <tr>
            <td><?= $item['year'] ?></td>
            <td>R$ <?= $item['salary'] ?></td>
            <td>R$ <?= $item['cesta'] ?></td>
            <td>
                <a class="edit text-white bg-primary " href="updateCesta.php?id=<?= $item['id']; ?>">Editar</a>
                |
                <a class="del text-white bg-danger " href="../config/deletes/deleteCesta.php?id=<?= $item['id']; ?>">Deletar</a>
            </td>
        </tr>

    <?php endforeach; ?>
</tbody>
</table>

