
package assignment_date;

import java.util.Scanner;

public class problem_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = sum / 5.0;
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
}

    

