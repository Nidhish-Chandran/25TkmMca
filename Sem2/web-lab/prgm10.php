<?php
// Database connection
$conn = new mysqli("localhost", "root", "", "test");

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$name = $email = "";
$errors = [];
$success = "";

// Form submit
if (isset($_POST['submit'])) {

    $name = trim($_POST['name']);
    $email = trim($_POST['email']);
    $password = $_POST['password'];
    $confirm_password = $_POST['confirm_password'];

    // Name validation
    if (empty($name)) {
        $errors[] = "Name is required";
    } elseif (!preg_match("/^[a-zA-Z ]+$/", $name)) {
        $errors[] = "Only letters allowed in name";
    }

    // Email validation
    if (empty($email)) {
        $errors[] = "Email is required";
    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errors[] = "Invalid email format";
    }

    // Password validation
    if (empty($password)) {
        $errors[] = "Password is required";
    } elseif (strlen($password) < 6) {
        $errors[] = "Password must be at least 6 characters";
    }

    // Confirm password
    if ($password !== $confirm_password) {
        $errors[] = "Passwords do not match";
    }

    // Check if email already exists
    $check = $conn->prepare("SELECT id FROM users WHERE email=?");
    $check->bind_param("s", $email);
    $check->execute();
    $check->store_result();

    if ($check->num_rows > 0) {
        $errors[] = "Email already registered";
    }

    // If no errors → insert
    if (empty($errors)) {
        $hashed_password = password_hash($password, PASSWORD_DEFAULT);

        $stmt = $conn->prepare("INSERT INTO users (name, email, password) VALUES (?, ?, ?)");
        $stmt->bind_param("sss", $name, $email, $hashed_password);

        if ($stmt->execute()) {
            $success = "Registration Successful!";
            $name = $email = "";
        } else {
            $errors[] = "Something went wrong";
        }
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <style>
        body {
            font-family: Arial;
            background: #f4f4f4;
        }
        .container {
            width: 350px;
            margin: 80px auto;
            padding: 20px;
            background: white;
            box-shadow: 0 0 10px gray;
            border-radius: 10px;
        }
        input {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px;
        }
        button {
            width: 100%;
            padding: 10px;
            background: green;
            color: white;
            border: none;
        }
        .error {
            color: red;
        }
        .success {
            color: green;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Register</h2>

    <!-- Error messages -->
    <?php
    if (!empty($errors)) {
        foreach ($errors as $e) {
            echo "<p class='error'>$e</p>";
        }
    }

    // Success message
    if ($success) {
        echo "<p class='success'>$success</p>";
    }
    ?>

    <form method="POST">
        Name:
        <input type="text" name="name" value="<?php echo $name; ?>">

        Email:
        <input type="text" name="email" value="<?php echo $email; ?>">

        Password:
        <input type="password" name="password">

        Confirm Password:
        <input type="password" name="confirm_password">

        <button type="submit" name="submit">Register</button>
    </form>
</div>

</body>
</html>