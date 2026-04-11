<?php
// Step 1: Connect to database
$conn = new mysqli("localhost", "root", "", "college");

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Step 2: Fetch data
$sql = "SELECT * FROM students";
$result = $conn->query($sql);
?>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
    <style>
        body {
            font-family: Arial;
            background: #f4f4f4;
        }
        table {
            width: 60%;
            margin: 50px auto;
            border-collapse: collapse;
            background: white;
        }
        th, td {
            padding: 12px;
            border: 1px solid #333;
            text-align: center;
        }
        th {
            background: #4CAF50;
            color: white;
        }
        tr:hover {
            background: #f1f1f1;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>

<h2>Student Details</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Course</th>
    </tr>

    <?php
    // Step 3: Display data
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "<tr>";
            echo "<td>".$row['id']."</td>";
            echo "<td>".$row['name']."</td>";
            echo "<td>".$row['email']."</td>";
            echo "<td>".$row['course']."</td>";
            echo "</tr>";
        }
    } else {
        echo "<tr><td colspan='4'>No records found</td></tr>";
    }

    $conn->close();
    ?>

</table>

</body>
</html>