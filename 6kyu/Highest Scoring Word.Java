//Given a string of words, you need to find the highest scoring word.
//
//Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//You need to return the highest scoring word as a string.
//
//If two words score the same, return the word that appears earliest in the original string.
//
//All letters will be lowercase and all inputs will be valid.

import java.util.LinkedHashMap;

public class Kata {
    public static String high(String s) {
        LinkedHashMap<Character, Integer> alphabet = new LinkedHashMap<>();
        for (int i = 1, ch = 97; i <= 26; i++, ch++) {
            alphabet.put((char) ch, i);
        }
        int globalSum = 0;
        String str = "";
        for (String word : s.split(" ")) {
            int localSum = 0;
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                localSum += alphabet.get(chars[i]);
            }
            if (globalSum < localSum) {
                globalSum = localSum;
                str = word;
            }
        }
        return str;
    }

}