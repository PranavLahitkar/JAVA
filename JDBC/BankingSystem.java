import java.sql.*;

public class BankingSystem {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/banking_system";
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

            // Create a new table for accounts if not exists
            createTable();

            // Perform banking operations
            createAccount("John Doe", 1000.0);
            deposit(1, 500.0);
            withdraw(1, 200.0);
            checkBalance(1);

            // Close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable() throws SQLException {
        statement = connection.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS accounts " +
                     "(id INT AUTO_INCREMENT PRIMARY KEY, " +
                     " name VARCHAR(255), " +
                     " balance DOUBLE)";
        statement.executeUpdate(sql);
        statement.close();
    }

    private static void createAccount(String name, double initialBalance) throws SQLException {
        statement = connection.createStatement();
        String sql = "INSERT INTO accounts (name, balance) VALUES ('" + name + "', " + initialBalance + ")";
        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Account created successfully.");
    }

    private static void deposit(int accountId, double amount) throws SQLException {
        statement = connection.createStatement();
        String sql = "UPDATE accounts SET balance = balance + " + amount + " WHERE id = " + accountId;
        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Deposited $" + amount + " successfully.");
    }

    private static void withdraw(int accountId, double amount) throws SQLException {
        statement = connection.createStatement();
        String sql = "UPDATE accounts SET balance = balance - " + amount + " WHERE id = " + accountId;
        statement.executeUpdate(sql);
        statement.close();
        System.out.println("Withdrawn $" + amount + " successfully.");
    }

    private static void checkBalance(int accountId) throws SQLException {
        statement = connection.createStatement();
        String sql = "SELECT balance FROM accounts WHERE id = " + accountId;
        resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            double balance = resultSet.getDouble("balance");
            System.out.println("Current balance: $" + balance);
        }
        statement.close();
    }
}
