
package assignment_date;
import java.util.Scanner;
public class problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();    
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();       
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1, root2;
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root = " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and different.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }


    }
}
