package assignment_1;

import java.util.Scanner;

// To find Armstrong Number between two given number.

public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start = input.nextInt();
        System.out.print("Enter the ending number : ");
        int end = input.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            int num = i;
            int arm = 0;
            int rem;

            // Find the number of digits means 153 it has 3 digit and 1345 it has 4 digit
            int n = 0;
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                n++;
            }

            // Calculate the sum of n-th powers of digits
            temp = num;
            while (temp != 0) {
                rem = temp % 10;
                arm += rem * rem * rem;
                temp /= 10;
            }

            // Check if the number is an Armstrong number
            if (arm == num) {
                System.out.println(num);
            }
        }
    }
}