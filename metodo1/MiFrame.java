package metodo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame{
    JButton button;
    MiFrame(){
     this.setSize( 640, 480 );
     button = new JButton("cerrar");
     
     MiListener Listener = new MiListener();
     button.addActionListener(Listener);
    this.add(button);
    }
        public static void main (String [] args ){
            MiFrame frame = new MiFrame ();
             
            frame.setVisible(true);
        }
    }

