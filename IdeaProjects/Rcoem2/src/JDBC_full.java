import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class JDBC_full extends JFrame implements ActionListener{

    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4;
    Connection con;
    Statement st;
    ResultSet rs;

    JDBC_full(){
        setLayout(null);
        l1 = new JLabel("std_no");
        l2 = new JLabel("std_name");
        l3 = new JLabel("std_salary");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        b1 = new JButton("First");
        b2 = new JButton("Next");
        b3 = new JButton("Prev");
        b4 = new JButton("Last");

        l1.setBounds(100, 100, 100, 30);
        l2.setBounds(100, 140, 100, 30);
        l3.setBounds(100, 180, 100, 30);

        tf1.setBounds(220,100,100,30);
        tf2.setBounds(220,140,100,30);
        tf3.setBounds(220,180,100,30);

        b1.setBounds(100, 220, 100, 30);
        b2.setBounds(220, 220, 100, 30);
        b3.setBounds(100, 260, 100, 30);
        b4.setBounds(220, 260, 100, 30);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        String url = "jdbc:mysql://localhost:3306/rcoem_aiml";
        String user = "root";
        String password = "Aryan@123";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database");
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            rs =
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {

    }
}
