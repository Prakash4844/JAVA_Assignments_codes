//Q6.Input currency in rupees and output in USD.
package Assignment2Ques;

import java.util.Scanner;

public class Q6_$_to_Inr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR:");
        int rupee = input.nextInt();

        double result = rupee/81.1877;

        System.out.println(rupee+" is $"+ result);

    }

}
