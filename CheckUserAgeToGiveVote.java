import java.util.Scanner;

public class CheckUserAgeToGiveVote {
    static void main() {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter age ");
        int ageinput=s.nextInt();

        if(ageinput>=18){
            System.out.println("Aap vote de sakte hain.");

        }else {
            System.out.println("Aap abhi chote hain.");
        }
    }
}
