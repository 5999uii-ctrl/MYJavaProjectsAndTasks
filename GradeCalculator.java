import java.util.Scanner;

public class GradeCalculator {
    static void main() {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter tour marks (o-100)");
        int marks=s.nextInt();

        if (marks>=90){
            System.out.println("A-Grade:"+" "+marks);

        } else if (marks>=80) {
            System.out.println("B-Grade:"+" "+marks);

        } else if (marks>=70) {
            System.out.println("C-Grade:"+" "+marks);

        } else if (marks>=60) {
            System.out.println("D-Grade:"+" "+marks);

        }else{
            System.out.println("Fail");
        }
    }
}
