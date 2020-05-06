import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * main
 */
public class main {

    public static void main(String[] args) throws IOException {
        
        int i,j,k = 0;
        
        BufferedReader br= null;
        i = 8;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
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
        finally{
            br.close();
            System.out.println("BYE");
        }

        System.out.println(k);


    }
}