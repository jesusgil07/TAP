package metodo4;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiFrame extends JFrame{
    JButton button;
    MiFrame(){
     this.setSize( 640, 480 );
     button = new JButton("Cerrar");
     
      button.addMouseListener(
      new MouseAdapter(){
    @Override 
    public void mouseClicked (MouseEvent e){
        System.out.println("X="+ e.getX() + "Y ="+ e.getY());
    }
      }
     
     );
    this.add(button);
    }
        public static void main (String [] args ){
            MiFrame frame = new MiFrame ();
             
            frame.setVisible(true);
        }
    }
