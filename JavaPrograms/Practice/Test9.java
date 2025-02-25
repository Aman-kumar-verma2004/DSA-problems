
package JavaPrograms.Practice;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: day, month, and year
        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Number of days in each month (index 0 is a dummy to align months with indices)
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Adjust for leap year (February has 29 days in a leap year)
        if (isLeapYear) {
            daysInMonth[2] = 29;
        }

        // Increment the day
        day++;

        // Check if we need to move to the next month
        if (day > daysInMonth[month]) {
            day = 1; // Reset the day to 1
            month++; // Move to the next month

            // Check if we need to move to the next year
            if (month > 12) {
                month = 1; // Reset the month to January
                year++;    // Move to the next year
            }
        }

        // Output the next date
        System.out.println("Next Date: " + day + "-" + month + "-" + year);
    }
}
