// Basic Java Programs
// Q4. Area Of Isosceles Triangle Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q4_Area_of_Isosceles_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of Isosceles triangle is: " + area + " sq. units");
    }
}

