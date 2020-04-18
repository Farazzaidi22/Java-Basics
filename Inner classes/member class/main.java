/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        A obj = new A();

        A.B obj1 =  obj.new B();
        obj1.j = 5;

        System.out.println(obj1.j);
    }
}