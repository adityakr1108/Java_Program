package ArrayList;
import java.util.*;

// for 
// / First approach
// Brute Force
public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of list...");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elemnets to be inserted...");
        for(int i = 0; i<size;i++){
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println("Enter the target value...");
        int target = sc.nextInt();
         ArrayList<Integer> pairSum = new ArrayList<>();
        for(int i = 0;i<size-1;i++){
            for(int j = i+1;j<size;j++){
                if(target == list.get(i) + list.get(j)){
                    pairSum.add(list.get(i));
                    pairSum.add(list.get(j));
                }
            }
        }
        System.out.println(pairSum);
        sc.close();
    }
}
public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of list..");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i<size;i++){
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println("Enter the target value to find the pair sum..");
        int target = sc.nextInt();
        ArrayList<Integer> pairSumList = new ArrayList<>();
        int start = 0;
        int end = list.size()-1;
        while(start != end){
            if(list.get(start) + list.get(end) == target){
                pairSumList.add(list.get(start));
                pairSumList.add(list.get(end));
            }
            if(list.get(start) + list.get(end) < target){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(pairSumList);

    }
}
