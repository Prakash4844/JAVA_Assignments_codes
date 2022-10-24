// Basic Java Programs
// Q8. 8. Perimeter Of Circle Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q8_Perimeter_Of_Circle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.print("The perimeter of Circle is ≈ " + String.format("%.4f",perimeter)); 
    }
}