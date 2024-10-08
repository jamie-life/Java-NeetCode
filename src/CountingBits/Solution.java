package CountingBits;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) {
        int[] output = new int[n + 1];
        int number, remainder;
        int count = 0;

        for (int i = 0; i < output.length; i++) {
            number = i;
            while (number > 0) {
                remainder = number % 2;
                number = number / 2;
                if (remainder == 1) {
                    count++;
                }
            }
            output[i] = count;
            count = 0;

        }
        return output;
    }

//    public static int[] countBits(int n) {
//        int[] output = new int[n + 1];
//        int count = 0;
//        for (int i = 0; i < output.length; i++) {
//            String result = Integer.toBinaryString(i);
//            for (int j = 0; j < result.length(); j++) {
//                if (result.charAt(j) == '1') {
//                    count ++;
//                }
//            }
//            output[i] = count;
//            count = 0;
//        }
//        return output;
//    }


}
