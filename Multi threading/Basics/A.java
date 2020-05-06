import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A
 */
public class A extends Thread {

    public void show()
    {
        for(int i =0; i < 5; i++)
        {
            System.out.println("hi");
        }
    }

    @Override
    public void run()
    {
        show();
    }
}