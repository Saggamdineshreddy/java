package strings;

public class demo {
    public static void main(String[] args) {
//         String name = new String("Dinesh");
//         name= name + "reddy";
//         System.out.println(name);
//        System.out.println(name.charAt(2));
//        System.out.println(name.toUpperCase());

        StringBuffer sb = new StringBuffer("Dinesh");
        System.out.println(sb.capacity());
        System.out.println(sb.append(" Reddy"));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
