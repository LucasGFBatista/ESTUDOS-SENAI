<?php

require_once './connect.php';

$stmt = $connect->prepare('SELECT * FROM users');
$stmt->execute();
$list = $stmt->fetchAll(PDO::FETCH_ASSOC);

?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Painel</title>
</head>
<body>
    <h1>Faça um Cadastro de Usuário</h1>
    <form action="insert.php" method="post" enctype="multipart/form-data">
        <div>
            <label for="name">Nome</label>
            <input type="text" name="name">
        </div>
        <div>
            <label for="email">Email</label>
            <input type="email" name="email">
        </div>
        <div>
            <label for="password">Senha</label>
            <input type="password" name="password">
        </div>
        <div>
            <label for="image">Senha</label>
            <input type="file" name="image">
        </div>
        <div>
            <button>Cadastrar Usuário</button>
        </div>
    </form>
    <?php if($stmt->rowCount() > 0):?>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Foto</th>
                <th>Ações</th>
            </tr>
            <?php foreach($list as $user): ?>
            <tr>
                <td><?= $user['id']; ?></td>
                <td><?= $user['name']; ?></td>
                <td><?= $user['email']; ?></td>
                <td><img src="<?= $user['image']; ?>"  width="40px" height=""></td>
                <td>
                    Editar
                    |
                    Deletar
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
    <?php else: ?>
        <p>Não existem usuários cadastrados</p>
    <?php endif; ?>
</body>
</html>