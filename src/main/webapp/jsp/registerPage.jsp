<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registration Page</title>

</head>
<body>
	<h2>Register Here</h2>
	<form name="registrationForm" action="registerController">
		Enter Username : <input type="text" name="name" id = "name" onInput="validateName()" value = "Kiran Tilelar" required>
		<div id="name-validation" style="color:red;"></div>
		<br>
		Enter EmailID : <input type="text" name="email" id="email" onChange="validateEmail()" value="kiran@yash.com" required>
		<div id="email-validation" style="color:red;"></div>
		<br>
		Enter your password : <input type="password" name="password" id="password" onInput="validatePassword()" min="7" value="123" required>
		<div id="password-validation" style="color:red;"></div>
		<br>
		Re-enter your password : <input type="password" name="confirmPassword" onInput="validateConfirmPassword()" min="7" id="confirmPassword" required>
		<div id="confirmPassword-validation" style="color:red;"></div>
		<br>
		Enter your height(cm) : <input type="number" name="height" min="150" max="250" id="height" value="150" required><br><br>
		Enter your weight(kg) : <input type="number" name="weight" min="30" max="300" id="weight" value="30" required><br><br>
		<input type="submit" value="register">
	</form>
</body>

<script type="text/javascript">

	function validateName() {

		const name = document.forms["registrationForm"]["name"].value;

		if (/\d/.test(name)) {
			document.getElementById("name-validation").innerHTML = "Username do not contain digit";
		}
		else if (name.length < 6 || name.length > 20) {
			document.getElementById("name-validation").innerHTML = "Please enter username with minimum 6 and maximum 20 characters";
		}
		else {
			document.getElementById("name-validation").innerHTML = "";
		}
	}

	function validatePassword() {
		const password = document.forms["registrationForm"]["password"].value;

	    const specialCharacterSet = "!@#$%^&*()-_=+";
	    let hasSpecialChar = false;

	    for (let char of specialCharacterSet) {
	        if (password.includes(char)) {
	            hasSpecialChar = true;
	            break;
	        }
	    }

	    if (!hasSpecialChar) {
	    	document.getElementById("password-validation").innerHTML = "Password must contain special character";
	    }
	    else if (password.length < 8) {
	    	document.getElementById("password-validation").innerHTML = "Password must be of atleast 8 charaters";
	    }
	    else {
	    	document.getElementById("password-validation").innerHTML = "";
	    }
	}

	function validateConfirmPassword () {

		const password = document.forms["registrationForm"]["password"].value;
		const confirmPassword = document.forms["registrationForm"]["confirmPassword"].value;

		if (confirmPassword != password) {
	    	document.getElementById("confirmPassword-validation").innerHTML = "Password do not matched";
		}
		else {
			document.getElementById("confirmPassword-validation").innerHTML = "";
		}
	}

	function validateEmail () {
		const email = document.forms["registrationForm"]["email"].value;
		const splitedEmail = email.split("@");

		if (splitedEmail[1] != "yash.com") {
			document.getElementById("email-validation").innerHTML = "Invalid email (ex.yourname@yash.com)";
		}
		else {
			document.getElementById("email-validation").innerHTML = "";
		}
	}

	/* function authenticateUser() {
	    var name = document.forms["registrationForm"]["name"].value;
	    var password = document.forms["registrationForm"]["password"].value;
	    var confirmPassword = document.forms["registrationForm"]["confirmPassword"].value;


	    if(/^\d/.test(name)) {
	    	alert("Do not start username with a digit");
	        return false;

	    }

	    if(!(/^[a-z0-9]+$/i.test(name))) {
	        alert("Please enter only letters and numbers");
	        return false;

	    }

	    if (name.length < 6 || name.length > 20) {
		    alert("Please enter username with minimum 5 and maximum 15 characters");
		    return false;

		}

	    else {
			return passwordValidation(password, confirmPassword);
	    }

	}

	function passwordValidation(password, confirmPassword) {
	    const specialCharacterSet = "!@#$%^&*()-_=+";
	    let hasSpecialChar = false;

	    for (let char of specialCharacterSet) {
	        if (password.includes(char)) {
	            hasSpecialChar = true;
	            break;
	        }
	    }

	    if (password === password.toLowerCase()) {
	        alert("Enter at least one uppercase letter");
	        return false;
	    } else if (password === password.toUpperCase()) {
	        alert("Enter at least one lowercase letter");
	        return false;
	    } else if (!/\d/.test(password)) {
	        alert("Enter at least one digit in your password");
	        return false;
	    } else if (!hasSpecialChar) {
	        alert("Your password must contain one special character");
	        return false;
	    } else if (password != confirmPassword) {
	    	alert("Enter same password as above");
	    	return false;
	    } else {
	    	submitForm();
	    	return true;
	    }

	}


    function submitForm() {
    	document.registrationForm.action = "registerController";
        document.registrationForm.submit();
     } */

</script>

</html>