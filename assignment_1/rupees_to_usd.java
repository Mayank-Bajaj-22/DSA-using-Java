package assignment_1;

import java.util.Scanner;

// Input currency in rupees and output in USD.

public class rupees_to_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rupees : ");
        int rupees = input.nextInt();
        float result = (float)(rupees * 0.012);
        System.out.println(rupees + " Rupees contain " + result + "USD");
    }
}