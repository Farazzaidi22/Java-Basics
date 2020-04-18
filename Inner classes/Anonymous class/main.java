/**
 * main
 */
public class main {

    public static void main(String[] args) {
        

        phone obj = new phone(){

            public void show()
            {
                System.out.println("call, msg, music");
            }
        };

        obj.show();
    }
}