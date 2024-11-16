package assignment_1;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
// basically means starting and ending words should be same continuous for 2nd and 2nd last
public class palindrome {
    public static void main (String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        int i = 0 , j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}