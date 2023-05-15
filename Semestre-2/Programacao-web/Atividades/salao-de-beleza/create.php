<?php
include "./inc/header.php";


?>

<div class="container py-2 insertTitle">
    <h2>Cadastro de cliente</h2>
</div>
<form action="./config/insert.php" method="post">


    <div class="container py-2">


        <div class="box-basicInfo">

            <div class="InfoTitle">
                <h3>Informações básicas</h3>
            </div>

            <div class="basicInfoForm">
                <div class="mb-3">
                    <label for="name">Nome de cliente</label>
                    <input type="text" name="name" id="name" value="">
                </div>

                <div class="mb-3">
                    <label for="email">E-mail de cliente</label>
                    <input type="email" name="email" id="email" value="">
                </div>

                <div class="mb-3">
                    <label for="birthday_date">Data de nascimento</label>
                    <input type="date" id="birthday_date" name="birthday_date" value="Today" min="1940-01-01" max="2023-12-01">
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
                    <input cep-mask type="text" name="cep" id="cep" maxlength="8" value="">
                </div>

            </div>

        </div>


        <div class="container py-5">
            <button type="submit" class="btn btn-primary">Cadastrar cliente</button>
        </div>
    </div>
</form>

<?php

include "./inc/footer.php";
?>