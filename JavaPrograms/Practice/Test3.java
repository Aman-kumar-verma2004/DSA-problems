package JavaPrograms.Practice;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements in the sequence
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // First term of the sequence
        int term = 1;

        // Loop to generate the sequence
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");

            // Update the next term based on the geometric progression rule
            if (i < n) {
                term *= 2;  // multiply by 2 to get the next term
            } else {
                System.out.println();
            }
        }
    }
}
