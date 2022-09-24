// Q5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package Assignment1Ques;

import java.util.Scanner;

public class Q5_Sum_till_Input_x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0f;
        while (true){
            System.out.println("Enter a number OR x|X to quit: ");
            String num = input.next();
            if(num.equals("x") || num.equals("X")){
                break;
            }
            Integer temp = Integer.valueOf(num);

            sum += temp;
        }
        System.out.println("Sum of Entered numbers is: "+ sum);
    }
}
