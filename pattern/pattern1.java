class pattern1{

   public static  void print1(int n){
        for(int i = 0 ; i< n;i++){
            for(int j= 0; j<= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n){
        int k = 0;
        for(int i = 0;i<n;i++){
            for(int j = 1;j<=i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void print3(int n){
        int k = 1;
        for(int i = 0;i<n;i++){
            for(int j = 1;j<=i+1;j++){
                System.out.print(k + " ");
            }
            k++;
            System.out.println();
        }
    }
    public static void print4(int n){
        for(int i = 1 ;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void print5(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }


    public static void main(String[] args){
        // print1(5);
        // print2(5);
        // print3(5);
        // print4(5);
        print5(5);
    }
}