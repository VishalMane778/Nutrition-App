<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,com.yash.nutritionapp.domain.Nutrient"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Nutrients</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
        font-weight: bold;
    }
    tfoot td {
        border-top: 2px solid black;
        text-align: center;
    }
</style>
</head>
<body>

<!-- Bootstrap Container -->
<div class="container mt-5">
    <h1 class="text-center">Add Nutrient</h1>

     <!-- Bootstrap Form -->
    <form action="../nutrients" method="post">
        <div class="form-group">
            <label for="nutrientName">Nutrient name:</label>
            <input type="text" class="form-control" id="nutrientName" name="nutrientName" required>
        </div>
        <div class="form-group">
            <label for="nutrientCalorie">Nutrient calorie:</label>
            <input type="number" class="form-control" id="nutrientCalorie" name="nutrientCalorie" step="0.01" required>
        </div>
        <div class="form-group">
            <label for="nutrientCarbs">Nutrient carbs:</label>
            <input type="number" class="form-control" id="nutrientCarbs" name="nutrientCarbs" step="0.01" required>
        </div>
        <div class="form-group">
            <label for="nutrientSugar">Nutrient sugar:</label>
            <input type="number" class="form-control" id="nutrientSugar" name="nutrientSugar" step="0.01" required>
        </div>
        <div class="form-group">
            <label for="nutrientFat">Nutrient fat:</label>
            <input type="number" class="form-control" id="nutrientFat" name="nutrientFat" step="0.01" required>
        </div>
        <div class="form-group">
            <label for="nutrientProtein">Nutrient protein:</label>
            <input type="number" class="form-control" id="nutrientProtein" name="nutrientProtein" step="0.01" required>
        </div>
        <div class="form-group">
            <label for="nutrientDescription">Nutrient Description:</label>
            <input type="text" class="form-control" id="nutrientDescription" name="nutrientDescription" required>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

    <h1 class="text-center mt-5">Nutrients List</h1>

    <!-- Bootstrap Table -->
<table class="table table-striped table-bordered table-hover shadow">
    <thead>
        <tr>
            <th>Sr. No</th>
            <th>Nutrient Name</th>
            <th>Calorie</th>
            <th>Carbs</th>
            <th>Sugar</th>
            <th>Fat</th>
            <th>Protein</th>
            <th>Description</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
    <%
        List<Nutrient> nutrients = (List<Nutrient>) request.getAttribute("nutrients");
        if (nutrients != null) {
            int serialNo = 1;
            for (Nutrient nutrient : nutrients) {
    %>
        <tr>
            <td><%= serialNo %></td>
            <td><%= nutrient.getNutrientName() %></td>
            <td><%= nutrient.getNutrientCalorie() %></td>
            <td><%= nutrient.getNutrientCarbs() %></td>
            <td><%= nutrient.getNutrientSugar() %></td>
            <td><%= nutrient.getNutrientFat() %></td>
            <td><%= nutrient.getNutrientProtein() %></td>
            <td><%= nutrient.getNutrientDescription() %></td>
            <td><button type="button" class="btn btn-primary">Edit</button></td>
        	<td><button type="button" class="btn btn-danger">Delete</button></td>
        </tr>
    <%
        serialNo++;
            }
        }
    %>
    </tbody>
</table>
</div>

<!-- Bootstrap JavaScript -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvY IK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>