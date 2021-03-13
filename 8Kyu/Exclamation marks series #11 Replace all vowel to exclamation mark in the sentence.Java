//Description:
//Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
//
//Examples
//replace("Hi!") === "H!!"
//replace("!Hi! Hi!") === "!H!! H!!"
//replace("aeiou") === "!!!!!"
//replace("ABCDE") === "!BCD!

public class Solution {
    public static String replace(final String s) {
        String res = s;
        for (String l : res.split("")) {
            if ("aeiouAEIOU".indexOf(l) >= 0) {
                res = res.replace(l, "!");
            }
        }
        return res;
    }
}