//In cryptanalysis, words patterns can be a useful tool in cracking simple ciphers.
//
//A word pattern is a description of the patterns of letters occurring in a word,
//where each letter is given an integer code in order of appearance.
//So the first letter is given the code 0, and second is then assigned
//1 if it is different to the first letter or 0 otherwise, and so on.
//
//As an example, the word "hello" would become "0.1.2.2.3".
//For this task case-sensitivity is ignored, so "hello", "helLo" and "heLlo" will all return the same word pattern.
//
//Your task is to return the word pattern for a given word.
//All words provided will be non-empty strings of alphabetic characters only, i.e. matching the regex "[a-zA-Z]+".

import java.util.LinkedHashSet;
import java.util.HashMap;

class Crypto {

    public static String wordPattern(final String word) {
        LinkedHashSet<String> wordSet = new LinkedHashSet<>();
        for (String arg : word.toLowerCase().split("")) {
            wordSet.add(arg);
        }
        HashMap<String, Integer> wordMap = new HashMap<>();
        int value = 0;
        for (String arg : wordSet) {
            wordMap.put(arg, value++);
        }
        //"0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13"
        String[] res = new String[word.length()];
        int i = 0;
        for (String key : word.toLowerCase().split("")) {
            res[i++] = String.valueOf(wordMap.get(key));
        }
        return String.join(".", res);
    }
}