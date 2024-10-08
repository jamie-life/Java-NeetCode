package FizzBuzz;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> result = FizzBuzz(15);
        System.out.println(result);
    }

    public static ArrayList<String> FizzBuzz(int number) {
        ArrayList<String> output = new ArrayList<>();

        for (int i = 1; i <= number; i ++ ){

            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }

        }

        return output;

    }
}
