package ContainsDuplicate;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        // int[] nums = {1,2,3,4};
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        //boolean answer = containsDuplicate(nums);
        boolean answer = EfficientContainsDuplicate(nums);
        System.out.println("Result: " + answer);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean EfficientContainsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }

}
