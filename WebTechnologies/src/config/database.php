<?php
define("DB_HOST", "localhost");
define("DB_USER", "ekbal");
define("DB_PASS", "123456");
define("DB_NAME", "php_dev");
function connectDatabase($host, $user, $pass, $name)
{
    $conn = new mysqli($host, $user, $pass, $name);
    if ($conn->connect_error) {
        die("Connection Failed" . $conn->connect_errno);
    }
    return $conn;
}
$conn = connectDatabase(DB_HOST, DB_USER, DB_PASS, DB_NAME);
?>