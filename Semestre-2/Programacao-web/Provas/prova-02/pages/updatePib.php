<?php
require_once "../config/conn.php";
include "../inc/header.php";
include_once "../inc/sidebar.php";
?>

<main class="px-5">
    <!--        START TEXT ABOUT THE PAGE   -->
    <div class="container py-3 px-3">
        <h1>Carro popular mais barato</h1>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat eius recusandae, harum nostrum enim
            suscipit repellendus reprehenderit voluptatibus nemo facere doloremque pariatur ex architecto, consequuntur
            iste? Fugit aperiam optio molestiae.
            <br>
            Lorem ipsum, dolor sit amet consectetur adipisicing elit. A totam in non beatae inventore saepe error, sequi
            repellendus voluptates laboriosam, molestias magni ullam cupiditate sapiente explicabo molestiae quae
            tenetur laudantium.
        </p>
    </div>
    <!--        END TEXT ABOUT THE PAGE       -->

    <!--    START SIDE-BY-SIDE  -->

    <section class="sideBySide">
        <!--    START GRAPHIC -->
        <section class="container">
            <?php include "../charts/chartPib.php" ?>
        </section>

        <!--    END GRAPHIC -->


        <!--    START LIST -->
        <section class="container">
            <?php include "../config/lists/listPib.php" ?>
        </section>
        <!--    END LIST -->
    </section>
    <!--    END SIDE-BY-SIDE  -->

    <?php
    $table = "pib_lgfb";
    include_once "../config/updateGeneral.php";
    ?>

    <!--    START FORM -->
    <section class="container py-5 form-add">
        <form action="../config/updateAction/updateActionPib.php" method="POST">

            <input type="hidden" name="id" value="<?= $list['id']; ?>" readonly>

            <div class="form-left">
            <div class="mb-3">
                <label for="year">Ano</label>
                <input type="text" name="year" id="year" maxlength="4" value="<?= $list['year']; ?>">
            </div>
            <div class="mb-3">
                <label for="pib">Preço carro</label>
                <input type="text" name="pib" id="pib" value="<?= $list['pib']; ?>">
            </div>

            </div>
<div class="form-right"></div>



            <div class="container py-1">
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </div>

        </form>
    </section>
    <!--    END FORM -->

</main>

<!-- FOOTER -->
<?php

include "../inc/footer.php";

?>