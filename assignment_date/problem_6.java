
package assignment_date;

import java.util.Scanner;

public class problem_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

  
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);

        if (intNum1 == intNum2) {
            System.out.println("Numbers are equal up to three decimal places");
        } else {
            System.out.println("Numbers are not equal");
        
    }
}

    
}
