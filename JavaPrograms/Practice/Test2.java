package JavaPrograms.Practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Variable to store factorial
        long factorial = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
