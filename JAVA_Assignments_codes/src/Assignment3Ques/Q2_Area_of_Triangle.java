// Basic Java Programs
// Q2. Area Of Triangle Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q2_Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and height of the triangle: ");

        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5*base*height;

        System.out.print("Area of Triangle is: " + String.format("%.5f", area) + " sq. units");
    }
}