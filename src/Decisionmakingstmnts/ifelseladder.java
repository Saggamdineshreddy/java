package Decisionmakingstmnts;
import java.util.Scanner;
public class ifelseladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=sc.nextInt();

        if(marks>90){
            System.out.println("A+");
        }
        else if(marks>80){
            System.out.println("A");
        }
        else if(marks>70){
            System.out.println("B+");
        }
        else if(marks>60){
            System.out.println("B");
        }
        else if(marks>50){
            System.out.println("C+");
        }
        else if(marks>40){
            System.out.println("C");
        }
        else if(marks>30){
            System.out.println("D");
        }
        else{
            System.out.println("Fail"+"  go study waste fellow");
        }
    }
}
