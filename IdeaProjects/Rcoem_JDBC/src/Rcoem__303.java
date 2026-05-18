import java.sql.*;

public class Rcoem__303 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/rcoem_aiml";
        String user = "root";
        String password = "Aryan@123"; // your MySQL password

        try {
            // Load driver (optional but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL Database successfully!");

            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
