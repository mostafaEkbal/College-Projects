<?php if (!isset($_POST['sumbit'])): ?>
    <form action="<?php ($_SERVER['PHP_SELF']); ?>" class="login-form" method="post">
        <div class="login-label">
            <label for="clientName">Enter your first and last Name</label>
            <input type="text" onfocus="focusAction()" onblur="blurAction()" name="clientName">
        </div>
        <div class="login-label">
            <label for="clientEmail">Enter your email</label>
            <input type="text" onchange="inputChangeAction()" id="email-input" name="clientEmail">
        </div>
        <button type="sumbit" name="sumbit">register</button>
        <div id="message-box"></div>
        <script>
            const message = document.querySelector('#message-box');
            const email = document.querySelector('#email-input');
            function blurAction() {
                message.textContent = 'Please write your information, and then press register';
            }
            function focusAction() {
                message.textContent = 'Thank you for your patience';
            }
            function inputChangeAction() {
                const pattern = /^[\w\-\.\+]+\@\w+\.\w{2,4}$/;
                let test = pattern.test(email.value);
                if (test) {
                    message.textContent = 'This is a vaid email, you can press register now';
                    return
                }
                message.textContent = 'Not a valid email, please try again  ';
                return;
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