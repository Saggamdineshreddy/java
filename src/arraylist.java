import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList A = new ArrayList();
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(99);
        A.add(40);
        A.add(50);

        System.out.println(A);

        System.out.println(A.remove(4));
        System.out.println(A.set(3,6));
        System.out.println(A);
        System.out.println(A.set(4,7));


        System.out.println(A.size());
        System.out.println(A.indexOf(0));
        System.out.println(A.lastIndexOf(20));

        System.out.println(A);
        System.out.println(A.indexOf("30"));

    }
}
