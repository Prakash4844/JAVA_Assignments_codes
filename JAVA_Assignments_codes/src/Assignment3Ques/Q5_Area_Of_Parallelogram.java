// Basic Java Programs
// Q5. Area Of Parallelogram Java Program

package Assignment3Ques;

import java.util.Scanner;

public class Q5_Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base & height of the parallelogram: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = base * height;
        System.out.println("Area of Parallelogram is: " + area + " sq. units");
    }
}
