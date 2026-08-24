import java.util.Scanner;

public class EvenOddChecker {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
        int numbercheck=s.nextInt();
         if (numbercheck%2==0){
             System.out.println("Even");

         }else {
             System.out.println("Odd");
         }
    }
}
