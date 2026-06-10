package scannerclass;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        System.out.println(a);
        char b=sc.next().charAt(0);
        boolean c=sc.nextBoolean();
        long d=sc.nextLong();
        short e=sc.nextShort();
        byte f=sc.nextByte();
        double g=sc.nextDouble();
        float h=sc.nextFloat();
        String i=sc.next();
        String j=sc.nextLine();

        System.out.println(j);

    }
}
