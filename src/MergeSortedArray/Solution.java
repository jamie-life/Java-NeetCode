package MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        merge(new int[]{ 1, 2, 3, 0, 0, 0 },3, new int[]{ 2, 5, 6,},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];

        int listOnePosition, listTwoPosition, listMergedPosition;
        listOnePosition = listTwoPosition = listMergedPosition = 0;

        while (listOnePosition < m && listTwoPosition < n) {
            if (nums1[listOnePosition] < nums2[listTwoPosition]) {
                merged[listMergedPosition++] = nums1[listOnePosition++];
            } else {
                merged[listMergedPosition++] = nums2[listTwoPosition++];
            }
        }

        System.out.println(Arrays.toString(merged));

        while (listOnePosition < m) {
            merged[listMergedPosition++] = nums1[listOnePosition++];
        }

        while (listTwoPosition < n) {
            merged[listMergedPosition++] = nums2[listTwoPosition++];
        }

        System.arraycopy(merged, 0, nums1, 0, merged.length);
        System.out.println(Arrays.toString(merged));
//        System.out.println(Arrays.toString(merged));

    }
}
