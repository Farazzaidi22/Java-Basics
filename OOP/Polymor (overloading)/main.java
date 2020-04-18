/**
 * main
 */
public class main {

    public static void main(String[] args) {
     
        A obj = new A();
        A obj2 = new A(5);

        obj.show();
        obj.show(5);

        System.out.print(obj.b + "/n");
        System.out.print(obj2.b);

        obj2.show();
        obj2.show(6);
    }
    
    
}