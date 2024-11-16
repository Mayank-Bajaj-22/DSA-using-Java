package assignment_1;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
// 0 1 1 2 3 5 8 13

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = input.nextInt();
        if(n < 2){
            System.out.println("Number of terms should be at least 2.");
        }
        else{
            int a = 0, b = 1; // a and b are first 2 number
            System.out.print("Fibonacci Series : " + a + ","+ b);
            for(int i = 1; i <= n; i++){
                int next = a + b;
                System.out.print("," + next);
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}