package metodo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiFrame extends JFrame implements ActionListener{
    JButton button;
    MiFrame(){
     this.setSize( 640, 480 );
     button = new JButton("Cerrar");
     
   
     button.addActionListener(this);
    this.add(button);
    }
        public static void main (String [] args ){
            MiFrame frame = new MiFrame ();
             
            frame.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }
    }
