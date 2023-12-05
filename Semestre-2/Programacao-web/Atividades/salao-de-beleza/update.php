<?php
include "./inc/header.php";
require_once "./config/conn.php";

$id = filter_input(INPUT_GET, 'id');


//echo $id;

//preparar
$stmt = $conn->prepare("SELECT * FROM cliente WHERE id = :id");
//trocar
$stmt->bindValue(':id', $id);
//executar

$stmt->execute();

$list = $stmt->fetch(PDO::FETCH_ASSOC);

?>

<div class="container py-2 insertTitle">

    <h2>Cadastro de cliente</h2>

</div>

<form action="./config/updateAction.php" method="post">


    <div class="container py-2">


        <div class="box-basicInfo">

            <div class="InfoTitle">
                <h3>Informações básicas</h3>
            </div>

            <div class="basicInfoForm">

                <input type="hidden" name="id" value="<?= $list['id']; ?>" readonly>

                <div class="mb-3">
                    <label for="name">Nome de cliente</label>
                    <input type="text" name="name" id="name" value="<?= $list['name']; ?>">
                </div>

                <div class="mb-3">
                    <label for="email">E-mail de cliente</label>
                    <input type="email" name="email" id="email" value="<?= $list['email']; ?>">
                </div>

                <div class="mb-3">
                    <label for="birthday_date">Data de nascimento</label>
                    <input type="date" id="birthday_date" name="birthday_date" value="<?= $list['birthday_date']; ?>" min="1940-01-01" max="2023-12-01">
                </div>

            </div>

        </div>

    </div>


    <div class="container py-2">

        <hr>
        <div class="box-address">

            <div class="InfoTitle">
                <h3>Endereço</h3>
            </div>

            <div class="addressForm">

                <div class="mb-3">
                    <label for="endereco">Endereço</label>
                    <input type="text" name="endereco" id="endereco" value="<?= $list['endereco']; ?>">
                </div>

                <div class="mb-3">
                    <label for="bairro">Bairro</label>
                    <input type="text" name="bairro" id="bairro" value="<?= $list['bairro']; ?>">
                </div>

                <div class="mb-3">
                    <label for="cidade">Cidade</label>
                    <input type="text" name="cidade" id="cidade" value="<?= $list['cidade']; ?>">
                </div>

                <div class="mb-3">
                    <label for="estado">Estado</label>
                    <input type="text" name="estado" id="estado" value="<?= $list['estado']; ?>">
                </div>

                <div class="mb-3">
                    <label for="cep">Cep</label>
                    <input cep-mask type="text" name="cep" id="cep" value="<?= $list['cep']; ?>">
                </div>

            </div>

        </div>

        <div class="container py-5">
            <button type="submit" class="btn btn-primary">Atualizar cliente</button>
        </div>
    </div>
</form>

<!-- FOOTER -->
<?php
include "./inc/footer.php";
?>