import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int num) {
       
        if(num == 0) return 0;
        return 1+(num-1) % 9;
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = addDigits(num);
        System.out.println(res);
    }
}
