package JavaPrograms.Assignment2;

import java.util.Scanner;

public class StrontioNumber {

    // Method to check if the number is a Strontio number
    public static boolean isStrontio(int num) {
        if (num < 1000 || num > 9999) {
            System.out.println("The number must be a four-digit number.");
            return false;
        }

        // Multiply the number by 2
        int product = num * 2;

        // Extract the hundreds and tens place from the product
        int hundreds = (product / 100) % 10;
        int tens = (product / 10) % 10;

        // Check if the hundreds and tens place are the same
        return (hundreds == tens);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a four-digit number as input
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();

        // Check if the number is a Strontio number
        if (isStrontio(num)) {
            System.out.println(num + " is a Strontio Number");
        } else {
            System.out.println(num + " is not a Strontio Number");
        }


    }
}
