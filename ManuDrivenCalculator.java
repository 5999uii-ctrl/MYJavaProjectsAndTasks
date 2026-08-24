import java.util.Scanner;

public class ManuDrivenCalculator {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("========Menu=======");
        System.out.println("===Enter only number to select your choice ====");
        System.out.println("1:Addition");
        System.out.println("2:Subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        String menu=s.nextLine();

        System.out.println("====OK you are chose your choice go enter your numbers=====");
        System.out.println("Enter number one ");
        int num1=s.nextInt();
        System.out.println("Enter number two");
        int num2=s.nextInt();

        switch(menu) {
            case "1":
                System.out.println("(chose Addition) The total sum is "+" "+(num1+num2));
                break;
            case "2":
                System.out.println("(chose Subtraction) The total subtraction result is"+" "+(num1-num2));
                break;
            case "3":
                System.out.println("(chose Multiplication) The total multiplication result is "+" "+(num1*num2));
                break;
            case "4":
                System.out.println("(chose Division) The Divisio Result is "+" "+(num1/num2));
                if(num2==0){
                    System.out.println("the calculation is an uncomplete");
                }
            default:
                System.out.println("Invalid Choice");
        }


    }
}
