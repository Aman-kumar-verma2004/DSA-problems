
package JavaPrograms.Practice;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of $5 and $1 notes and the amount to be paid
        System.out.print("Enter the number of $5 notes: ");
        int x = sc.nextInt();

        System.out.print("Enter the number of $1 notes: ");
        int y = sc.nextInt();

        System.out.print("Enter the amount to be paid: ");
        int z = sc.nextInt();

        // Maximum value you can pay using $5 notes
        int maxFiveNoteAmount = 5 * x;

        // Find the maximum possible number of $5 notes to use
        int fiveNotesUsed = Math.min(z / 5, x);

        // Remaining amount to be paid after using $5 notes
        int remainingAmount = z - fiveNotesUsed * 5;

        // Check if the remaining amount can be paid using $1 notes
        if (remainingAmount <= y) {
            // Output: Number of $5 and $1 notes used
            System.out.println("Number of $5 notes used: " + fiveNotesUsed);
            System.out.println("Number of $1 notes used: " + remainingAmount);
        } else {
            // If exact change cannot be provided, print -1
            System.out.println(-1);
        }
    }
}
