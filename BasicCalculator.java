import java.util.Scanner;

public class BasicCalculator {
    static void main() {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter first number:");

        int  numb1=s.nextInt();



        System.out.println("Enter operator  +  -  x  /");
        String op=s.next ();

        System.out.println("Enter second number :");

        int numb2=s.nextInt();

        switch (op){
            case "+":
                System.out.println("Ressult"+": "+(numb1+numb2));
                break;

            case "-":
                System.out.println("Result"+": "+(numb1-numb2));

                break;

            case "X":
                System.out.println("Result"+": "+(numb1*numb2));

                break;

            case "/":
                System.out.println("Result"+": "+(numb1/numb2));
                if(numb2==0){
                    System.out.println("cannot devide");
                    break;
                }
            default:
                System.out.println("invalid operator");

        }




    }
}


