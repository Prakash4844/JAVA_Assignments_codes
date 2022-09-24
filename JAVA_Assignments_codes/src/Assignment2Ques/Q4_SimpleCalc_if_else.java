//Q.4Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package Assignment2Ques;

import java.util.Scanner;

public class Q4_SimpleCalc_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int result = 0;
        System.out.println("Enter operator (+, -, *, /): ");

        char operator = input.next().charAt(0);
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else {
            System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }
}

