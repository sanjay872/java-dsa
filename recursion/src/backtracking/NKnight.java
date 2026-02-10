package backtracking;

public class NKnight {
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        knights(board,0,0,4);
    }

    static void knights(boolean[][] board, int row, int col, int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }

        if(row==board.length){
            return;
        }

        if(col==board.length){
            knights(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            knights(board,row,col+1,knights-1);
            board[row][col]=false;
        }

        knights(board,row,col+1,knights);
    }

    static boolean isSafe(boolean[][] board, int row, int col){

        // knight possible movements on top - (-2,-1) , (-1,-2) , (-2,+1) , (-1,+2)

        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }


        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }


        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }


        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    static void display(boolean[][] board){
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K " : "X ");
            }
            System.out.println();
        }
    }
}
