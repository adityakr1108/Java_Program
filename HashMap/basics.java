
import java.util.HashMap;

class basics{
    public static void main(String[] args) {
    HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1," ");
        hs.put(2,"abc");
        hs.put(3,"def");
        hs.put(4,"ghi");
        hs.put(5,"jkl");
        hs.put(6,"mno");
        hs.put(7,"pqrs");
        hs.put(8,"tuv");
        hs.put(9,"wxyz");
            char a = 2;
        System.out.println(hs.get((int)a));

    }
}