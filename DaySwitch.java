import java.util.Scanner;

public class DaySwitch {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to check day :");
        int number=s.nextInt();
        switch (number){
            case 1-> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
