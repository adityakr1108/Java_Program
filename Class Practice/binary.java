class binary{
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5,7,10,11};
        int low = 0;
        int k = 5;
        int index = -1;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(k == arr[mid]){
                index = mid;
                break;
            }
            else if(k < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        System.out.println(index);
    }
}