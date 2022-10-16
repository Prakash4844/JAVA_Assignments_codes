// Basic Java Programs
// Q3. Area Of Rectangle Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q3_Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length*breadth;
        System.out.print("Area of Rectangle is: " + area + " sq. units");
    }
}
