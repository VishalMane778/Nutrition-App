<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.yash.nutritionapp.domain.Product"%>
<html>
<head>
<title>Product List</title>
</head>
<body>
	<h2>Product List</h2>
	<a href="productForm.jsp?action=add">Add New Product</a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td>${product.quantity}</td>
				<td><a
					href="product?action=edit&productId=${product.productId}">Edit</a>
					<a href="product?action=delete&productId=${product.productId}"
					onclick="return confirm('Are you sure you want to delete this product?');">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${empty products}">
		<tr>
			<td colspan="6">No products available.</td>
		</tr>
	</c:if>
</body>
</html>