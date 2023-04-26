<?php
include "header.php";
include "conn.php";


//prepar
$stmt = $conn->prepare("SELECT * FROM product");

//executar

$stmt -> execute();

//listar
$list = $stmt->fetchAll(PDO::FETCH_ASSOC);


//var_dump($list);

?>





<!--    Start Main      -->
<main class="container py-5">
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nome do produto</th>
      <th scope="col">Descrição</th>
      <th scope="col">Preço</th>
    </tr>
  </thead>
  <tbody>
<?php
  foreach($list as $product):
    ?>
    <tr>
      <th scope="row"><?=$product['id']?></th>
      <td><?=$product['name']?></td>
      <td><?=$product['description']?></td>
      <td><?="R$ ".$product['price']?></td>

    </tr>
    <?php endforeach; ?>
  </tbody>
</table>
</main>
<!--    End Main        -->

<?php
include "footer.php";
?>