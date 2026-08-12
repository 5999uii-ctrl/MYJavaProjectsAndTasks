import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATMMachineLogic {
    public static void main(String[] args) {

        int balance=100;


        Scanner s=new Scanner(System.in);
        System.out.println("1: if you can add balance chose this one");

        System.out.println("2:if you can withdraw chose this one");


        int choase=s.nextInt();

        if(choase==1){
            System.out.println("enter your amount to deposite");
            int desposite=s.nextInt();
            balance+=desposite;
            System.out.println(desposite+""+"th balance is"+""+balance);

        } else if (choase==2) {
            System.out.println("enter your withdrawal amount");double withdrw=s.nextDouble();if(withdrw>balance){
                System.out.println("enter correct amount");
            }else if(balance>withdrw){
                balance-=withdrw;
                System.out.println(withdrw+"the balance is"+""+balance);
            }
            }

        }

    }
