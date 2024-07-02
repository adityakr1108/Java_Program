class binnaryStartEnd{
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,4,5,10,11,12};
        int k = 4;
        int low = 0;
        int high = arr.length-1;
        int start = -1;
        int end = -1;
        while(low < high){
            int mid = (low+high) / 2;
            if(arr[mid] == k){
                while(arr[mid--] == k){
                    start = mid;
                }
            break;
            }
            else if(k < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid-1;
            }
        }


        while(low < high){
            int mid = (low+high) / 2;
            if(arr[mid] == k){
                while(arr[mid++] == k){
                    end =  mid;
                }
                break;
            }
            else if(k < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid-1;
            }
        }

        System.out.println(start+1 +":"+ (end-1));


    }
}



int arr[] = {1,2,2,3,3,4,5,6,7};
find no of pairs i,j such that arr[i] + arr[j] < target;