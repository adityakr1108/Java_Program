package BasicsProgram;
public class sdp {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        str.append("Adi");
        int start = 0;
        int end = str.length()-1;
        while(start<=end){
            char a = str.charAt(end);
            str.setCharAt(end,str.charAt(start));
            str.setCharAt(start,a);
            start ++;
            end--;
        }
        System.out.println(str);




    }
}
