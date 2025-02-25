


package JavaPrograms.Practice;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // If the numbers are the same, display the sum
        // If the numbers are different, display double the sum
        if (num1 == num2) {
            System.out.println("The numbers are the same. The sum is: " + sum);
        } else {
            System.out.println("The numbers are different. Double of the sum is: " + (2 * sum));
        }
    }
}
