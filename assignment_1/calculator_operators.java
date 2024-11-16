package assignment_1;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class calculator_operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = input.nextDouble();
        System.out.print("Enter operator(+,-,*,/) : ");
        char operator = input.next().charAt(0);
        double result;
        if (operator == '+' ){
            result = num1 + num2;
            System.out.println("The sum is " + result);
        }
        if (operator == '-' ){
            result = num1 - num2;
            System.out.println("The subtraction is " + result);
        }
        if (operator == '*' ){
            result = num1 * num2;
            System.out.println("The multiplication is " + result);
        }
        if (operator == '/' ){
            result = num1 / num2;
            System.out.println("The division is " + result);
        }
    }
}
