import java.util.*;
public class vectorlist {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(0,1);
        v1.add(1,2);
        v1.add(2,3);
        v1.add(3,4);
        v1.add(4,5);
        v1.add(5,6);

        System.out.println(v1.remove(4));
        System.out.println(v1.set(3,6));
        System.out.println(v1);
        System.out.println(v1.set(4,7));

        System.out.println(v1);

        System.out.println(v1.size());
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());

        System.out.println(v1);
        System.out.println(v1.indexOf("1"));

    }
}
