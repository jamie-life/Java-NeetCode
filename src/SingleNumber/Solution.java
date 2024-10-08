package SingleNumber;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int answer = singleNumber(nums);
        System.out.println(answer);
    }
//    public static int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int i = 0;
//        while (i < nums.length - 1) {
//            if (nums[i] != nums[i+1]) {
//                return nums[i];
//            }
//            i+=2;
//        }
//
//        return nums[i];
//    }

    public static int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for (int num : nums) {
            ans ^= num;  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }
}
