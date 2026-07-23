package conditionalstatements;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a <10){
            System.out.println("single digit numbers");
        }
        else{
            System.out.println("double digit numbers");
        }
    }
}
