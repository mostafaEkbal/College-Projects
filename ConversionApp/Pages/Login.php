<?php if (!isset($_POST['sumbit'])): ?>
    <form action="<?php ($_SERVER['PHP_SELF']); ?>" method="post">
        <label for="clientName">Enter your first and last Name</label>
        <input type="text" onfocus="focusAction()" onblur="blurAction()" name="clientName">
        <label for="clientEmail">Enter your email</label>
        <input type="text" name="clientEmail">
        <button type="sumbit" name="sumbit">register</button>
        <div id="message-box"></div>
        <script>
            const message = document.querySelector('#message-box');
            function blurAction() {
                message.textContent = 'Please write your information';
            }
            function focusAction() {
                message.textContent = 'Good Boy';
            }
        </script>
    </form>
<?php endif; ?>

<?php
function postData()
{
    include("$_SERVER[DOCUMENT_ROOT]/config/database.php");
    if (isset($_POST['sumbit'])) {
        $name = htmlspecialchars($_POST['clientName']);
        $email = htmlspecialchars($_POST['clientEmail']);
        if (!preg_match('/^[\w\-\.\+]+\@\w+\.\w{2,4}$/', $email)) {
            $emailErr = "Invalid email format";
            return $emailErr;
        }
        $sumbit_query = "INSERT INTO userdata(clientName, email) VALUES ('$name', '$email') ";
        mysqli_query($conn, $sumbit_query);
        return "you haved signed up successfully!";
    }
}

echo postData();

?>