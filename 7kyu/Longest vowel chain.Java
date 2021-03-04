//The vowel substrings in the word codewarriors are o,e,a,io.
//The longest of these has a length of 2. Given a lowercase string that has alphabetic characters only
//(both vowels and consonants) and no spaces, return the length of the longest vowel substring. Vowels are any of aeiou.
//
//Good luck!
//
//If you like substring Katas, please try:

class Solution {
    public static int solve(String s) {
        int len = 0;
        int localLen = 0;
        for (String arg : s.split("")) {
            if ("aeiou".indexOf(arg) >= 0) {
                localLen++;
            } else if (localLen > len) {
                len = localLen;
                localLen = 0;
            } else {
                localLen = 0;
            }
        }
        return Math.max(len, localLen);
    }
}