<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<h2>Add Product</h2>
<form action="addProduct" method="post">
    <label for="productName">Product Name:</label><br>
    <input type="text" id="productName" name="productName" required><br><br>
    
    <label for="description">Description:</label><br>
    <input type="text" id="description" name="description" required><br><br>
    
    <label for="price">Price:</label><br>
    <input type="number" id="price" name="price" step="0.01" required><br><br>
    
    <label for="quantity">Quantity:</label><br>
    <input type="number" id="quantity" name="quantity" required><br><br>
    
    <input type="submit" value="Add Product">
</form>
</body>
</html>
