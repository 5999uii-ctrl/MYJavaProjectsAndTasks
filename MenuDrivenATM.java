import java.util.Scanner;

public class MenuDrivenATM {

    static void main() {
        double blanace =2000.0;
        boolean isruning =true;
        Scanner s=new Scanner(System.in);

        while (isruning) {
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
                }else{
                        System.out.println("the balance is not enough");


                } }else if (choice == 4) {
                    System.out.println("you are a exit");
                    break;





                }


            }

        }
    }

