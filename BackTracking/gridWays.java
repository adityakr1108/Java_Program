import java.util.*;
class gridWays{

    public static int grid(int i, int j, int[][] board) {
        if(i >= board.length || j >= board[0].length) return 0; // Added base case to prevent infinite recursion
        int x = grid(i+1,j,board) + grid(i,j+1,board);
        return x;
    }

    public static void printBoard(int board[][]){
        System.out.println("-----------chess board-----------");
        for (int[] board1 : board) {
            for (int j = 0; j < board1.length; j++) { // Corrected loop condition
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int m = sc.nextInt();

        int board[][] = new int[n][m];

        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                board[i][j] = '.';
            }
        }

        grid(0,0,board);

        printBoard(board);
    }
}