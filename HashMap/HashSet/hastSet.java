import java.util.*;
class hashSet{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        String arr[] = {"Patna","Delhi","Mumbai","Gurgoan","Kolkata","Srinagar"};
        for(String st : arr){
            set.add(st);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for(String st : set){
            System.out.print(st + " ");
        }
        System.out.println();

        // linked hashset

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        for(String st : arr){
            set1.add(st);
        }
        System.out.println(set1);

        TreeSet<String> set3 = new TreeSet<>();
        for(String st : arr){
            set3.add(st);
        }
        System.out.println(set3);
    }
}