class dec{
    public static void main(String[] args){
        int arr[] = {4,2,6,9,10,3};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}