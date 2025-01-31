package Array.Practice;

import java.util.Scanner;

public class palindrome {
    public static boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length();
        boolean check = false;
        int checkInc= 0;
        while(start<end){
            if(str.charAt(start) == str.charAt(end-1)){ 
                  check = true;
                  checkInc++;
            }

            start ++;
            end--;
        }
        if(checkInc == end+1 && check){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
        sc.close();
        
    }
}
