/**
 * try_catch
 */
public class try_catch {

    public static void main(String[] args) {
        int i,j,k = 0;
        i = 8;
        j = 0;

        try{
            k = i / j;
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by 0 " + e);
        }
        
        System.out.println(k);


    }
}