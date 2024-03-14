 package ArrayList;
 import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        System.out.println("Enter the no of building");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i<size;i++){
            int a = sc.nextInt();
            height.add(a);
        }
        int area = 0;
        int max = Integer.MIN_VALUE;
        int start = 0; 
        int end = height.size()-1;
        while(start<end){
            int diff = Math.min(height.get(start),height.get(end));
            area = diff * (end-start);
            max = Math.max(area,max);
            if(height.get(start) < height.get(end)){
                start++;
            }
            else{
            end--;
            }
        }
        System.out.println(max);
}
}
 


// 2nd Approach


// Brute force technique

// public class ContainerWithMostWater {
// public static void main(String[] args) {
//     ArrayList<Integer> height = new ArrayList<>();
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of building..");
//     int size = sc.nextInt();
//     for(int i = 0; i<size;i++){
//         int a = sc.nextInt();
//         height.add(a);
//     }
//     int max = Integer.MIN_VALUE;
//     int area = 0;
//     for(int i = 0; i<size-1;i++){
//         for(int j = 1;j<size;j++){
//             int diffHeight = Math.min(height.get(i),height.get(j));
//             area = diffHeight * (j-i);
//             max = Math.max(area,max);  
//         }
//     }
//     System.out.println(max);
// }
// }
