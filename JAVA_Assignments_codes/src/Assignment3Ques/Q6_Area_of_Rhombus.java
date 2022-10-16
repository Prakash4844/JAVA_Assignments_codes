// Basic Java Programs
// Q6. Area Of Rhombus Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q6_Area_of_Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the diagonal 1 & diagonal 2: ");
        double d1 = sc.nextDouble(), d2 = sc.nextDouble();
        double area = (d1 * d2) / 2;

        System.out.println("Area of Rhombus is: " + area);
    }
}
