<?php
include "./inc/header.php";


?>


<form action="./config/insert.php" method="post">

    <div class="container py-5">

        <div class="box-basicInfo">
            <h2>Informações básicas</h2>

            <div class="mb-3">
                <label for="name">Digite o nome de cliente</label>
                <input type="text" name="name" id="name" value="">
            </div>

            <div class="mb-3">
                <label for="email">Digite o e-mail de cliente</label>
                <input type="email" name="email" id="email" value="">
            </div>

            <div class="mb-3">
                <label for="birthday_date">Digite a data de nascimento</label>
                <input type="date" id="birthday_date" name="birthday_date" value="Today" min="1940-01-01" max="2023-12-01">
            </div>

        </div>

        <hr>

        <div class="box-endereco">
            <h2>Endereço</h2>

            <div class="mb-3">
                <label for="endereco">Endereço</label>
                <input type="text" name="endereco" id="endereco" value="">
            </div>
            <div class="mb-3">
                <label for="bairro">Bairro</label>
                <input type="text" name="bairro" id="bairro" value="">
            </div>
            <div class="mb-3">
                <label for="cidade">Cidade</label>
                <input type="text" name="cidade" id="cidade" value="">
            </div>

            <div class="mb-3">
                <label for="estado">Estado</label>
                <input type="text" name="estado" id="estado" value="">
            </div>
            <div class="mb-3">
                <label for="cep">Cep</label>
                <input type="text" name="cep" id="cep" value="">
            </div>



        </div>


        <div>
            <button type="submit" class="btn btn-primary">Cadastrar cliente</button>
        </div>

    </div>
</form>

<?php
include "./inc/footer.php";
?>