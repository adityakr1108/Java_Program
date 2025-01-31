package BasicsProgram;

public class Divison {
    public static void main(String[] args) {
        int divisor = 4;
        int divided = 2;
        int count = 0;
        while(divided!=0){
            divisor-=divided;
            count++;
        }
        System.out.println(count);
        System.out.println(1%2!=0);
    }
}
