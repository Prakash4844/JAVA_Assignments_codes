// Basic Java Programs
// Q8.Area Of Equilateral Triangle Java Program
package Assignment3Ques;

import java.util.Scanner;

public class Q7_Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * (side * side);

        System.out.println("Area of Equilateral Triangle is: " + String.format("%.4f",area) + " sq. units");
    }
}
