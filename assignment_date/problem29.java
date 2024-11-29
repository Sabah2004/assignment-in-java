
package assignment_date;

import java.util.Scanner;


public class problem29 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

       
        if (number <= 0 || number >= 10000000000L) {
            System.out.println("Please enter a number less than ten billion.");
        } else {
           
            int digits = 0;

           
            while (number > 0) {
                number /= 10;  
                digits++;      
            }

           
            System.out.println("The number has " + digits + " digits.");
        }

    }
}
