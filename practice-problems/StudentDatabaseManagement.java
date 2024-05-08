import java.sql.*;

public class StudentDatabaseManagement {

    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost/university";
    static final String USERNAME = "admin";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Call methods for database operations
            addStudent(conn, "John Doe", 20);
            updateStudent(conn, 1, "Jane Smith", 22);
            deleteStudent(conn, 2);
            retrieveStudents(conn);

            // Close connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add a student
    static void addStudent(Connection conn, String name, int age) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students (name, age) VALUES (?, ?)");
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.executeUpdate();
        System.out.println("Student added successfully.");
    }

    // Method to update a student
    static void updateStudent(Connection conn, int id, String name, int age) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("UPDATE students SET name=?, age=? WHERE id=?");
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.setInt(3, id);
        pstmt.executeUpdate();
        System.out.println("Student updated successfully.");
    }

    // Method to delete a student
    static void deleteStudent(Connection conn, int id) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM students WHERE id=?");
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        System.out.println("Student deleted successfully.");
    }

    // Method to retrieve all students
    static void retrieveStudents(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
        }
        rs.close();
    }
}
