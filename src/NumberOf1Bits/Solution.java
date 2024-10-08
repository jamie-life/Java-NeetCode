package NumberOf1Bits;

public class Solution {
    public static void main(String[] args) {
        int input = 11;
        hammingWeight(input);
        System.out.println(Integer.parseInt("110", 2));
    }

//    public static int hammingWeight(int n) {
//        return Integer.bitCount(n);
//    }

    public static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            n = n>>>1;
        }
        return ones;

    }
}
