package Question;

public class TappingRainwater {
    public static int trappedWater(int arr[],int width){ // time complexity = O(n)
        // left max boundary
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1;i<leftMax.length;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        // right max boundary

        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        int waterCaptured = 0;
        for(int i = 0;i<arr.length;i++){
            // water level = min(leftMax[i] -rightMAx[i])
            int waterLevel = Math.min(leftMax[i],rightMax[i]) - arr[i];
            waterCaptured += waterLevel;
        }
        
        return waterCaptured;
    }
    
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int width = 1;
        System.out.println("Total water to be trapped: "+trappedWater(arr,width));
    }
}
