package assignment_1;

import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Simple_Interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest : ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years interest : ");
        int time = input.nextInt(); // no . of months
        int simple_interest = (int)(principal * rate * time)/100;
        System.out.println(simple_interest);
    }
}