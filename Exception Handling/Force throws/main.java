import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * main
 */
public class main {

    public static void main(String[] args) throws IOException
    {
        
        int i,j,k=0;
        i=8;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        j = Integer.parseInt( br.readLine() );
        k = i + j;
        if( k < 10){
            throw new ArithmeticException();
        }
    }
}