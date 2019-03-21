package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JULIANO
 */
public class Thread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("ola");
        }
    }
    
}
