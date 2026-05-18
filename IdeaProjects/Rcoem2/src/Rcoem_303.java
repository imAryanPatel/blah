import java.sql.*;

public class Rcoem_303 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Aryan@123";

        String db = "rcoem_aiml";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String query = "CREATE DATABASE " + db;
            stmt.executeUpdate(query);

            System.out.println(db + " : Database Created Successfully.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}