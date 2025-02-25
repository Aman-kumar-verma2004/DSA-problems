package JavaPrograms.Assignment2;

import java.util.Scanner;

public class PrimeAdamNumbers {


    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }


    public static boolean isPrimeAdam(int num) {
        if (isPrime(num)) {
            int reversedNum = reverseNumber(num);


            int numSquare = num * num;
            int reversedSquare = (reversedNum) * (reversedNum);

            int reverseOfNumSquare = reverseNumber(reversedSquare);

            if(reverseOfNumSquare == numSquare){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (m >= n || m <= 0 || n <= 0) {
            System.out.println("Invalid input. Ensure that 0 < m < n.");
            return;
        }

        int count = 0;
        StringBuilder primeAdamNumbers = new StringBuilder();

        // to find Prime-Adam Numbers
        for (int i = m; i <= n; i++) {
            if (isPrimeAdam(i)) {
                primeAdamNumbers.append(i).append(" ");
                count++;
            }
        }

        //output
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        if (count == 0) {
            System.out.println("NIL");
        } else {
            System.out.println(primeAdamNumbers.toString().trim());
        }
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);

    }
}

