//In this Kata, you will be given an array of strings and your task is
//to remove all consecutive duplicate letters from each string in the array.
//
//For example:
//
//dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
//
//dup(["kelless","keenness"]) = ["keles","kenes"].
//
//Strings will be lowercase only, no spaces. See test cases for more examples.
//
//Good luck!
//
//If you like this Kata, please try:
//
//Alternate capitalization
//
//Vowel consonant lexicon

class Solution {
    public static String[] dup(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String currentStr = arr[i];
            String validStr = "";
            while (currentStr.length() > 0) {
                int countOfDup = 0;
                String[] letters = currentStr.split("");
                validStr += letters[0];
                for (int j = 0; ; j++)
                    if (j < letters.length && letters[0].equals(letters[j])) countOfDup++;
                    else break;
                currentStr = currentStr.substring(countOfDup);
            }
            arr[i] = validStr;
        }
        return arr;
    }
}