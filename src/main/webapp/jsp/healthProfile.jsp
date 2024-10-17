<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Health Profile</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>User Health Profile</h1>
    <form action="saveProfile" method="post">
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>

        <label for="weight">Weight (kg):</label>
        <input type="number" id="weight" name="weight" required><br><br>

        <label for="height">Height (cm):</label>
        <input type="number" id="height" name="height" required><br><br>

        <label for="activityLevel">Activity Level:</label>
        <select id="activityLevel" name="activityLevel" required>
            <option value="low">Low</option>
            <option value="moderate">Moderate</option>
            <option value="high">High</option>
        </select><br><br>

        <button type="submit">Save Profile</button>
    </form>
</body>
</html>
