package ArrayList;
import java.util.ArrayList;

import java.util.Collections;
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=5;i++){
            list.add(i*2);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); // for sorting te array in reverae order
        System.out.println(list);
        

    }
}
