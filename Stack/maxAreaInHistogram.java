package Stack;

import java.util.Stack;

public class maxAreaInHistogram {
    
    public static int  maxArea(int [] height){
         
        int []nsl = new int[height.length];
        int [] nsr = new int[height.length]; 
        // next Smallest left
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<nsl.length;i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = height.length;
            }
            else{
                nsl[i] = s.peek() ;
            }
            s.push(i);
        }
        // next smallest right
        s = new Stack<>();
        for(int i = nsr.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }


        // calculate area: width = nsr[i] - nsl[i] -1
        int maxArea = 0;
        int [] width = new int[height.length];
        for(int i = 0; i<width.length;i++){
            width[i] = nsr[i] - nsl[i] -1;
            int currentArea = width[i] * height[i];
            maxArea = Math.max(maxArea,currentArea);
        }
        
         

        return maxArea;


    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        System.out.println(maxArea(height));
    }
}
