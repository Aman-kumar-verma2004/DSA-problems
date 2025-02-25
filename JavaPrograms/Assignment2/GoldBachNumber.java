package JavaPrograms.Assignment2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class GoldBachNumber{
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        //A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("Enter the number n : ");
//        int n = sc.nextInt();
//        if(n % 2 == 0 && n > 9 && n < 50){
//            for (int i = 2; i <= n; i++) {
//                if (isPrime(i)) {
//                   list.add(i);
//                }
//            }
//        }
//
//        for(int i=0; i< list.size(); i++ ){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//    }
//}

import java.util.Scanner;

public class GoldBachNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an even number N
        System.out.print("Enter an number N (where N > 9 and N < 50): ");
        int N = scanner.nextInt();

        // Validate the input
        if (N <= 9 || N >= 50 ) {
            System.out.println("Invalid input! Please enter an even number greater than 9 and less than 50.");
            return;
        }
        if(N % 2 != 0){
            System.out.println("Invalid Input. Number is odd");
            return;
        }

        System.out.println("Odd prime pairs whose sum equals " + N + " are:");

        // Iterate over all odd numbers less than N to find prime pairs
        for (int i = 3; i <= N / 2; i += 2) {
            int j = N - i; // j is the complementary number
            if (isPrime(i) && isPrime(j)) {
                System.out.println(i + " + " + j + " = " + N);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
