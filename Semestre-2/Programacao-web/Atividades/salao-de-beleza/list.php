

<?php
include "./inc/header.php";
require_once "./config/conn.php";

//preparar
$stmt = $conn->prepare("SELECT * FROM cliente");

//executar
$stmt->execute();
//listar
$list = $stmt->fetchAll(PDO::FETCH_ASSOC);

//var_dump($list);
?>
<main class="container py-5">
  <table class="table">
    <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Email</th>
        <th scope="col">Data de nascimento</th>
        <th scope="col">Ações</th>

      </tr>
    </thead>
    <tbody>
      <?php
      foreach ($list as $customer) :
      ?>
        <tr>
          <th scope="row"><?= $customer['id'] ?></th>
          <td><?= $customer['name'] ?></td>
          <td><?= $customer['email'] ?></td>
          <td><?= $customer['birthday_date'] ?></td>
          <td>
            <a href="update.php?id=<?= $customer['id']; ?>">Editar</a>
            |
            <a href="delete.php?id=<?= $customer['id']; ?>">Deletar</a>
          </td>
        </tr>

      <?php endforeach; ?>
    </tbody>
  </table>
</main>

<!-- FOOTER -->
<?php
include "./inc/footer.php";
?>