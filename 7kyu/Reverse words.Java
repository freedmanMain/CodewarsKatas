//Complete the function that accepts a string parameter, and reverses each word in the string.
//All spaces in the string should be retained.
//
//Examples
//"This is an example!" ==> "sihT si na !elpmaxe"
//"double  spaces"      ==> "elbuod  secaps"

public class Kata {
    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        String[] words = original.split(" ");
        StringBuilder reverseWords = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (String arg : words) {
            reverseWords.append(arg);
            result.append(reverseWords.reverse() + " ");
            reverseWords.replace(0, reverseWords.length(), "");
        }
        return result.replace(result.length() - 1, result.length(), "").toString();
    }
}