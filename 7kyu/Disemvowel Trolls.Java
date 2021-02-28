//Trolls are attacking your comment section!
//
//A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//Note: for this kata y isn't considered a vowel.

public class Troll {
    private static final String SEPARATOR = "[A]AEIOUaeiou";

    public static String disemvowel(String str) {
        String[] letters = str.split("");
        for (int i = 0; i < letters.length; i++) {
            if (SEPARATOR.indexOf(letters[i]) > 0) {
                str = str.replace(letters[i], "");
            }
        }
        return str;
    }
}
