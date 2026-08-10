import java.util.Scanner;

public class BWM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("(1:BMI Calculation");
        System.out.println("2:Water Intake Calculator");
        System.out.println("3: Daily Calorie Burn estimate");
        System.out.println("4:Ideal Body Weight");
        System.out.println("5:Maximum Heart Rate");
        System.out.println("enter your choice\n");


        int chose = s.nextInt();

        if (chose == 1) {
            System.out.println("enter you weight");
            int Weight = s.nextInt();
            System.out.println("enter your Height");
            double Height = s.nextDouble();
            System.out.println("Bmi is" + "" + (Weight / (Height * Height)));
        } else if (chose == 2) {
            System.out.println("enter your weight");
            int Weight2 = s.nextInt();
            System.out.println("water intake" + "" + (Weight2 * 0.033));

        } else if (chose == 3) {
            System.out.println("enter your age");
            int age = s.nextInt();
            System.out.println("enter your Weight");
            int Weight = s.nextInt();
            System.out.println("enter your hight");
            double Height = s.nextDouble();
            System.out.println("you burn daily calories" + "" + ((10 * Weight) + (6.25 * Height) - (5 * age) + 5));
        }


        else if (chose == 4) {
            System.out.println("enter your height");
            double Height = s.nextDouble();
            System.out.println("your idel body weight" + "" + (50 + 0.91 * (Height - 152.4)));

            System.out.println("enter valid number");
        } else if (chose == 5) {
            System.out.println("enter your Age");
            int age = s.nextInt();
            System.out.println("maz heart rate" + "" + (220 - age));
        }
    }
}

