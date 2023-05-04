<?php
include "header.php";
require_once "conn.php";



//preparar
$stmt = $conn->prepare("SELECT * FROM user");

//executar
$stmt -> execute();
//listar
$list = $stmt -> fetchAll(PDO::FETCH_ASSOC);

//var_dump($list);
?>
    <main class="container py-5">
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nome</th>
      <th scope="col">Email</th>
      <th scope="col">Ações</th>
   
    </tr>
  </thead>
  <tbody>
    <?php
    foreach ($list as $user):
        ?>
    <tr>
      <th scope="row"><?=$user['id']?></th>
      <td><?=$user['name']?></td>
      <td><?=$user['email']?></td>
 <td>
    <a href="update.php?id=<?= $user['id'];?>">Editar</a>
    |
    <a href="delete.php?id=<?= $user['id'];?>">Deletar</a>
 </td>
    </tr>

    <?php endforeach; ?>
  </tbody>
</table>
    </main>
<?php

include "footer.php";?>