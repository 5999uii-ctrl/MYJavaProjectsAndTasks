import java.util.Scanner;
public class UnitConverter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("1:Meter to Centimeter, 2:Centimemeter to Meter,3:Kilogram to Gram,4:Gram to kilogram,5:Celsius to Fahrenheit  [select only numbers. and enter value but enter  like   1 enter your value  [ 1 : value] ");
        int input = s.nextInt();
        System.out.println("Enter your value and enter convertion valuse numbers");
        int value = s.nextInt();
        double m = value;


        switch (input) {

            case 1:

                System.out.println(m * 100);
                break;

            case 2:


                System.out.println(m/100);
                break;



            case 3:

                    System.out.println(m * 1000);
                break;
            case 4:

                    System.out.println(m / 1000);

                break;
            case 5:

                    System.out.println((m * 9 / 5) + 32);

                break;
            default:
                System.out.println("this num does't exist");
                break;
        }

    }

}












