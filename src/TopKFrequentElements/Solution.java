package TopKFrequentElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, map.getOrDefault(num, 1));
            }
        }
        int maxValueInMap = (Collections.max(map.values()));
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            for (Integer key : map.keySet()) {
                if (map.get(key) == maxValueInMap) {
                    result[i] = key;
                    map.put(key, -1);
                    maxValueInMap = (Collections.max(map.values()));
                    break;
                }

            }
        }


        return result;
    }
}
