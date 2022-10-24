//Basic Java Program
//Q12. Perimeter Of Square

package Assignment3Ques;

import java.util.Scanner;

public class Q12_Perimeter_Of_Square {
    public static void main(String[] args){   
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double side = Sc.nextDouble();
        System.out.print("Perimeter of Square ≈ " + String.format("%.4f", 4*(side)));
    }
}
