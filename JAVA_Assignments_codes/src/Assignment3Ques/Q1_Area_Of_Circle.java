// Basic Java Programs
// Q1. Area Of Circle Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q1_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.print("Area of Circle is: " + String.format("%.5f", area) + " sq. units");
    }
}