package JavaPrograms.Assignment2;

import java.util.Scanner;

public class CapriconNumber {

    // Method to check if a number is a Kaprekar number
    public static boolean isKaprekar(int num) {
        if (num == 1) {
            return true; // 1 is a Kaprekar number
        }

        int square = num * num;
        String squareStr = String.valueOf(square);
        int len = squareStr.length();

        // Split the square into two parts
        String leftPart = squareStr.substring(0, len / 2); // Left half
        String rightPart = squareStr.substring(len / 2);    // Right half

        // Convert parts to integers (handling empty left part as 0)
        int left = (leftPart.isEmpty()) ? 0 : Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);

        // If sum of parts equals the original number, it's a Kaprekar number
        if((left + right) == num) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check and print if the number is a Kaprekar number
        if (isKaprekar(num)) {
            System.out.println(num + " is a Capricon Number");
        } else {
            System.out.println(num + " is not a Capricon Number");
        }

    }
}
