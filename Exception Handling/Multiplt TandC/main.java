/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        int i,j,k = 0;
        int a[] = new int[4];
        i = 8;
        j = 2;

        try{
            k = i / j;

            for(int c =0 ; c<=4 ; c++)
            {
                a[c] = i + 1;
            }

            for(int value:a)
            {
                System.out.println(value);
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0 " + e);
        }

        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Trying to put more than arrays capacity " + b);
        }
        
        System.out.println(k);


    }
}