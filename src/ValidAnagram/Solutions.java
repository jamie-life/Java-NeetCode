package ValidAnagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solutions {

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean result = isAnagram(s, t);
        System.out.println("Answer: " + result);
    }
    public static boolean isAnagram(String s, String t) {

        char[] word = s.toCharArray();
        char[] rearranged = t.toCharArray();

        HashMap<Character, Integer> hold = new HashMap<>();
        for (char c : word) {
            if (hold.containsKey(c)) {
                hold.put(c, (hold.get(c)+1));
            } else {
                hold.put(c, 1);
            }
        }

        for (char c : rearranged) {
            if (hold.containsKey(c)) {
                hold.put(c, (hold.get(c)-1));
                if (hold.get(c) < 0 ) { return false; }
            } else { return false; }
        }
        for (Map.Entry<Character, Integer> set: hold.entrySet()) {
            if (set.getValue()!=0) return false;
        }
        return true;
    }
}
