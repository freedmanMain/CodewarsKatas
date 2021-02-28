//Move the first letter of each word to the end of it, then add "ay" to the end of the word.
//Leave punctuation marks untouched.
//
//Examples
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//pigIt('Hello world !');     // elloHay orldway !

public class PigLatin {
    private static final String PUNCTUATION_MARKS = ",.!?;:\" ";

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (PUNCTUATION_MARKS.indexOf(words[i]) < 0) {
                if (PUNCTUATION_MARKS.indexOf(words[i].charAt(words[i].length() - 1)) < 0) {
                    words[i] = words[i].substring(1, words[i].length()) +
                            words[i].substring(0, 1) + "ay";
                } else {
                    String mark = String.valueOf(words[i].charAt(words[i].length() - 1));
                    String temp = words[i].replace(String.valueOf(words[i].charAt(words[i].length() - 1)), "");
                    words[i] = temp.substring(1, temp.length()) + temp.substring(0, 1) + "ay" + mark;
                }
            }
        }
        return String.join(" ", words);
    }
}