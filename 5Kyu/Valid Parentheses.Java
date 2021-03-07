//Write a function that takes a string of parentheses, and determines if
//the order of the parentheses is valid.
//The function should return true if the string is valid, and false if it's invalid.
//
//Examples
//"()"              =>  true
//")(()))"          =>  false
//"("               =>  false
//"(())((()())())"  =>  true
//Constraints
//0 <= input.length <= 100
//
//Along with opening (() and closing ()) parenthesis,
//input may contain any valid ASCII characters.
//Furthermore, the input string may be empty and/or not contain any parentheses at all.
//Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).

public class Solution {
    public static boolean validParentheses(String parens) {
        for (int i = 32; i < 127; i++)
            if ("()".indexOf((char) i) < 0)
                parens = parens.replace(String.valueOf((char) i), "");
        while (!parens.isEmpty()) {
            parens = parens.replace("()", "");
            if (parens.indexOf("()") < 0) break;
        }
        return parens.equals("");
    }
}