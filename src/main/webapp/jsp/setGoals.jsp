<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Set Health/Fitness Goals</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Set Your Health/Fitness Goals</h1>
    <form action="../setGoals" method="post">
        <label for="goalType">Goal Type:</label>
        <select id="goalType" name="goalType" required>
            <option value="weightLoss">Weight Loss</option>
            <option value="muscleGain">Muscle Gain</option>
        </select><br><br>

        <label for="goalValue">Goal (kg):</label>
        <input type="range" id="goalValue" name="goalValue" min="1" max="20"><br><br>

        <label for="timeframe">Timeframe:</label>
        <select id="timeframe" name="timeframe" required>
            <option value="1_month">1 Month</option>
            <option value="3_months">3 Months</option>
            <option value="6_months">6 Months</option>
        </select><br><br>

        <button type="submit">Set Goals</button>
    </form>
</body>
</html>

