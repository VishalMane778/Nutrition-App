<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
<body>
    <h2> Login Page </h2>

    <form action="../loginController" method="post">
    	Enter Email : <input type="text" name="email" value = "kiran@yash.com">
    	Enter Password : <input type="password" name="password" value = "1234567"><br><br>
    	<input type="submit">
    </form>
    <ul>
    Don't have account?
    <a href = "./registerPage.jsp"> Register</a>
    </ul>
</body>
</html>
