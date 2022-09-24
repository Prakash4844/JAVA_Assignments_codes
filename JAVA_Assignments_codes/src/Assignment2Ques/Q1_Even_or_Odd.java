//Q1- 1.Write a program to print whether a number is even or odd, also take input from the user.

package Assignment2Ques;

import java.util.Scanner;

public class Q1_Even_or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The given no. "+ num +" is "+ result);
    }
}
