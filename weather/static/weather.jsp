<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Details</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background: black; /* Matching the index page */
            color: white;
        }

        .card {
            background-color: #1e1e1e;
            border: none;
            padding: 2rem;
            border-radius: 0; /* No curves */
            color: white;
        }

        h1 {
            font-weight: 600;
            color: white;
        }

        .form-control,
        .form-select {
            border: 2px solid #fff;
            box-shadow: none;
            border-radius: 0;
            background-color: #000;
            color: white;
        }

        .form-control::placeholder {
            color: #aaa;
        }

        .form-select option {
            color: black; /* So options are visible in dropdown */
        }

        .btn-success {
            padding: 0.5rem 2rem;
            border-radius: 0;
            font-weight: 600;
        }

        .navbar {
            border-bottom: 1px solid #444;
        }

        label {
            color: #ddd;
        }

        .text-danger {
            color: #ff4d4d !important;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </div>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card shadow" style="width: 100%; max-width: 700px;">
        <div class="text-center">
            <h1>Weather Details</h1>
        </div>
        <h3 class="text-danger text-center">${message}</h3>
        <form action="weather" method="post">
            <!-- All Input Fields (Same as before) -->
            <div class="mb-3">
                <label for="placeName" class="form-label">Place Name</label>
                <input type="text" class="form-control" id="placeName" name="placeName" placeholder="Enter Place Name">
            </div>
            <div class="mb-3">
                <label for="weather" class="form-label">Weather</label>
                <input type="text" class="form-control" id="weather" name="weather" placeholder="Enter Weather">
            </div>
            <div class="mb-3">
                <label for="minTemp" class="form-label">Min Temperature</label>
                <input type="number" class="form-control" id="minTemp" name="minTemp" placeholder="Min Temperature">
            </div>
            <div class="mb-3">
                <label for="maxTemp" class="form-label">Max Temperature</label>
                <input type="number" class="form-control" id="maxTemp" name="maxTemp" placeholder="Max Temperature">
            </div>
            <div class="mb-3">
                <label class="form-label">Cloudy</label>
                <select class="form-select" name="cloudy">
                    <option selected disabled>Choose option</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">raining</label>
                <select class="form-select" name="raining">
                    <option selected disabled>Choose option</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="rainInMM" class="form-label">Rain in MM</label>
                <input type="number" class="form-control" id="rainInMM" name="rainInMM" placeholder="Enter Rain in MM">
            </div>
            <div class="mb-3">
                <label for="humidity" class="form-label">Humidity</label>
                <input type="number" class="form-control" id="humidity" name="humidity" placeholder="Enter Humidity">
            </div>
            <div class="mb-3">
                <label for="windSpeed" class="form-label">Wind Speed</label>
                <input type="number" class="form-control" id="windSpeed" name="windSpeed" placeholder="Enter Wind Speed">
            </div>
            <div class="mb-3">
                <label for="sunRiseTime" class="form-label">Sunrise Time</label>
                <input type="time" class="form-control" id="sunRiseTime" name="sunRiseTime">
            </div>
            <div class="mb-3">
                <label for="sunSetTime" class="form-label">Sunset Time</label>
                <input type="time" class="form-control" id="sunSetTime" name="sunSetTime">
            </div>
            <div class="mb-3">
                <label for="moonRiseTime" class="form-label">Moonrise Time</label>
                <input type="time" class="form-control" id="moonRiseTime" name="moonRiseTime">
            </div>
            <div class="mb-3">
                <label for="moonSetTime" class="form-label">Moonset Time</label>
                <input type="time" class="form-control" id="moonSetTime" name="moonSetTime">
            </div>
            <div class="mb-3">
                <label for="rainStartTime" class="form-label">Rain Start Time</label>
                <input type="time" class="form-control" id="rainStartTime" name="rainStartTime">
            </div>
            <div class="mb-3">
                <label for="rainEndTime" class="form-label">Rain End Time</label>
                <input type="time" class="form-control" id="rainEndTime" name="rainEndTime">
            </div>
            <div class="mb-3">
                <label for="precipitation" class="form-label">Precipitation</label>
                <input type="number" class="form-control" id="precipitation" name="precipitation" placeholder="Enter Precipitation">
            </div>
            <div class="text-center">
                <button class="btn btn-success" type="submit">Submit</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
