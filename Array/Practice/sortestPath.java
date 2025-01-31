package Array.Practice;

public class sortestPath {
    public static float shortestDistance(int x,int y){
        float distance = 0;
        int initial_x = 0;
        int initial_y = 0;
        distance =(float) Math.pow(Math.pow(x-initial_x,2)+ Math.pow(y-initial_y,2),0.5);
        return distance;
    }
    public static void shortest(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i<str.length();i++){
            char str1 = str.charAt(i);
            switch(str1){
                case 'W':
                     x= x-1;
                     break;
                case 'E':
                    x = x+1;
                    break;
                case 'N':
                    y = y+1;
                    break;
                case 'S':
                    y = y-1;
                    break;
            }

        }
        System.out.println(shortestDistance(x,y));;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortest(str);
    }
}
