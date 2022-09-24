// Q4-Take 2 numbers as inputs and find their HCF and LCM.
package Assignment1Ques;

import java.util.Scanner;

public class Q4_LCM_and_HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 num: ");

        float num1  = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.println("1.To find their LCM Press '1' \n2.To find their HCF Press '2' \n3.To find both Press '3': ");
        byte choice = input.nextByte();

        while (choice != 1 && choice != 2 && choice !=3) {
            System.out.println("Invalid Choice");
            System.out.println("1.To find their LCM Press '1' \n2.To find their HCF Press '2' \n3.To find both Press '3': ");
            choice = input.nextByte();
        }

        if (choice == 1){
            System.out.println("LCM of Given no. is " + findLCM(num1, num2));

        } else if (choice == 2) {
            System.out.println("HCF of Given no. is " + findHCF(num1, num2));
        } else {
            float HCF = findHCF(num1, num2);
            System.out.println("HCF of Given no. is " + HCF);
            System.out.println("LCM of Given no. is " + (num1*num2/HCF));
        }
    }

    public static float findLCM(float num1, float num2){
        return num1*num2/(findHCF(num1, num2));
    }

    public static float findHCF(float num1, float num2) {
        float HCF = 0;
        float i = 0;
        float larger = Math.max(num1, num2);
        for (; i <= larger; i++)
        {
            if (num1 % i == 0 && num2 % i == 0) {
                HCF = i;
            }
        }
        return HCF;
    }
}
