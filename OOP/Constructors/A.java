/**
 * A
 */
public class A {

    int a;
    float b;

    public A(int a_, float b_){
        a= a_;
        b= b_;

    }

    public static void main(String[] args) {
        
        A obj = new A(2,3);
        System.out.print(obj.a);
        System.out.print("\n");
        System.out.print(obj.b);
    }
}