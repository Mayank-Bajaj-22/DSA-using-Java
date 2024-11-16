package assignment_1;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        }
        else if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        }
        else {
            System.out.println("Both the number are equal");
        }
    }
}
