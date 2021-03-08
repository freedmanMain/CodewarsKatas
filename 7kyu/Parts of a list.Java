//Write a function partlist that gives all the ways to divide a list
//(an array) of at least two elements into two non-empty parts.
//
//Each two non empty parts will be in a pair (or an array for
//languages without tuples or a structin C - C: see Examples test Cases - )
//Each part will be in a string
//Elements of a pair must be in the same order as in the original array.
//Examples of returns in different languages:
//a = ["az", "toto", "picaro", "zone", "kiwi"] -->
//[["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"],
//["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
//or
// a = {"az", "toto", "picaro", "zone", "kiwi"} -->
//{{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"},
//{"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}
//or
//a = ["az", "toto", "picaro", "zone", "kiwi"] -->
//[("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"),
//("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
//or
//a = [|"az", "toto", "picaro", "zone", "kiwi"|] -->
//[("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"),
//("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
//or
//a = ["az", "toto", "picaro", "zone", "kiwi"] -->
//"(az, toto picaro zone kiwi)(az toto, picaro zone kiwi)(az toto picaro,
//zone kiwi)(az toto picaro zone, kiwi)"
//Note
//You can see other examples for each language in "Your test cases"

public class Partlist {

    public static String[][] partlist(String[] arr) {
        int[] len = new int[arr.length];
        for (int i = 0; i < len.length; i++) len[i] = arr[i].length() + 1;
        String current = String.join(" ", arr);
        int start = 0;
        String[][] res = new String[arr.length - 1][1];
        for (int i = 0; i < res.length; i++) {
            String left = current.substring(0, len[i] + start).strip();
            String right = "," + current.replaceFirst(left, "");
            start += len[i];
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = left + right;
            }
        }
        return res;
    }
}