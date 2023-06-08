package multihilos;

import java.util.concurrent.ForkJoinTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploThreadMinimo {
    public int x = 0;
    
    public void run(){
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        
        hilo1.exec();
        
        System.out.println("===== Fin de main() =====");
    }
    
    public static void main(String args[]){
        EjemploThreadMinimo main = new EjemploThreadMinimo();
        main.run();
    }
    
    class Hilo1 extends ForkJoinTask {    

        public void run(){
            System.out.println("Inicio Hilo1");
            System.out.println("x="+x);
            for(int i=0;i<10;i++){
                System.out.println("Hilo1 "+i);
                try {
                    x=i;                
                    Thread.sleep(1000);
                    if (x>6) break;                      
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
                }
                              
            }
            System.out.println("Fin Hilo1");
        }

        @Override
        public Object getRawResult() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        protected void setRawResult(Object value) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        protected boolean exec() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    class Hilo2 extends Thread {    
        @Override
        public void run(){
            System.out.println("Inicio Hilo2");
            System.out.println("x="+x);
            for(int i=0;i<10;i++){
                System.out.println("Hilo2 "+i);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
                }
                x=i; 
            }
            System.out.println("Fin Hilo2");
        }
    }        
}
