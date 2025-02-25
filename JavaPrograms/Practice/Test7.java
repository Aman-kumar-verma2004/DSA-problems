package JavaPrograms.Practice;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Customer details
        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter the account balance: ");
        int accountBalance = sc.nextInt();

        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter the loan type (Car/House/Business): ");
        String loanType = sc.next();

        System.out.print("Enter the expected loan amount: ");
        int expectedLoanAmount = sc.nextInt();

        System.out.print("Enter the expected number of EMIs: ");
        int expectedEMIs = sc.nextInt();

        // Validate account number (must be 4 digits and start with 1)
        if (accountNumber < 1000 || accountNumber > 9999 || String.valueOf(accountNumber).charAt(0) != '1') {
            System.out.println("Error: Invalid account number. It must be a 4-digit number starting with 1.");
            return;
        }

        // Validate account balance (minimum balance of $1000 required)
        if (accountBalance < 1000) {
            System.out.println("Error: Insufficient account balance. Minimum balance should be $1000.");
            return;
        }

        // Determine the eligible loan amount and number of EMIs based on salary and loan type
        int eligibleLoanAmount = 0;
        int maxEMIs = 0;

        if (salary > 75000 && loanType.equalsIgnoreCase("Business")) {
            eligibleLoanAmount = 7500000;
            maxEMIs = 84;
        } else if (salary > 50000 && loanType.equalsIgnoreCase("House")) {
            eligibleLoanAmount = 6000000;
            maxEMIs = 60;
        } else if (salary > 25000 && loanType.equalsIgnoreCase("Car")) {
            eligibleLoanAmount = 500000;
            maxEMIs = 36;
        } else {
            System.out.println("Error: Loan type or salary does not match any eligible criteria.");
            return;
        }

        // Check if the bank can provide the loan
        if (expectedLoanAmount <= eligibleLoanAmount && expectedEMIs <= maxEMIs) {
            // Display details if loan is provided
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Eligible Loan Amount: $" + eligibleLoanAmount);
            System.out.println("Requested Loan Amount: $" + expectedLoanAmount);
            System.out.println("Eligible Number of EMIs: " + maxEMIs);
            System.out.println("Requested Number of EMIs: " + expectedEMIs);
        } else {
            // Display message if loan cannot be provided
            System.out.println("Sorry, the bank cannot provide the loan based on your request.");
        }
    }
}
