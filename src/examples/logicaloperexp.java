package examples;

public class logicaloperexp {
    public static void main(String[] args) {
        int a=10;
        int b =20;
        int c=30;
        int d=40;

        boolean result = a>b && a>c ;
        System.out.println(result);

        boolean result1 = a<b || a<c ;
        System.out.println(result1);

    }
}
