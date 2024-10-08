package ConsecutiveSequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 1;
        int total = 0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                count++;
            } else if (nums[i + 1] - nums[i] != 0){
                total = Math.max(total, count);
                count = 1;
            }
        }
        total = Math.max(total, count);


        return total;
    }
}
