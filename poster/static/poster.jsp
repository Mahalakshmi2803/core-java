<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Submit Poster</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4 text-success">Poster Submission Form</h2>
    <form action="submitPoster" method="post">
        <div class="mb-3">
            <label>Poster Name</label>
            <input type="text" class="form-control" name="posterName" required>
        </div>
        <div class="mb-3">
            <label>Poster Color</label>
            <input type="text" class="form-control" name="posterColor" required>
        </div>
        <div class="mb-3">
            <label>Poster Material</label>
            <input type="text" class="form-control" name="posterMaterial" required>
        </div>
        <div class="mb-3">
            <label>Poster Size (cm)</label>
            <input type="number" class="form-control" name="posterLengthInCm" required>
        </div>
        <div class="mb-3">
            <label>Poster Release Date</label>
            <input type="date" class="form-control" name="posterReleaseDate" required>
        </div>
        <div class="mb-3">
            <label>Is a Good Poster?</label><br>
            <input type="radio" name="IsAGoodPoster" value="Yes" required> Yes
            <input type="radio" name="IsAGoodPoster" value="No"> No
        </div>
        <button type="submit" class="btn btn-primary">Submit Poster</button>
    </form>
</div>
</body>
</html>
