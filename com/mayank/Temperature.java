package com.mayank;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit: " + fahrenheit);
    }
}
