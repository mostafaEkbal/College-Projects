<?php
include("$_SERVER[DOCUMENT_ROOT]/config/database.php");
if (isset($_POST['sumbit'])) {
    $name = htmlspecialchars($_POST['clientName']);
    $email = htmlspecialchars($_POST['clientEmail']);
    $sumbit_query = "INSERT INTO userdata(clientName, email) VALUES ('$name', '$email') ";
    echo mysqli_query($conn, $sumbit_query);
}
?>

<form action="<?php ($_SERVER['PHP_SELF']); ?>" method="post">
    <label for="clientName">Enter your first and last Name</label>
    <input type="text" name="clientName">
    <label for="clientEmail">Enter your email</label>
    <input type="text" name="clientEmail">
    <button type="sumbit" name="sumbit">register</button>
</form>