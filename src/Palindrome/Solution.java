package Palindrome;

public class Solution {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //String s = "ABCBA";
        boolean answer = isPalindrome(s);
        System.out.println(answer);
    }

    public static boolean isPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        input = input.toLowerCase();
        char[] CharArray = input.toCharArray();
        int footer = 0;
        int header = CharArray.length - 1;
        for (int i = 0; i < Math.floor((double) CharArray.length / 2); i++) {
            if (CharArray[footer] != CharArray[header]) {
                return false;
            }
            footer += 1;
            header -= 1;
        }
        return true;
    }


}
