/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.i = 5;
        obj.j = 6;
        
        //shallow copy
        A obj1 = obj;

        //deep copy
        A obj2 = new A();
        obj2.i = obj.i;
        obj2.j = obj.j;

        //cloning //methonds need to be defined
        //A obj3 = obj.clone();
    }
}