//Task
//Given an array of strings, reverse them and their order in such way that their
//length stays the same as the length of the original inputs.
//
//Example:
//Input:  {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}
//Output: {"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"}

public class ArrayReverser {
    public static String[] reverse(String[] a) {
        int[] len = new int[a.length];
        String b = "";
        int j = 0;
        for (String arg : a) {
            b += arg;
            len[j++] = arg.length();
        }
        b = new StringBuilder().append(b).reverse().toString();
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = b.substring(left, len[i] + left);
            left += len[i];
        }
        return a;
    }
}