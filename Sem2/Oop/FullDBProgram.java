import java.sql.*;
import java.util.Scanner;

public class FullDBProgram {

    static final String URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = ""; // XAMPP default = empty

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // 🔹 Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 🔹 Connect to MySQL (XAMPP)
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Statement st = con.createStatement();

            // 🔹 Create Database and Table
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS college");
            st.executeUpdate("USE college");

            st.executeUpdate("CREATE TABLE IF NOT EXISTS students (" +
                    "roll_no INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "marks INT)");

            System.out.println("✅ Database & Table Ready");

            while (true) {

                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Insert Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Update Marks");
                System.out.println("4. Delete Student");
                System.out.println("5. Search by Name");
                System.out.println("6. Count Students");
                System.out.println("7. Highest Marks");
                System.out.println("8. Sort Descending");
                System.out.println("9. Exit (Drop DB)");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Roll No: ");
                        int r1 = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String n1 = sc.nextLine();
                        System.out.print("Marks: ");
                        int m1 = sc.nextInt();

                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO college.students VALUES (?, ?, ?)");
                        ps1.setInt(1, r1);
                        ps1.setString(2, n1);
                        ps1.setInt(3, m1);
                        ps1.executeUpdate();

                        System.out.println("✅ Inserted");
                        break;

                    case 2:
                        ResultSet rs2 = st.executeQuery("SELECT * FROM college.students");
                        while (rs2.next()) {
                            System.out.println(rs2.getInt(1) + " | " +
                                    rs2.getString(2) + " | " +
                                    rs2.getInt(3));
                        }
                        break;

                    case 3:
                        System.out.print("Roll No: ");
                        int r3 = sc.nextInt();
                        System.out.print("New Marks: ");
                        int m3 = sc.nextInt();

                        PreparedStatement ps3 = con.prepareStatement(
                                "UPDATE college.students SET marks=? WHERE roll_no=?");
                        ps3.setInt(1, m3);
                        ps3.setInt(2, r3);
                        ps3.executeUpdate();

                        System.out.println("✅ Updated");
                        break;

                    case 4:
                        System.out.print("Roll No: ");
                        int r4 = sc.nextInt();

                        PreparedStatement ps4 = con.prepareStatement(
                                "DELETE FROM college.students WHERE roll_no=?");
                        ps4.setInt(1, r4);
                        ps4.executeUpdate();

                        System.out.println("✅ Deleted");
                        break;

                    case 5:
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        PreparedStatement ps5 = con.prepareStatement(
                                "SELECT * FROM college.students WHERE name=?");
                        ps5.setString(1, name);

                        ResultSet rs5 = ps5.executeQuery();
                        while (rs5.next()) {
                            System.out.println(rs5.getInt(1) + " | " +
                                    rs5.getString(2) + " | " +
                                    rs5.getInt(3));
                        }
                        break;

                    case 6:
                        ResultSet rs6 = st.executeQuery("SELECT COUNT(*) FROM college.students");
                        if (rs6.next()) {
                            System.out.println("Total Students: " + rs6.getInt(1));
                        }
                        break;

                    case 7:
                        ResultSet rs7 = st.executeQuery(
                                "SELECT * FROM college.students ORDER BY marks DESC LIMIT 1");
                        if (rs7.next()) {
                            System.out.println("Topper: " +
                                    rs7.getString("name") +
                                    " | Marks: " + rs7.getInt("marks"));
                        }
                        break;

                    case 8:
                        ResultSet rs8 = st.executeQuery(
                                "SELECT * FROM college.students ORDER BY marks DESC");
                        while (rs8.next()) {
                            System.out.println(rs8.getInt(1) + " | " +
                                    rs8.getString(2) + " | " +
                                    rs8.getInt(3));
                        }
                        break;

                    case 9:
                        // 🔥 Drop Table and Database
                        st.executeUpdate("DROP TABLE college.students");
                        st.executeUpdate("DROP DATABASE college");

                        System.out.println("❌ Database Deleted. Exiting...");
                        con.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}