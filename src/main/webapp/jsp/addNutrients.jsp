<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Nutrients</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<!-- Bootstrap Container -->
<div class="container mt-5">
    <h1 class="text-center">Add Nutrient</h1>

    <!-- Bootstrap Form -->
    <form action="nutrients" method="post">
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

<!-- Bootstrap JavaScript -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>