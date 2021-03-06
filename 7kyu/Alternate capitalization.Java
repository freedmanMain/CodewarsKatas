//Given a string, capitalize the letters that occupy even
//indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
//
//For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
//
//The input will be a lowercase string with no spaces.
//
//Good luck!
//
//If you like this Kata, please try:

class Solution {
    public static String[] capitalize(String s) {
        String s1 = "";
        String s2 = "";
        String[] s3 = s.split("");
        for (int i = 0; i < s3.length; i++) {
            if (i % 2 == 0) {
                s1 += s3[i].toUpperCase();
            } else {
                s1 += s3[i];
            }
            if (i % 2 == 0) {
                s2 += s3[i];
            } else {
                s2 += s3[i].toUpperCase();
            }
        }
        return new String[]{s1, s2};
    }

}