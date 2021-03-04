//Consider the word "abode".
//We can see that the letter a is in position 1 and b is in position 2.
//In the alphabet, a and b are also in positions 1 and 2.
//Notice also that d and e in abode occupy the positions they would occupy in the alphabet,
//which are positions 4 and 5.
//
//Given an array of words, return an array of the number of letters that occupy their positions
//in the alphabet for each word. For example,
//
//solve(["abode","ABc","xyzD"]) = [4, 3, 1]
//See test cases for more examples.
//
//Input will consist of alphabet characters, both uppercase and lowercase. No spaces.
//
//Good luck!
//
//If you like this Kata, please try:
//
//Last digit symmetry
//
//Alternate capitalization

import java.util.HashMap;

public class Solution {
    public static int[] solve(String[] arr) {
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for (int i = 97, j = 0; i <= 122; i++, j++) {
            alphabet.put((char) i, j);
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            char[] chars = arr[i].toLowerCase().toCharArray();
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (alphabet.get(chars[j]) == j) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}