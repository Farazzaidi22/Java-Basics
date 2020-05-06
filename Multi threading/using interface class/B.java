import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * B
 */

 //runnable == thread 
public class B implements Runnable {

    public void show()
    {
        for(int i =0; i < 5; i++)
        {
            System.out.println("hello");
        }

        try {
            Thread.sleep(1000);
        } 
        
        catch (Exception e) {

            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void run()
    {
        show();
    }
}