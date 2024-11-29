
package assignment_date;

import java.util.Scanner;


public class problem_19 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // সঠিক অবস্থানে সংখ্যা রাখার জন্য স্পেস প্রিন্ট করা
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // সংখ্যা প্রিন্ট করা
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


