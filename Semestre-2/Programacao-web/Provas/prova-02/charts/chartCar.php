<?php 

require_once "../config/conn.php";
include_once "../inc/header.php";

$table = "car_lgfb";
$query =  "SELECT * FROM $table";
$stmt = $conn->prepare($query);

$stmt->execute();

$list= $stmt->fetchAll(PDO::FETCH_ASSOC);

?>

<section>


  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <script type="text/javascript">
    google.charts.load('current', {
      'packages': ['corechart']
    });
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
      var data = google.visualization.arrayToDataTable([
        ['Ano', 'Dados'],
        <?php foreach($list as $chartData):?>
          ['<?=$chartData['year'];?>', <?=$chartData['salary'] / $chartData['car_price'];?>],
          <?php endforeach; ?>
      ]);

      var options = {
        title: 'Salario dividido por carro',
        curveType: 'function',
        legend: {
          position: 'bottom'
        }
      };

      var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

      chart.draw(data, options);
    }
  </script>

<div id="curve_chart" style="width: 100%; height: auto"></div>
</section>