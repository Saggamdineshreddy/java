import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println("LinkedList: " + ll);

        ll.addFirst(5);
        ll.addLast(60);
        System.out.println("After addFirst & addLast: " + ll);

        System.out.println("First: "     + ll.getFirst());
        System.out.println("Last: "      + ll.getLast());
        System.out.println("Index 2: "   + ll.get(2));

        ll.set(1, 99);
        System.out.println("After set index 1: " + ll);


        ll.removeFirst();
        ll.removeLast();
        ll.remove(Integer.valueOf(99));
        System.out.println("After removes: " + ll);


        System.out.println("Contains 30? " + ll.contains(30));
        System.out.println("Index of 30: " + ll.indexOf(30));
        System.out.println("Size: " + ll.size());



    }
}
