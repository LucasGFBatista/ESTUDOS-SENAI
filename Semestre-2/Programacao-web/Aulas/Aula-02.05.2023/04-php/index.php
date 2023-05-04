<?php include "header.php" ?>
<div class="container py-5">
    <form action="insert.php" method="post">

        <div>
            <label for="name">Digite o nome do usuario </label>
            <input type="text" name="name" id="name">
        </div>

        <div>
            <label for="email">Digite o email do usuario </label>
            <input type="email" name="email" id="email">
        </div>

        <div>
            <label for="password">Digite a senha do usuario </label>
            <input type="password" name="password" id="password">
        </div>

        <div>
            <button type="submit">Cadastrar</button>
        </div>

    </form>

</div>
<?php include "footer.php"; ?>