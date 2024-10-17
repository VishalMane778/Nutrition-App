<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Schedule Notification</title>
    <link rel="stylesheet" href="notification.css">
    <script src="notification.js"></script>
</head>
<body>
    <h2>Schedule a Notification</h2>
    <form action="NotificationController" method="post">
        <input type="hidden" name="action" value="schedule"/>
        User ID: <input type="text" name="userId" required/><br/>
        Type: <input type="text" name="type" required/><br/>
        Time: <input type="time" name="time" required/><br/>
        Message: <input type="text" name="message" required/><br/>
        Status: <input type="text" name="status" required/><br/>
        <input type="submit" value="Schedule Notification"/>
    </form>
</body>
</html>
