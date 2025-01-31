package Recursion;

import java.util.Scanner;

public class decreNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // noIndecreasing_order(n);
        incresingOrder(n);
        sc.close();
    }

    static void noIndecreasing_order(int n){
        if(n == 0){
            return;
        }
       System.out.println(n);
       noIndecreasing_order(n-1);
    }
    static void incresingOrder(int n){
      if(n==1){
        System.out.println(n);
        return;
      }
      else{
        incresingOrder(n-1);
        System.out.println(n);
      }
    }
}
