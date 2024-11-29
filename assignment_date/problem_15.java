
package assignment_date;

import java.util.Scanner;

public class problem_15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i - 1); // প্রতিটি বিজোড় সংখ্যা যোগ করা হচ্ছে
        }
        System.out.println("Sum of odd numbers is " + sum);
    }


}
