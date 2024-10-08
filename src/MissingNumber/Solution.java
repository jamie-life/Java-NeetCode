package MissingNumber;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int answer = ((nums.length * nums.length) + nums.length) / 2;

        for (int num : nums) {
            answer -= num;
        }
        return answer;
    }
}
