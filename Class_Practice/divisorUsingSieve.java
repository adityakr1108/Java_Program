import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {3, 15, 24, 36, 18};
        divisor(arr);
    }

    public static void divisor(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            ans.add(new ArrayList<Integer>());
        }

        for (int i = 2; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                ans.get(j).add(i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Divisors of " + arr[i] + " are: ");
            ArrayList<Integer> divisors = ans.get(arr[i]);
            for (int divisor : divisors) {
                System.out.print(divisor + " ");
            }
            System.out.println();
        }
    }
}
