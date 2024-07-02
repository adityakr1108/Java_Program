class qQuaries{
    public static void main(String[] args){
        int arr[] = {2,1,3,6,5,4};
        int prefix[] = new int[arr.length];
        int k = 3;
        int quary[][]  = {{3,4,8},{1,5,5},{2,4,6}};
        int n = arr.length;
        for(int i = 0;i<k;i++){
            arr[quary[i][0]] += quary[i][2];

            if(quary[i][1] + 1 <  n){
                arr[quary[i][1] + 1] -=quary[i][2];
            }
        }
        prefix[0] = arr[0];
        for(int i= 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0;i<prefix.length;i++){
            System.out.print(prefix[i] + " ");
        }
    }
}