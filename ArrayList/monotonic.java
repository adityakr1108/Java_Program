package ArrayList;
import java.util.*;
public class monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int count = 0;
        for(int i = 0; i<5;i++){
            int a = sc.nextInt();
            list.add(a);
        }
        int j = 1;
        for(int i = 0; i< list.size();i++){
            if(list.get(i) < list.get(j) && j <= list.size()){
                check = true;
                count++;
                j++;
            }
        }
        if(check && count == list.size()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
