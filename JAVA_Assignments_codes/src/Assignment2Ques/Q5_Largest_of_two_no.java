//Q5. Take 2 numbers as input and print the largest number.
package Assignment2Ques;

import java.util.Scanner;

public class Q5_Largest_of_two_no {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.println("Larger no is: "+Math.max(num1,num2));
    }
}
