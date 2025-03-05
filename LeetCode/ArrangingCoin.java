package LeetCode;
import java.util.*;

public class ArrangingCoin {
    public static int arrangeCoins(int n) {
         
        long start = 1;
        long end = n;
        long ans = 0;
        long mid = 0;
        
        while(start <= end) {
            mid = start + (end-start)/2;
            
            long coinCount = (mid*(mid+1))/2;
                
                if(coinCount <= n){
                    ans = mid;
                    start = mid+1;
                } else {
                    end = mid-1;
                }
        }
return (int)ans;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }
    
}
