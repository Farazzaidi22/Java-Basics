import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        int i,j,k = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 8;

        try{
            j = Integer.parseInt(br.readLine());
            k = i / j;

        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0 " + e);
        }

        catch(IOException io)
        {
            System.out.println("Enter a valid number" + io);
        }

        System.out.println(k);


    }
}