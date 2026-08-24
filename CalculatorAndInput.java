import java.util.Scanner;

public class CalculatorAndInput {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number one");
        int num1=s.nextInt();
        System.out.println("Enter number two");
        int num2=s.nextInt();

        System.out.println("The total sum is :"+" "+(num1+num2));
    }
}
