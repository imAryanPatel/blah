import java.awt.*;
import java.awt.event.*;

class Rcoem_UI002 extends Frame {
    Label l;
    Rcoem_UI002() {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                System.exit(0);

            }
        });
        l = new Label("Windows Closing Example.");
        this.add(l);
        setTitle("India");
        setSize(300,350);
        setVisible(true);

    }
}

        public class Rcoem {
    public static void main(String[] args) {
        new Rcoem_UI002();
    }
}
