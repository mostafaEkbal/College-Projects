<?php include("config/database.php"); ?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>First PHP Site</title>
</head>

<body>
    <table>
        <tr>
            <th class="table-header table-header--1">Name</th>
            <th class="table-header table-header--2">Occupation</th>
        </tr>

        <?php
        $occupations = array(
            "K. Smith" => 'Plumber',
            'N. Jones' => 'Electrican',
            'P. Ibboston' => 'Plasterer'
        );

        foreach ($occupations as $name => $occupation) {
            echo '<tr>';
            echo '<td>', htmlspecialchars(print_r($name, true)), '</td>';
            echo '<td>', htmlspecialchars(print_r($occupation, true)), '</td>';
            echo '</tr>';
        }
        ?>
    </table>
</body>

</html>