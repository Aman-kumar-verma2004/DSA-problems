package JavaPrograms.Recursion;

public class File7 {
    static int fib(int n){
        if(n == 0){
            return 0;
        }if(n== 1){
            return 1;
        }
        int res = fib(n-1)+ fib(n-2);
        return res;
    }

    public static void main(String[] args) {
        int res = fib(8);
        System.out.println(res);
    }

}
