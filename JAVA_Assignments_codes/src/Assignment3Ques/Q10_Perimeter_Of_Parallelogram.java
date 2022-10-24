//Basic Java Program
//Q10. Perimeter Of Parallelogram

package Assignment3Ques;

import java.util.Scanner;

public class Q10_Perimeter_Of_Parallelogram {
    public static void main(String[] args){   
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Base and Side: ");
        double base = Sc.nextDouble();
        double side = Sc.nextDouble();
        System.out.print("Perimeter of Parallelogram ≈ " + String.format("%.4f", 2*(base+side)));
    }
}
