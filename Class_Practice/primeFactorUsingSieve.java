import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {15, 24, 12, 36, 60};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i <= max; i++) {
            ans.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num != 1) {
                int a = lowestPrimeFactor(num);
                ans.get(i).add(a);
                num = num / a;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Prime factors of " + arr[i] + " are: ");
            ArrayList<Integer> factors = ans.get(i);
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
    }

    public static int lowestPrimeFactor(int n) {
        int prime[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = 1;
        }
        prime[1] = 0;

        int lpf[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            lpf[i] = -1;
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                lpf[i] = i;
                for (int j = 2 * i; j <= n; j += i) {
                    if (lpf[j] == -1) {
                        lpf[j] = i;
                        prime[j] = 0;
                    }
                }
            }
        }
        return lpf[n];
    }
}
