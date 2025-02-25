package JavaPrograms.Recursion;

public class File9 {
    //calculate power of x,n using divide and conquer method
    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        int res = power(2,3);
        System.out.println(res);
    }
}
