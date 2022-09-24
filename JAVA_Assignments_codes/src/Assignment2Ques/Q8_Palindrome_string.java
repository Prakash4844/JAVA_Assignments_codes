//8.To find out whether the given String is Palindrome or not.
package Assignment2Ques;

import java.util.Scanner;

public class Q8_Palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check whether it is palindrome or not: ");
        String str = sc.next();
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        if (str.equals(rev.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
