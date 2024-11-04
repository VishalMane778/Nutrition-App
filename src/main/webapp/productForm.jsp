<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  --%>
<html>
<head>
    <title>${product != null ? 'Edit Product' : 'Add Product'}</title>
</head>
<body>
<h2>${product != null ? 'Edit Product' : 'Add Product'}</h2>

<form action="product" method="post">
    <input type="hidden" name="action" value="${product != null ? 'update' : 'add'}"/>
    <input type="hidden" name="productId" value="${product != null ? product.productId : ''}"/>
    
    <label for="productName">Product Name:</label>
    <input type="text" id="productName" name="productName" value="${product != null ? product.productName : ''}" required/><br/>
    
    <label for="description">Description:</label>
    <textarea id="description" name="description" required>${product != null ? product.description : ''}</textarea><br/>
    
    <label for="price">Price:</label>
    <input type="number" id="price" name="price" value="${product != null ? product.price : ''}" step="0.01" required/><br/>
    
    <label for="quantity">Quantity:</label>
    <input type="number" id="quantity" name="quantity" value="${product != null ? product.quantity : ''}" required/><br/>
    
    <input type="submit" value="${product != null ? 'Update Product' : 'Add Product'}"/>
    <a href="product?action=list">Cancel</a>
</form>
</body>
</html>