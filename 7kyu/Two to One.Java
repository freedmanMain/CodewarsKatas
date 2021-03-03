//Take 2 strings s1 and s2 including only letters from ato z.
//Return a new sorted string, the longest possible,
//containing distinct letters - each taken only once - coming from s1 or s2.
//
//Examples:
//a = "xyaabbbccccdefww"
//b = "xxxxyyyyabklmopq"
//longest(a, b) -> "abcdefklmopqwxy"
//
//a = "abcdefghijklmnopqrstuvwxyz"
//longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

import java.util.*;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (char letter : (s1 + s2).toCharArray()) {
            set.add(letter);
        }
        char[] s3 = set.toString().
                replace(",", "").
                replace(" ", "").
                replace("[", "").
                replace("]", "").toCharArray();
        Arrays.sort(s3);
        return new String(s3);
    }
}