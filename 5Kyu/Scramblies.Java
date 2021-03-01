//Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be
//rearranged to match str2, otherwise returns false.
//
//Notes:
//
//Only lower case letters will be used (a-z). No punctuation or digits will be included.
//Performance needs to be considered
//Input strings s1 and s2 are null terminated.
//Examples
//scramble('rkqodlw', 'world') ==> True
//scramble('cedewaraaossoqqyt', 'codewars') ==> True
//scramble('katas', 'steak') ==> False

import java.util.*;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        Map<Character, Integer> m1 = new HashMap<>();
        fillMap(m1, str1.toLowerCase());
        Map<Character, Integer> m2 = new HashMap<>();
        fillMap(m2, str2.toLowerCase());
        if (m1.size() < m2.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> current : m2.entrySet()) {
            if (current.getValue() > m1.get(current.getKey())) {
                return false;
            }
        }
        return true;
    }

    private static void fillMap(Map<Character, Integer> map, String arg) {
        for (char ch : arg.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
    }
}