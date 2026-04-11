<?php

// Step 1: Store Indian cricket players in an array
$players = array(
    "Virat Kohli",
    "Rohit Sharma",
    "MS Dhoni",
    "KL Rahul",
    "Hardik Pandya",
    "Jasprit Bumrah",
    "Ravindra Jadeja"
);

?>

<!DOCTYPE html>
<html>
<head>
    <title>Indian Cricket Players</title>
    <style>
        table {
            border-collapse: collapse;
            width: 40%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: lightblue;
        }
    </style>
</head>
<body>

<h2 style="text-align:center;">Indian Cricket Players</h2>

<table>
    <tr>
        <th>Sl. No</th>
        <th>Player Name</th>
    </tr>

    <?php
    // Step 2: Display array in table
    $i = 1;
    foreach ($players as $player) {
        echo "<tr>";
        echo "<td>$i</td>";
        echo "<td>$player</td>";
        echo "</tr>";
        $i++;
    }
    ?>

</table>

</body>
</html>