package JavaPrograms.Recursion;

public class File4 {
    static int fib(int n){
        if(n == 0){
            return 0;
        }
      return fib( n/10) + n % 10;

    }

    public static void main(String[] args) {
        int sum = fib(10237);
        System.out.println(sum);

    }
}
