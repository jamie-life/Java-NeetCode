package TwoSumII;

import java.util.Arrays;

public class Solutions {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};

        int[] answer = twoSum(numbers, 26);
        System.out.println(Arrays.toString(answer));
    }


    public static int[] twoSum(int[] numbers, int target) {
        int footer = 0;
        int header = numbers.length - 1;
        while (footer < header) {
            if (numbers[footer] + numbers[header] == target) {
                return new int[] {footer + 1, header + 1};
            }
            if (numbers[footer] + numbers[header] > target) {
                header -= 1;
            }
            if (numbers[footer] + numbers[header] < target) {
                footer += 1;
            }
        }
        return numbers;
    }
}
