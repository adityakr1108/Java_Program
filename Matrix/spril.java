package Matrix;

import java.util.Scanner;

public class spril {
    public static void sprilMatrix(int matrix[][]){
        System.out.println("Spril Matrix : ");
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endColu = matrix[0].length -1;
        while(startRow<=endRow & startCol <= endColu ){
            // top row
            for(int j = startCol;j<endColu;j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right row
            for(int i = startCol;i<endColu;i++){
                System.out.print(matrix[i][endRow] + " ");
            }
            // bottom row
            for(int j = endColu;j>startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endColu][j] + " ");
            }
            // left row
            for(int i = endRow;i>startRow;i--){
                if(startCol == endColu){
                    break;
                }
                System.out.print(matrix[i][startCol] +" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endColu--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sprilMatrix(matrix);
        sc.close();
    }
}
