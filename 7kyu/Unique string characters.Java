//In this Kata, you will be given two strings a and b and your
//task will be to return the characters that are not common in the two strings.
//
//For example:
//
//solve("xyab","xzca") = "ybzc"
//--The first string has 'yb' which is not in the second string.
//--The second string has 'zc' which is not in the first string.
//Notice also that you return the characters from the first string concatenated with
//those from the second string.
//
//More examples in the tests cases.
//
//Good luck!
//
//Please also try Simple remove duplicates

class Solution {
    public static String solve(String a, String b) {
        String res = "";
        for (String arg : (a + " " + b).split(" ")) {
            for (String letter : arg.split("")) {
                if (arg.equals(a)) {
                    if (b.indexOf(letter) < 0) {
                        res += letter;
                    }
                } else {
                    if (a.indexOf(letter) < 0) {
                        res += letter;
                    }
                }
            }
        }
        return res;
    }
}