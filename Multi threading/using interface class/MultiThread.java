/**
 * MultiThread
 */
public class MultiThread {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.start();

        B obj1 = new B();
        Thread t = new Thread(obj1);
        t.start();
    }
}