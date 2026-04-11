<?php
$conn = new mysqli("localhost", "root", "", "library");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$message = "";

// INSERT BOOK
if (isset($_POST['add'])) {
    $acc = $_POST['acc'];
    $title = $_POST['title'];
    $authors = $_POST['authors'];
    $edition = $_POST['edition'];
    $publisher = $_POST['publisher'];

    if ($acc && $title && $authors && $edition && $publisher) {

        $stmt = $conn->prepare("INSERT INTO books VALUES (?, ?, ?, ?, ?)");
        $stmt->bind_param("issss", $acc, $title, $authors, $edition, $publisher);

        if ($stmt->execute()) {
            $message = "Book added successfully!";
        } else {
            $message = "Error: Accession number may already exist!";
        }
    } else {
        $message = "All fields are required!";
    }
}

// SEARCH BOOK
$result = null;
if (isset($_POST['search'])) {
    $search_title = $_POST['search_title'];

    $stmt = $conn->prepare("SELECT * FROM books WHERE title LIKE ?");
    $search_param = "%" . $search_title . "%";
    $stmt->bind_param("s", $search_param);
    $stmt->execute();
    $result = $stmt->get_result();
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Library System</title>
    <style>
        body { font-family: Arial; background: #f4f4f4; }
        .container { width: 500px; margin: auto; background: white; padding: 20px; border-radius: 10px; }
        input { width: 100%; padding: 8px; margin: 5px 0; }
        button { padding: 10px; width: 100%; margin-top: 10px; }
        table { width: 80%; margin: 20px auto; border-collapse: collapse; background: white; }
        th, td { border: 1px solid black; padding: 10px; text-align: center; }
        th { background: #333; color: white; }
        h2 { text-align: center; }
        .msg { text-align: center; color: green; }
    </style>
</head>
<body>

<div class="container">
    <h2>Add Book</h2>

    <p class="msg"><?php echo $message; ?></p>

    <form method="POST">
        Accession No:
        <input type="number" name="acc">

        Title:
        <input type="text" name="title">

        Authors:
        <input type="text" name="authors">

        Edition:
        <input type="text" name="edition">

        Publisher:
        <input type="text" name="publisher">

        <button type="submit" name="add">Add Book</button>
    </form>

    <h2>Search Book</h2>

    <form method="POST">
        Enter Title:
        <input type="text" name="search_title">

        <button type="submit" name="search">Search</button>
    </form>
</div>

<?php
// DISPLAY RESULTS
if ($result && $result->num_rows > 0) {
    echo "<table>";
    echo "<tr>
            <th>Accession No</th>
            <th>Title</th>
            <th>Authors</th>
            <th>Edition</th>
            <th>Publisher</th>
          </tr>";

    while ($row = $result->fetch_assoc()) {
        echo "<tr>";
        echo "<td>".$row['accession_no']."</td>";
        echo "<td>".$row['title']."</td>";
        echo "<td>".$row['authors']."</td>";
        echo "<td>".$row['edition']."</td>";
        echo "<td>".$row['publisher']."</td>";
        echo "</tr>";
    }

    echo "</table>";
} elseif (isset($_POST['search'])) {
    echo "<h3 style='text-align:center;'>No results found</h3>";
}

$conn->close();
?>

</body>
</html>