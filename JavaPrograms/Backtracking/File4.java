package JavaPrograms.Backtracking;

public class File4{
    public static int GridWays(int i, int j, int n , int m){//n-> row && m -> col
        //termination condition
        if(i == n-1 && j == m-1){//because we are at the end of the grid.
            return 1;
        }
        //edge condition
        if(i == n || j == n){
            return 0;
        }
        int w1 = GridWays(i+1, j, n, m);
        int w2 = GridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args){
        int n = 3;
        int m = 3;
        System.out.println(GridWays(0,0,n,m));
    }
}