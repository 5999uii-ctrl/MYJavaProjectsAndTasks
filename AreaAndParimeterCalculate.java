import java.util.Scanner;

public class AreaAndParimeterCalculate {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rectangle Length");
        Double lenght=s.nextDouble();

        System.out.println("Enter rectangle Wight ");
        double Wight=s.nextDouble();

        System.out.println("The total Area is "+" "+(lenght*Wight));
        System.out.println("The total perimeter is "+" "+(2*(lenght+Wight)));
    }
}
