package conditionalstatements;
import java.util.Scanner;
public class ifelseladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = sc.nextInt();
        if(marks>100){
            System.out.println("Enter correct marks");
        }
        else if(marks>90 && marks<=100){
            System.out.println("A Grade");
        }
        else if(marks>80){
            System.out.println("B Grade");
        }
        else if(marks>70){
            System.out.println("C Grade");
        }
        else if(marks>60){
            System.out.println("D Grade");
        }
        else if(marks>50){
            System.out.println("E Grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
