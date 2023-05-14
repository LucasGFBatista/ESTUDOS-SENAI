<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--    INFO TABS   -->
  <title>Cabeleleira Leila</title>
  <link rel="shortcut icon" href="./assets/img/logo.png" type="image/x-icon">

  <link rel="stylesheet" href="./assets/css/style.css">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

</head>

<body>
  <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container">
      <a class="navbar-brand" href="index.php"><img src="./assets/img/logo.png" alt="Logo"> </a>
      <a class="navbar-brand" href="index.php">Cabeleleira Leila</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="index.php">Home</a>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Cadastro
            </a>
            <ul class="dropdown-menu">
              <li class="nav-item">
                <a class="dropdown-item" href="./create.php">Cadastrar cliente</a>
              </li>

              <li class="nav-item">
                <a class="dropdown-item" href="./list.php">Lista de cliente</a>
              </li>
            </ul>
          </li>

        </ul>
      </div>
    </div>
  </nav>