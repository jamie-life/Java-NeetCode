package BinarySearch;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {5};
        int target = -5;

        int answer = search(nums, target);
        System.out.println(answer);

    }

    public static int search(int[] nums, int target) {

        int footer = 0;
        int header = nums.length - 1;

        while (footer <= header) {
            int middle = footer + (header - footer) / 2;

            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] < target) {
                footer = middle + 1;
            }
            else {
                header = middle - 1;
            }
        }

        return -1;
    }
}
