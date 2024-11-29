
package assignment_date;

import java.util.Scanner;


public class problem21 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond: ");
        int rows = scanner.nextInt();

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
