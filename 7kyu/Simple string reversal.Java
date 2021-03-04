//In this Kata, we are going to reverse a
//string while maintaining the spaces (if any) in their original place.
//
//For example:
//
//solve("our code") = "edo cruo"
//-- Normal reversal without spaces is "edocruo".
//-- However, there is a space at index 3, so the string becomes "edo cruo"
//
//solve("your code rocks") = "skco redo cruoy".
//solve("codewars") = "srawedoc"
//More examples in the test cases. All input will be lower case letters and in some cases spaces.
//
//Good luck!
//
//Please also try:
//
//Simple time difference
//
//Simple remove duplicates

class Solution {
    public static String solve(String s) {
        if (s.indexOf(" ") < 0) {
            return new StringBuilder().append(s).reverse().toString();
        }
        int[] len = new int[s.split(" ").length];
        int i = 0;
        StringBuilder builder = new StringBuilder();
        for (String arg : s.split(" ")) {
            builder.append(arg);
            len[i++] = arg.length();
        }
        builder.reverse();
        int leftBorder = 0;
        String[] result = new String[s.split(" ").length];
        for (int j = 0; j < result.length; j++) {
            result[j] = builder.substring(leftBorder, len[j] + leftBorder).toString();
            leftBorder += len[j];
        }
        return String.join(" ", result);
    }
}