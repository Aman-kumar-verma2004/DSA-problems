package JavaPrograms.Recursion;

public class File6 {

    static int factorial(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static int calculateNCR(int n, int r){
        if( r> n){
            return 0;
        }
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n-r);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 6;
        int value = calculateNCR(n,r);
        System.out.println(value);
    }
}
