<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
	<h2>There was an error adding the product!</h2>
	<!-- <p>Please try again later.</p>
	<p>
		<a href="addProduct.jsp">Go Back to Add Product</a>
	</p> -->

	<p>${errorMessage}</p>
<a href="productForm">Go back to product list</a>
</body>
</html>