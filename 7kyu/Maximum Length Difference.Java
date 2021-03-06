//You are given two arrays a1 and a2 of strings.
//Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
//
//Find max(abs(length(x) − length(y)))
//
//If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//
//Example:
//a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//mxdiflg(a1, a2) --> 13
//Bash note:
//input : 2 strings with substrings separated by ,
//output: number as a string

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        int maxAbs = 0;
        for (String arg : a1) {
            int abs = 0;
            for (String arg2 : a2) {
                abs = Math.abs(arg.length() - arg2.length());
                maxAbs = Math.max(maxAbs, abs);
            }
        }
        return maxAbs > 0 ? maxAbs : -1;
    }
}