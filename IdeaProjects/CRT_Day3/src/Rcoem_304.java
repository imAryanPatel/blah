
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rcoem_304 extends JFrame implements ActionListener{
    JFrame jf;
    JPanel pp;
    CardLayout cd;

    Rcoem_304(){
        jf = new JFrame("CardLayout Eample");
        cd = new CardLayout();

        //Creating a main parent panel that will
        //Contain 2 child panel
        pp = new JPanel();

        //Creating two child panels
        JPanel cp1 = new JPanel();
        JPanel cp2 = new JPanel();

        //Creating 2 parent buttons
        JButton b1 = new JButton("Numbers");
        JButton b2 = new JButton("Alphabets");

        //Creating 3 child buttons for parent(numbers) buttons
        JButton b3 = new JButton("1");
        JButton b4 = new JButton("2");
        JButton b5 = new JButton("3");

        //adding b4,b4 and b5 in buttons to cp1
        cp1.add(b3);
        cp1.add(b4);
        cp1.add(b5);

        //Creating 3 child buttons for parent(Alphabets) buttons
        JButton b6 = new JButton("a");
        JButton b7 = new JButton("b");
        JButton b8 = new JButton("c");
        JButton b9 = new JButton("d");

        //adding b4,b4 and b5 in buttons to cp1
        cp2.add(b6);
        cp2.add(b7);
        cp2.add(b8);
        cp2.add(b9);

        //Setting the positioning of the components in pp(that contains cp1 and cp2)
        pp.setLayout(cd);

        //adding the cp1 and cp2 to pp
        pp.add(cp1,"Numbers");
        pp.add(cp2,"Alphabets");

        b1.addActionListener(this);
        b2.addActionListener(this);

        //Setting container JFrame's layout to flow layout
        jf.setLayout(new FlowLayout());
        jf.add(b1);
        jf.add(b2);

        jf.add(pp);

        jf.setSize(300,200);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand() == "Numbers"){
            cd.show(pp,"Numbers");
        }
        else{
            cd.show(pp,"Alphabets");
        }



    }
    public static void main(String[] args) {
        new Rcoem_304();
    }
}
