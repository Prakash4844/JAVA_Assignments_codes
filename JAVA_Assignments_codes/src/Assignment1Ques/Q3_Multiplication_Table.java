// Q3-Take a number as an input and print the multiplication table for it.
package Assignment1Ques;

import java.util.Scanner;

public class Q3_Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. to print it's multiplication table: ");
        int num = input.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(num +" x "+ i +" = "+ (num*i));
        }
    }
}
