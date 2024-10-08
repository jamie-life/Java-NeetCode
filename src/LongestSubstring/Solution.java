package LongestSubstring;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String s = "ddvf";
        int answer = lengthOfLongestSubstring(s);
        System.out.println(answer);
    }

//    public static int lengthOfLongestSubstring(String s) {
//        if (s.length() == 1){
//            return 1;
//        }
//        char[] word = s.toCharArray();
//        HashMap<Character, Character> hold = new HashMap<>();
//
//        int max_count = 0;
//        int count = 0;
//        int footer = 0;
//        int header = 1;
//
//        while (header < word.length) {
//            if (hold.isEmpty()) {
//                hold.put(word[footer], word[footer]);
//                count++;
//                max_count = Math.max(max_count, count);
//
//            }
//
//            if (hold.containsKey(word[header])) {
//                footer++;
//                header = footer + 1;
//                hold.clear();
//                count = 0;
//
//            } else {
//                hold.put(word[header], word[header]);
//                header++;
//                count++;
//                max_count = Math.max(max_count, count);
//            }
//
//
//        }
//        return max_count;
//    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
