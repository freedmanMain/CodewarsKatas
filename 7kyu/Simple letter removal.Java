//In this Kata, you will be given a lower case string and your task will
//be to remove k characters from that string using the following rule:
//
//- first remove all letter 'a', followed by letter 'b', then 'c', etc...
//- remove the leftmost character first.
//For example:
//solve('abracadabra', 1) = 'bracadabra' # remove the leftmost 'a'.
//solve('abracadabra', 2) = 'brcadabra'  # remove 2 'a' from the left.
//solve('abracadabra', 6) = 'rcdbr'      # remove 5 'a', remove 1 'b'
//solve('abracadabra', 8) = 'rdr'
//solve('abracadabra',50) = ''
//More examples in the test cases. Good luck!
//
//Please also try:
//
//Simple time difference
//
//Simple remove duplicates

import java.util.Arrays;

public class SimpleLetterRemoval {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String solve(String s, int k) {
        String[] letters = ALPHABET.split("");
        int count = 0;
        for (int i = 0; i < letters.length; ) {
            if (count == k) {
                break;
            }
            if (s.indexOf(letters[i]) >= 0) {
                s = s.replaceFirst(letters[i], "");
                count++;
            } else {
                i++;
            }
        }
        return s;
    }
}