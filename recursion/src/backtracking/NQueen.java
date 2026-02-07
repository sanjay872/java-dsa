package backtracking;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        int possibleBoards=queens(board,0);
        System.out.println("The total possibility are: "+possibleBoards);
    }

    static int queens(boolean[][] board, int row){

        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count=0;

        for(int i=0;i<board[row].length;i++){
            if(isSafe(board,row,i)){
                board[row][i]=true;
                count+=queens(board,row+1);
                board[row][i]=false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left
        int leftLimit=Math.min(row,col); // the max movement on left is min of row and col
        for(int i=1;i<=leftLimit;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // diagonal right
        int rightLimit=Math.min(row,board.length-col-1);// the max movement on right is row and board.length-col+1 is available col to move
        for(int i=1;i<=rightLimit;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for (boolean[] booleans : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(booleans[j] ? "Q" : "X");
            }
            System.out.println();
        }
    }
}
