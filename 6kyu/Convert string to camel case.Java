//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
//The first word within the output should be capitalized only if the original word was capitalized
//(known as Upper Camel Case, also often referred to as Pascal case).
//
//Examples
//"the-stealth-warrior" gets converted to "theStealthWarrior"
//"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

import java.lang.StringBuilder;

class Solution {

    static String toCamelCase(String s) {
        String[] words = null;
        if (s.indexOf("_") > 0 && s.indexOf("-") > 0) {
            String[] splitDash = s.split("-");
            words = String.join("", splitDash).split("_");
        }
        if (s.indexOf("_") > 0) {
            words = s.split("_");
        } else {
            words = s.split("-");
        }
        for (int i = 1; i < words.length; i++) {
            words[i] = toUpperFirstLetter(words[i].substring(0, 1)) + words[i].substring(1);
        }
        return String.join("", words);
    }

    static String toUpperFirstLetter(String letter) {
        char[] chars = letter.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}