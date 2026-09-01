import java.util.Scanner;

public class MenuDrivenCalculatorATMSimulationAurUnitConverter {

    static void main() {
        Scanner s = new Scanner(System.in);

        boolean isrunning = true;
        double blanace = 0;

        while (isrunning) {
            System.out.println("1.Calculator");
            System.out.println("2.Unitconverter");
            System.out.println("3.ATM simulation");
            System.out.println("4.Exit");

            int choice1 = s.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Enter number one ");
                    int num1 = s.nextInt();
                    System.out.println("Enter operators(+, -, *, /)    ");
                    char op = s.next().charAt(0);
                    System.out.println("Enter number two");
                    int num2 = s.nextInt();

                    switch (op) {
                        case '+' : System.out.println("The total sum is " + " " + (num1 + num2));
                        break;
                        case '-' : System.out.println("The total subtraction is " + " " + (num1
                                - num2));
                        break;
                        case '*' : System.out.println("The total multiplication is " + " " + (num1 * num2));
                        break;
                        case '/' : System.out.println("The total division is " + " " + (num1 / num2));
                        break;


                    }
                case 2:
                    System.out.println("Enter value to convert miles  but the valuse puts on kilometers");
                    int kilometers = s.nextInt();


                    System.out.println("The total miles is " + " " + (kilometers * (0.621371)));
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("     ATM / BANK ACCOUNT MENU ");
                    System.out.println("=================================\n");
                    System.out.println("1.current balance check kare");

                    System.out.println("2.paisa deposite kare");

                    System.out.println("3.paisa withdraw kare");


                    System.out.println("4.exit kare");

                    int choice = s.nextInt();


                    if (choice == 1) {
                        System.out.println("the current balance is " + " " + (blanace));


                    } else if (choice == 2) {
                        System.out.println("Enter money ");
                        double addmoney = s.nextDouble();

                        blanace += addmoney;
                        System.out.println("your balance" + " " + (blanace));

                    } else if (choice == 3) {
                        System.out.println("Enter money to withdraw");
                        double withamount = s.nextDouble();
                        if (withamount >= blanace) {
                            blanace -= withamount;

                            System.out.println("your balance" + " " + (blanace));
                        } else {
                            System.out.println("the balance is not enough");


                        }



                    }
                case 4:
                    System.out.println("you are a exit");
                    isrunning=false;



            }
        }
    }
}