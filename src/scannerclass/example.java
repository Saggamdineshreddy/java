package scannerclass;
import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER age");
        int age = sc.nextInt();
        System.out.println("ENTER name");
        String name=sc.next();
        System.out.println("ENTER gender");
        String gender=sc.next();

        if (age>18) {
            System.out.println("you are eligible for voting");
        }
        if(age<18){
            System.out.println("you are not eligible for voting");
        }
        else{
            System.out.println("enter correct age");
        }
    }
}
