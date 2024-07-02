class indexOfPeek{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,10,12,13,10,5,0};
        int low = 0; 
        int high = arr.length-1;
        int index = 0;
        int max = Integer.MIN_VALUE;
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid+1] > arr[mid -1]){
                low = mid+1;
                max = Math.max(max,arr[mid]);
                index = mid;
            } 
            else if ( arr[mid+1] < arr[mid-1]){
                high = mid-1;
                max = Math.max(max,arr[mid]);
                index = mid;
            }      
                
        }
        System.out.println(max);
    }
}