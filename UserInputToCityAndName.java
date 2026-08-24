import java.util.Scanner;

public class UserInputToCityAndName {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String nameinput=scanner.nextLine();

        System.out.println("Enter your city name");
        String citynameinput=scanner.nextLine();

        System.out.println("Welcome to "+" "+citynameinput+"  Mr."+""+nameinput);
    }
}

