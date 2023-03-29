<?php include("config/database.php"); ?>

<?php
$sql = 'SELECT * FROM sales';
$result = mysqli_query($conn, $sql);
$sales = mysqli_fetch_all($result, MYSQLI_ASSOC);
?>

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
            <th class="table-header table-header--1">Client</th>
            <th class="table-header table-header--2">Date</th>
            <th class="table-header table-header--2">Amount</th>
        </tr>

        <?php foreach ($sales as $sale): ?>
            <Tr>
                <td>
                    <?php echo $sale['clientName']; ?>
                </td>
                <td>
                    <?php echo $sale['date']; ?>
                </td>
                <td>
                    <?php echo $sale['amount']; ?>
                </td>
            </Tr>
        <?php endforeach; ?>
    </table>
    <?php if (empty($sales)): ?>
        <h2>No Data</h2>
    <?php endif; ?>
</body>

</html>