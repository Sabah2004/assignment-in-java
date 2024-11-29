
package assignment_date;

import java.util.Scanner;


public class problem21 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond: ");
        int rows = scanner.nextInt();

       
        for (int i = 1; i <= rows; i++) {
         
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
        for (int i = rows - 1; i >= 1; i--) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
