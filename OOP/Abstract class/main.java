/**
 * main
 */
public class main {

    public static void main(String[] args) {
        faraz f = new faraz();
        f.call();;
        f.message();;
        f.music();
        f.videoCall();

        Iphones _6s = new Iphones();
        samsung _s4 = new samsung();

        show(_6s);
        show(_s4);

    }

    public static void show(phones obj)
    {
        obj.showConfig();
    }
}