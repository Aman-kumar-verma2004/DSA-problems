package JavaPrograms.Assignment2;

import java.util.Scanner;

public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int n_Square = n * n;
        System.out.println("Square of "+ n + " is :"+ n_Square);
        int rem = 0;
        while(n > 0){
            int lastNum = n % 10;
            rem = rem * 10 + lastNum;
            n /= 10;
        }

        int rem_Square = rem * rem;
        System.out.println("Square of "+ rem + " is :"+rem_Square);
        int res = 0;
         while( rem_Square > 0){
             int lastDigit = rem_Square % 10;
             res = res * 10 + lastDigit;
             rem_Square /= 10;
         }

         if(n_Square == res){
             System.out.println(temp+" is an Adam Number");
         }else{
             System.out.println(temp + " is not an Adam Number");
         }

    }
}