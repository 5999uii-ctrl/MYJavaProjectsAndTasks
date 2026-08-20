import java.util.Scanner;

public class TypeChecker {
    static void main() {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a character : ");
        char  character=s.next().charAt(0);

        if(Character.isLetter(character)){
            System.out.println( "ok letttr");
            if(character=='a'|| character=='e' || character=='i' || character=='o' || character=='u'){
                System.out.println(character+" "+"is vowel.");
            }else {
                System.out.println("the letter is constant");
            }
        }else {
            if(Character.isDigit(character));{
                System.out.println("Special digit and symol but not alowed ");
            }
        }
    }
}
