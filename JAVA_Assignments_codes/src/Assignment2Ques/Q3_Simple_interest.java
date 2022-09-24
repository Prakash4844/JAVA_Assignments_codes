//Q3. 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package Assignment2Ques;

import java.util.Scanner;

public class Q3_Simple_interest {
    public static void main(String[] args) {
        System.out.println("Enter principal(Rupees), time(years), and rate(%/Year): (separated by Enter/space)");
        Scanner input = new Scanner(System.in);
        float principal = input.nextFloat();
        float time = input.nextFloat();
        float rate = input.nextFloat();

        System.out.println("The Interest: "+ principal +" X "
                + (rate/100) + " X " + time + " = "+ principal*(rate/100)*time);
    }
}
