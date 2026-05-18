import java.sql.*;

public class Rcoem_304 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/rcoem_aiml";
        String user = "root";
        String password = "Aryan@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database");

            Statement stmt = con.createStatement();

            String sqlQuery =
                    "CREATE TABLE IF NOT EXISTS rcoem_std (" +
                            "std_no INT PRIMARY KEY, " +
                            "std_name VARCHAR(100), " +
                            "std_salary DOUBLE)";

            stmt.executeUpdate(sqlQuery);
            System.out.println("Table Created Successfully");

            String insertQuery =
                    "INSERT INTO rcoem_std (std_no, std_name, std_salary) VALUES (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(insertQuery);

            pst.setInt(1, 101);
            pst.setString(2, "Aryan");
            pst.setDouble(3, 500000);
            pst.executeUpdate();

            pst.setInt(1, 102);
            pst.setString(2, "Kedia");
            pst.setDouble(3, 200000);
            pst.executeUpdate();

            pst.setInt(1, 103);
            pst.setString(2, "Harsh");
            pst.setDouble(3, 567890);
            pst.executeUpdate();

            pst.setInt(1, 104);
            pst.setString(2, "Modi");
            pst.setDouble(3, 122330);
            pst.executeUpdate();

            System.out.println("Data inserted successfully 👌");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
