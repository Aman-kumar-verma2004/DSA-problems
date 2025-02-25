package JavaPrograms.Assignment2;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        //finding Factors
        int sum = 0; //calculating sum of all the factors;
        System.out.println("Factors are :");
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Sum of factors :"+sum);

        if(sum > num){
            System.out.println(num + " is an Abundant Number");
        }else{
            System.out.println(num + " is not an Abundant number");
        }
    }
}