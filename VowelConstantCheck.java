import java.util.Scanner;

public class VowelConstantCheck {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter character to check vowel or constant");
        char check = s.next().charAt(0);


        if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
            System.out.println(check + " " + "vowel");
            if (Character.isUpperCase(check)) {
                System.out.println(" invalid ");


                }
            }  else{
        System.out.println("Constant");
        }
    }
    }

