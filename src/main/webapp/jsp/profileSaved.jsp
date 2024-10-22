<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile Saved</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h3>Profile Saved Successfully!</h3>
        <h2>Your BMI: <strong><%= request.getAttribute("bmiValue") %></strong></h2>
        <h2>Category: <strong><%= request.getAttribute("bmiCategory") %></strong></h2>
        <p>
            <a href="jsp/healthProfile.jsp">Go Back to Profile</a><br>
             <a href="jsp/setGoals.jsp">Set your goals now</a>
        </p>
    </div>
</body>
</html>