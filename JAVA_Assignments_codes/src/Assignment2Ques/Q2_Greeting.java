//Q2. 2.Take name as input and print a greeting message for that particular name.

package Assignment2Ques;

import java.util.Scanner;

public class Q2_Greeting {
    public static void main(String[] args) {
        System.out.print("Enter your Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Good Morning, "+name+".");
    }
}
