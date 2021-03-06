//The goal of this exercise is to convert a string to a new string where each character
//in the new string is "(" if that character appears only once in the original string, or ")"
//if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//Examples
//"din"      =>  "((("
//"recede"   =>  "()()()"
//"Success"  =>  ")())())"
//"(( @"     =>  "))(("
//Notes
//
//Assertion messages may be unclear about what they display in some languages.
//If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!

import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (char ch : word.toLowerCase().toCharArray()) chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        String res = "";
        for (char ch : word.toLowerCase().toCharArray()) res += chars.get(ch) == 1 ? "(" : ")";
        return res;
    }
}