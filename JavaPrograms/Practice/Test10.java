
package JavaPrograms.Practice;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a multiple of 3, 5, or both
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Zoom");
        } else if (number % 3 == 0) {
            System.out.println("Zip");
        } else if (number % 5 == 0) {
            System.out.println("Zap");
        } else {
            System.out.println("Invalid");
        }
    }
}
