<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Poster Review</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Google Font: Montserrat -->
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600&display=swap" rel="stylesheet">

    <style>
        body {
            font-family: 'Montserrat', sans-serif;
            background: linear-gradient(to right, #e0f7fa, #f1f8e9);
            color: #212121;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }

        .navbar {
            background-color: #004d40;
        }

        .navbar-brand {
            font-weight: 600;
            font-size: 1.5rem;
        }

        .main-content {
            flex-grow: 1;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .welcome-box {
            background-color: #ffffff;
            border-radius: 20px;
            padding: 40px;
            text-align: center;
            max-width: 600px;
            margin: auto;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
        }

        h2 {
            font-weight: 600;
            color: #00695c;
            margin-bottom: 15px;
        }

        p {
            font-size: 1.1rem;
            color: #424242;
        }

        .btn-custom {
            background-color: #00796b;
            border: none;
            padding: 12px 30px;
            font-weight: 600;
            color: white;
            border-radius: 40px;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }

        .btn-custom:hover {
            background-color: #004d40;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Poster Review</a>
    </div>
</nav>

<!-- Main Content -->
<div class="main-content">
    <div class="welcome-box">

        <h3> Give the review for  Poster </h3>
        <a href="poster.jsp" class="btn btn-custom">Here you go</a>
    </div>
</div>

</body>
</html>
