import java.util.*;
class nQueens{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        char board [][] = new char[n][n];

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                board[i][j] = '.';
            }
        }
        nQueen(board,0);

    }

    public static void nQueen(char board[][],int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        
        for(int i = 0; i<board.length;i++){
            board[row][i] = 'Q';
            nQueen(board,row+1);
            board[row][i] = '.';
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("-----------chess board-----------");
        for (char[] board1 : board) {
            for (int j = 0; j<board.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
    }
}