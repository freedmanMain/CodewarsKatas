//Given a string and an array of integers representing indices, capitalize all letters at the given indices.
//
//For example:
//
//capitalize("abcdef",[1,2,5]) = "aBCdeF"
//capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
//The input will be a lowercase string with no spaces and an array of digits.
//
//Good luck!
//
//Be sure to also try:

package kata;

public class Solution {
    public static String capitalize(String s, int[] ind) {
        String[] strs = s.split("");
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < ind.length; j++) {
                if (i == ind[j] && ind[j] < strs.length) {
                    strs[i] = strs[i].toUpperCase();
                }
            }
        }
        return String.join("", strs);
    }
}