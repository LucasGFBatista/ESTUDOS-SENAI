<?php
include "header.php";
?>


<form action="insert.php" method="post">

    <div class="container py-5">

        <div class="mb-3">
            <label for="name">Digite o nome do usuário</label>
            <input type="text" name="name" id="name" value="">
        </div>

        <div class="mb-3">
            <label for="email">Digite o e-mail do usuário</label>
            <input type="email" name="email" id="email" value="">
        </div>
        <div class="mb-3">
            <label for="password">Digite uma senha para o usuário</label>
            <input type="password" name="password" id="password" value="">
        </div>

        <div>
            <button type="submit" class="btn btn-primary">Cadastrar Usuário</button>
        </div>

    </div>
</form>

<?php
include "footer.php";
?>