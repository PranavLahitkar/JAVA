import java.sql.*;

public class StudentDatabase {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/student_database";
    private static final String USER = "pranav";
    private static final String PASSWORD = "12345678";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            // Establish connection to MySQL database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create a new table for students if not exists
            createTable();

            // Perform database operations
            addStudent("Akshay", "Jadhav", 22);
            addStudent("Bob", "Mali", 21);
            displayStudents();

            // Close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable() throws SQLException {
        statement = connection.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS students " +
                     "(id INT AUTO_INCREMENT PRIMARY KEY, " +
                     " first_name VARCHAR(255), " +
                     " last_name VARCHAR(255), " +
                     " age INT)";
        statement.executeUpdate(sql);
        statement.close();
    }

    private static void addStudent(String firstName, String lastName, int age) throws SQLException {
        statement = connection.createStatement();
        String sql = "INSERT INTO students (first_name, last_name, age) VALUES ('" + firstName + "', '" + lastName + "', " + age + ")";
        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Student added successfully.");
    }

    private static void displayStudents() throws SQLException {
        statement = connection.createStatement();
        String sql = "SELECT * FROM students";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + ", Age: " + age);
        }
        statement.close();
    }
}
