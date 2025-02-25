package JavaPrograms.Recursion;

public class File2 {
     static void fib(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        fib(n-1);
    }
    public static void main(String[] args) {
        fib(5);
    }
}
