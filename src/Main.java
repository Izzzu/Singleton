/**
 * Created by izabela on 07/10/2017.
 */
public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1==s2);
    }

}
