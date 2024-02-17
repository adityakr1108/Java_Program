package Matrix;

import java.util.Scanner;

public class matrix {
    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                largest = Math.max(matrix[i][j], largest);
                
            }
        }
        return largest;
    }
    public static int smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                smallest = Math.min(matrix[i][j],smallest);
            }
        }
        return smallest;
    }
    public static void printmat(int matrix[][],int n,int m){
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        printmat(matrix, n, m);
        System.out.println("Largest value in matrix is "+largest(matrix));
        System.out.println("Smallest value in matrix " + smallest(matrix));
        sc.close();
        
    }
        
}
