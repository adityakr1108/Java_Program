class convertANoIntoBinaryNo {
    public static void main(String[] args) {
        int n = 5;
        String ans = " ";
        while (n > 0) {
            ans = ans + (char)(n%2+'0');
            n = n / 2;
        }
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        System.out.println(sb);
        // System.out.println(5<<2);
        // System.out.println(5>>2);
        // System.out.println(6 & 1);
        // System.out.println(8 | 5);
        // System.out.println(8 ^ 5);
        // System.out.println(~6);

        int k = 13;
        int step = 1;
        // for(int i = 0;i<step;i++){
        //     k = k<<1;
        // }
        System.out.println((k & (1 << step)) > 0 ? "Set" : "Unset");

         // for unsetting kth bit
        System.out.println(k ^(~(1 << step)));

        // for toggling kth bit
        System.out.println(k ^ (1 << step));


        // swap through bitwise opertor

        int a = 5;
        int b = 6;
        a = a ^ b; // a - 011 -- 3
        b = a ^ b; // b - 101 -- 5
        a = a ^ b; // a - 110 -- 6
        System.out.println(a + " " + b);

        // to count the no of set bit in a number
        System.out.println(Integer.bitCount(13));
        // System.out.println(__builtin_popcount(13));

        String s1 = "abcw";
        String s2 = "xtfn";
        StringBuilder xorResult = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            // Convert each character to its ASCII value and XOR
            int xorValue = s1.charAt(i) ^ s2.charAt(i);
            // Append the result as a character to the result string
            xorResult.append((char) xorValue);
        }

        System.out.println("XOR Result: " + xorResult);
    
}
}