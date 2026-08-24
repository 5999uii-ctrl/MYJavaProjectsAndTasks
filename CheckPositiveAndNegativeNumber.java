import java.util.Scanner;

public class CheckPositiveAndNegativeNumber {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to check positive or negative");
        int number=s.nextInt();
        if(number>0){
            System.out.println("positive numbeer"+" "+number);

        }else if(number<0){
            System.out.println("Negative number"+" "+number);
        }
    }
}
