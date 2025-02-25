
package JavaPrograms.Practice;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Three positive integers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Variable to store the product
        int product = 1;

        // If-else conditions to calculate the product based on the presence of 7
        if (num1 == 7) {
            // If 7 is the first number, consider only num2 and num3
            product = num2 * num3;
        } else if (num2 == 7) {
            // If 7 is the second number, consider only num3
            product = num3;
        } else if (num3 == 7) {
            // If 7 is the last number, display -1
            product = -1;
        } else {
            // If no 7 is present, calculate the product of all three numbers
            product = num1 * num2 * num3;
        }

        // Output the result
        System.out.println("The result is: " + product);
    }
}
