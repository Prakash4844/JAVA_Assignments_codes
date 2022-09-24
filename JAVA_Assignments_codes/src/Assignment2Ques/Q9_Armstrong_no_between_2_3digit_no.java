//Q9.To find Armstrong Number between two given number.
package Assignment2Ques;

import java.util.Scanner;

public class Q9_Armstrong_no_between_2_3digit_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range(>0): ");
        int num1 = sc.nextInt();
        System.out.print("Enter the upper range(<999): ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, 3);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
