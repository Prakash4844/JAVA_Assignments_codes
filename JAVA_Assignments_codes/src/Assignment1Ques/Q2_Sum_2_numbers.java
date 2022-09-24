// 2.Take two numbers and print the sum of both.
package Assignment1Ques;

import java.util.Scanner;

public class Q2_Sum_2_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.print("Sum of given numbers is: " + (num1 + num2));
    }
}
