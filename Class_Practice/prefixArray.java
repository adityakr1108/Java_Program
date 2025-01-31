

class prefixArray{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int prefix[][] = new int [arr.length][arr[0].length];

        prefix[0][0] = arr[0][0];
        for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                if(i == 0 && j == 0) continue;
                if(i ==0){
                    prefix[i][j] = prefix[i][j-1] +arr[i][j];
                }
                else if(j == 0){
                    prefix[i][j] = prefix[i-1][j] + arr[i][j];
                }
                else{
                    prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] + arr[i][j] - prefix[i-1][j-1];
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                System.out.print(prefix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}