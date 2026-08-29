import java.util.Scanner;

public class CinemaTicketingSystem {
    static void main() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = s.nextInt();

        System.out.println(" 1 enter karein agar Weekday (Monday to Thursday) hai, aur 2 enter karein agar Weekend (Friday to Sunday) hai");
        int daychose = s.nextInt();

        System.out.println(" 1 enter karein Morning show ke liye, aur 2 enter karein Evening/Night show ke liye.");
        int showtiming = s.nextInt();

        System.out.println(" 1 enter karein VIP Member ke liye, 2 enter karein Regular Member ke liye, aur 3 enter karein Agar koi membership nahi hai (Non-Member).");
        int membershiptypecheck = s.nextInt();


        double bascedticketprice = 1000.0;
       double agediscount=0;
        System.out.println("standard amount " + " " + (bascedticketprice));
        double dicountamountfnalafter=0;
     double morningdis=0;





        if (age < 12) {

           agediscount = (bascedticketprice * 0.30);
            System.out.println(agediscount);


        } else if (age >= 60) {

          agediscount= (+(bascedticketprice * 0.40));





        } else {
            System.out.println("standard price apply no dicount  ");
        }

        if (daychose == 2) {
           dicountamountfnalafter = (bascedticketprice + 200);



        } else if (daychose==1){
            System.out.println("no subcharges real amount " + " " + (bascedticketprice));


        }
        if (showtiming == 1) {
            morningdis = (bascedticketprice - 150);



        }
            


        double membershipdiscount=0.0;


       if(membershiptypecheck==1){

         membershipdiscount=bascedticketprice*0.15;









       } else if (membershiptypecheck==2) {
           membershipdiscount=bascedticketprice*0.8;


           
       }else if(membershiptypecheck==3){
           System.out.println("No discount total amount is "+" "+(bascedticketprice));
       }

        System.out.println("--- CINEMA TICKET BILL SUMMARY ---");
        System.out.println("Bunyadi Qeemat"+" "+(1000));

        System.out.println("age discount "+" "+(agediscount));
        System.out.println("Weekend sybcharges"+" "+(dicountamountfnalafter));
        System.out.println("week day no subcharges"+" "+(bascedticketprice));
        System.out.println("Morning discount"+" "+(morningdis));
        System.out.println("Vip memship discount"+" "+(membershipdiscount));
        System.out.println("Finalamount is "+" "+(1000-agediscount+bascedticketprice+morningdis+membershipdiscount));


    }
}
