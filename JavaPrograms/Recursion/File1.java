package JavaPrograms.Recursion;
// A recursion function have 3 things:
//1) it should have a function call in the main method
//2) it should have a termination / base condition
//3) it should have a recursive call inside the recusion function

//lets write the code for finding n^k

public class File1{
    public static int findPower(int n, int k){
        //termination condition -> always written on the basis of the parameters
        if(k == 0) return 1;
        if(k % 2 == 0){
            int x = findPower(n,k/2);
            return x * x;
        }else{
            int x = findPower(n,k/2);
            return x * x * n;
        }
    }
    public static void main(String[] args){
        System.out.println( findPower(3,7));
    }
}