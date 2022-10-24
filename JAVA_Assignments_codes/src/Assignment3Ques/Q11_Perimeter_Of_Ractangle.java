//Basic Java Program
//Q11. Perimeter Of Ractangle

package Assignment3Ques;

import java.util.Scanner;

public class Q11_Perimeter_Of_Ractangle {
    public static void main(String[] args){   
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        double length = Sc.nextDouble();
        double width = Sc.nextDouble();
        System.out.print("Perimeter of Ractangle ≈ " + String.format("%.4f", 2*(length+width)));
    }
}
