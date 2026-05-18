import java.awt.*;
import javax.swing.*;
class Rcoem_UI303 extends JFrame{
    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b1,b2,b3;
    JFrame jf;//user defined frame not predefined
             //so no need to close the frame
    Rcoem_UI303(){
        jf = new JFrame("Flow Layout Example");
        jf.setSize(440,150);

        l1 = new JLabel("Enter Name");
        l2 = new JLabel("Enter City");

        tf1 = new JTextField(15);
        tf2 = new JTextField(15);

        b1 = new JButton("Clear");
        b2 = new JButton("Submit");
        b3 = new JButton("Exit");

        jf.setLayout(new FlowLayout());
        jf.add(l1);
        jf.add(tf1);
        jf.add(l2);
        jf.add(tf2);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.setVisible(true);

    }
}

public class Rcoem_303 {
    public static void main(String[] args) {
        new Rcoem_UI303();
    }
}
