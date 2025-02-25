
package JavaPrograms.Practice;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Type of food
        System.out.print("Enter the type of food (V for Vegetarian, N for Non-Vegetarian): ");
        char foodType = sc.next().charAt(0);

        // Input: Number of plates
        System.out.print("Enter the number of plates: ");
        int quantity = sc.nextInt();

        // Input: Distance from restaurant (in kms)
        System.out.print("Enter the distance in kms: ");
        int distance = sc.nextInt();

        // Variables for cost per plate
        int costPerPlate = 0;

        // Validation checks
        if ((foodType != 'V' && foodType != 'N') || distance <= 0 || quantity < 1) {
            System.out.println("Invalid input. Bill amount: -1");
        } else {
            // Set cost per plate based on food type
            if (foodType == 'V') {
                costPerPlate = 12; // Vegetarian
            } else if (foodType == 'N') {
                costPerPlate = 15; // Non-Vegetarian
            }

            // Calculate the total cost of the food
            int totalFoodCost = costPerPlate * quantity;

            // Calculate delivery charges
            int deliveryCharges = 0;
            if (distance > 3 && distance <= 6) {
                deliveryCharges = 1 * (distance - 3);  // $1 per km for next 3km
            } else if (distance > 6) {
                deliveryCharges = (1 * 3) + (2 * (distance - 6));  // $1 for next 3km, $2 for remaining kms
            }

            // Calculate the final bill
            int finalBill = totalFoodCost + deliveryCharges;

            // Output the final bill amount
            System.out.println("The final bill amount is: $" + finalBill);
        }
    }
}
