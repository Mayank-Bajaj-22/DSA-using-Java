package assignment_1;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Namaskar!, " + name);
    }
}
