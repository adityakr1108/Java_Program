class divisor{
    public static void main(String[] args){
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = 36;

        
        divisor(n);
        System.out.println();
        System.out.println(isPrime(n));
        primeFactors(n);
        operation(n);

    }
    public static void primeFactors(int n){
        System.err.print("Prime Factors are: ");

        for(int i = 2;i*i<=n;i++){
            while(n%i == 0){
                System.out.print(i + " ");
                n /=i;
            }
        }
        if(n > 1){
            System.out.print(n);
        }
        System.out.println();
    }
    public static void divisor(int n){
        for(int i = 1;i<Math.sqrt(n);i++){
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }

    public static void perfectSquare(int n){
        // 1st approach
        // for(i -> n) i*i == n
        for(int i = 1;i<n;i++){
            if(i*i== n){
                System.out.print("Perfect Square");
                break;
            }
        }
        // 2nd approach
        // for(i -> sqrt(n)) i*i == n
        for(int i = 0;i<Math.sqrt(n);i++){
            if(i*i == n){
                System.out.print("Perfect Square");
                break;
            }
        }
        // 3rd approach
        int d = (int)Math.sqrt(n);
        if(d*d == n){
            System.out.print("Perfect Square");
        }
        // sqrt(n)==d a && d*d == n
        // 4th approach
        // abstract binary search
            int low = 1;
            int high = n;
            while(low < high){
                int mid = (low+high)/2;
                if(mid*mid == n){
                    System.out.print("Perfect Square");
                    break;
                }
                else if(mid*mid < n){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        // 5th approach
        // odd no of divisor
        
        // 6th approach   
        // 1+3+5+... = n^2
    }

    public static void operation(int n){
        // total no of divisor
        int count = 0;
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                if(i == n/i){
                    count++;
                }
                else{
                    count += 2;
                }
            }
        }

        System.err.println("Total no of divisor: " + count);
        // sum of divisor
        int sum = 0;    
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                if(i == n/i){
                    sum += i;
                }
                else{
                    sum += i + n/i;
                }
            }
        }
        System.err.println("Sum of divisor: " + sum);
        //product of divisor
        int product = 1;
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                if(i == n/i){
                    product *= i;
                }
                else{
                    product *= i * n/i;
                }
            }
        }
        System.err.println("Product of divisor: " + product);
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}