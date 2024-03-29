<?php include("config/database.php"); ?>

<?php
$sql = 'SELECT * FROM sales';
$result = mysqli_query($conn, $sql);
$sales = mysqli_fetch_all($result, MYSQLI_ASSOC);

$clientName = $_POST['client-name'];
$date = $_POST['date'];
$amount = $_POST['amount'];
$sumbit_query = "INSERT INTO sales(clientName, date, amount) VALUES ('$clientName', '$date', '$amount') ";
mysqli_query($conn, $sumbit_query);
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
    <form action="functions/post_data.php">
        <h2>Sumbit New Sales Record</h2>
        <label for="client-name">Client Name</label>
        <input type="text" name="client-name">
        <label for="date">Date of Sale</label>
        <input type="date" name="date">
        <label for="amount">Value of Sale</label>
        <input type="number" name="amount" pattern="[0-9]+">
    </form>
    <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>">
        <h2>Produce a Sorted Display of Sales</h2>
        <label for="sort-on">Sort tabel on = </label>
        <select>
            <option value="client">Client</option>
            <option value="date">Date</option>
            <option value="amount">Amount</option>
        </select>
        <label for="sort-in">Sort in = </label>
        <select>
            <option value="ascending">Ascending order</option>
            <option value="descending">Descending order</option>
        </select>
    </form>
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