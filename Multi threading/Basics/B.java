import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * B
 */
public class B extends Thread {

    public void show()
    {
        for(int i =0; i < 5; i++)
        {
            System.out.println("hello");
        }

        try {
            Thread.sleep(100);
        } 
        
        catch (Exception e) {
            //TODO: handle exception
            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void run()
    {
        show();
    }
}