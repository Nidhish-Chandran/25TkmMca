<?php
$students = [];

if (isset($_POST['submit'])) {

    // Get names from input
    $input = $_POST['names'];

    // Convert comma-separated string to array
    $students = explode(",", $input);

    // Remove extra spaces
    $students = array_map('trim', $students);

    echo "<h3>Original Array:</h3>";
    echo "<pre>";
    print_r($students);
    echo "</pre>";

    // Ascending sort
    $asc = $students;
    asort($asc);

    echo "<h3>After asort() (Ascending):</h3>";
    echo "<pre>";
    print_r($asc);
    echo "</pre>";

    // Descending sort
    $desc = $students;
    arsort($desc);

    echo "<h3>After arsort() (Descending):</h3>";
    echo "<pre>";
    print_r($desc);
    echo "</pre>";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Student Array Input</title>
</head>
<body>

<h2>Enter Student Names</h2>

<form method="POST">
    Enter names (comma separated): <br><br>
    <input type="text" name="names" placeholder="Rahul, Anu, Meera" required>
    <br><br>
    <button type="submit" name="submit">Submit</button>
</form>

</body>
</html>