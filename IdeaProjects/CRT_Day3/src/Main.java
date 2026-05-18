import java.awt.*;

class Rcoem_UI001 extends Frame {
    Rcoem_UI001() {

        Button b = new Button("Home");
        b.setBounds(30, 100, 80, 30);
        add(b);

        setSize(300, 300);
        setLayout(null);
        setTitle("My Window");
        setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new Rcoem_UI001();
    }
}
