//Q10.Check if a gien no. is prime no.
package Assignment2Ques;

import java.util.Scanner;

public class Q10_primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int isPrime = sc.nextInt();
        int i = 2;
        String primeOrNot = "";
        if (isPrime <= 1) {
            System.out.print(
                    "The Given number is not a prime.\n Explaination: \n primes are integers greater than one with no positive divisors besides one and itself. \n Negative numbers are excluded.");
        } else if (isPrime == 2 || isPrime == 3) {
            System.out.print("The Given number is prime.");
        } else if (isPrime > 2) {
            while (i*i <= isPrime) {
                if (isPrime % i == 0){
                    primeOrNot = "The Given number is not prime.";
                    break;
                } else {
                    primeOrNot = "The Given number is prime.";
                }
                i++;
            }
        } else {
            System.out.print("Invalid Input");
        }
        System.out.print(primeOrNot);
    }
}

// The time complexity of this code is Big O of sqrt(n) because we need not check a number's factor twice such as 
// M x N = P and N x M = P because we are checking if isprime is less then Square(i) which reduce the checks by as sqrt(isprime)