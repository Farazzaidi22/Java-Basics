/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        //one way
        abcImp obj = new abcImp();
        obj.show();

        //another way
        abc obj1 = new abc(){
        
            @Override
            public void show() {
                System.out.println("show1...");
            }
        };
        obj1.show();

        //another way lamba method
        //only works for interface with one method
        abc obj2 = ()->{
                System.out.println("show...");
            };
        obj2.show();

    }
}