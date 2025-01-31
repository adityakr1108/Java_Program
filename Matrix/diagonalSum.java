package Matrix;

import java.util.Scanner;

public class diagonalSum {
    public static int diagonal(int matrix[][],int n,int m){
        // for primary diagonal;
        int sum1 = 0;
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                if(i == j){
                    sum1+=matrix[i][j];
                }
            }
        }
        int sum2 = 0;
        for(int i = n-1; i>=0;i--){
            for(int j = m-1;j>=0;j--){
                if(i == j){
                    sum2+=matrix[i][j];
                }
            }
        }
        int sum = 0;
        int i = n/2;
        if(n*m % 2 !=0){
            sum = sum1 + sum2 - matrix[i][i];
        }
        else{
            sum = sum1+sum2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonal(matrix, n, m));
        sc.close();
    }
}
