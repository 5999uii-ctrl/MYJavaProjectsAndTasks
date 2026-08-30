
import java.util.Scanner;

public class Calculator {

    static void main() {
        Scanner scanner = new Scanner(System.in);


        boolean isRunnsing = true;

        while (isRunnsing) {

            System.out.println("------------Calculator---------\n");
            System.out.println("1:Calculation ");
            System.out.println("2:Exit");

            int c = scanner.nextInt();

            switch (c) {


                case 1:

                    System.out.println("Enter number one ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter Operator");
                    System.out.println("+(ADDITION");
                    System.out.println("-(SUBTRACTION)");
                    System.out.println("*(MULTIPLICATION)");
                    System.out.println("/(DEVISION)");

                    char op = scanner.next().charAt(0);

                    System.out.println("Enter number two");
                    double num2 = scanner.nextDouble();


                    switch (op) {
                        case '+':
                            System.out.println("The total sum is " + " " + (num1 + num2));
                            break;
                        case '-':
                            System.out.println("The total subtraction is " + " " + (num1 - num2));
                            break;
                        case '*':
                            System.out.println("The total multiplication is " + " " + (num1 + num2));
                            break;
                        case '/':
                            System.out.println("The total devision is " + " " + (num1 / num2));
                            break;
                        default:
                            System.out.println("Enter invalid number ");
                            isRunnsing=true;
                            break;


                    }
                    break;
                case 2:
                    System.out.println("e");
                    isRunnsing=false;




            }

            System.out.println("program terminated");

        } ;

}
    }
























