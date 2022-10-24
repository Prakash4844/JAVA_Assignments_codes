//Basic Java Program
//Q9. Perimeter Of Equilateral Triangle

package Assignment3Ques;

import java.util.Scanner;

public class Q9_Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side a: ");
        double a = sc.nextDouble();
        System.out.print("Perimeter of Equilateral Triangle ≈ " + String.format("%.4f", 3*a));
    }
    
}