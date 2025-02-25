package JavaPrograms.Backtracking;

public class File3 {
    public static boolean isSafe(char board[][], int row, int col){
        //vertically up
        for(int i = row-1 ; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonally left
        for(int i = row-1,j = col -1; i>=0 &&  j >=0; i--, j--){

                if(board[i][j] == 'Q'){
                    return false;
                }

        }
        //diagonally right
        for(int i = row-1,j = col+1; i>=0 && j < board.length; i--, j++){

                if(board[i][j] == 'Q'){
                    return false;
                }

        }
        return true;
    }
    private static int count = 0;
    public static void NQueens(char board[][] , int row){
        //base case
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        //recursion
        for(int j = 0; j< board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';//place the queen to the column
                NQueens(board, row+1);//backtracking step
                //now we need to remove the queen from the position so that it can be placed somewhere else in the same column
                board[row][j] = 'x';
            }


        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-----chess board-------");
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        char board[][] = new char[n][n];
        //lets initialize
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                board[i][j] = 'x';
            }
        }
        NQueens(board, 0);
        System.out.println(count);
    }
}
