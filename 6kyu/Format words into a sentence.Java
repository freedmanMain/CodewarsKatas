//Complete the method so that it formats the words into a single comma separated value.
//The last word should be separated by the word 'and' instead of a comma.
//The method takes in an array of strings and returns a single formatted string.
//Empty string values should be ignored.
//Empty arrays or null/nil values being passed into the method should result in an empty string being returned.
//
//Kata.formatWords(new String[] {"ninja", "samurai", "ronin"}) => "ninja, samurai and ronin"
//Kata.formatWords(new String[] {"ninja", "", "ronin"}) => "ninja and ronin"
//Kata.formatWords(new String[] {}) => ""

import java.util.LinkedList;

public class Kata {

    public static String formatWords(String[] words) {
        if (words == null) return "";
        LinkedList<String> currentList = new LinkedList<>();
        for (String arg : words) if (!arg.isEmpty()) currentList.add(arg);
        if (currentList.isEmpty()) return "";
        if (currentList.size() == 1)
            return currentList.get(0);
        if (currentList.size() == 2)
            return currentList.get(0) + " and " + currentList.get(1);
        String result = "";
        String penultimate = currentList.get(currentList.size() - 2);
        String[] newWords = new String[currentList.size()];
        int i = 0;
        while (currentList.size() > 1) {
            result = currentList.get(0);
            if (result.equals(penultimate)) {
                newWords[i++] = result + " and";
                currentList.remove(result);
                continue;
            }
            newWords[i++] = result + ",";
            currentList.remove(result);
        }
        newWords[newWords.length - 1] = currentList.get(0);
        return String.join(" ", newWords);
    }

}