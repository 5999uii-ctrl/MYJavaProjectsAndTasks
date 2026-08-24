import java.util.Scanner;

public class ThreeIntegerCheck {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=s.nextInt();
        System.out.println("Enter number 2");
        int num2=s.nextInt();
        System.out.println("Enter number 3");
        int num3=s.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("the large number is "+" "+num1);


        }else if(num2>=num1 && num2>=num3){
            System.out.println("The large number is "+" "+num2);
        } else if (num3>=num1 && num3>=num2) {
            System.out.println("The large number is "+" "+num3);

        }
    }
}
