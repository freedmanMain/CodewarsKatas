//#Find the missing letter
//
//Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
//
//You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
//The array will always contain letters in only one case.
//
//Example:
//
//['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
//
//["a","b","c","d","f"] -> "e"
//["O","Q","R","S"] -> "P"
//(Use the English alphabet with 26 letters!)
//
//Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//I have also created other katas. Take a look if you enjoyed this kata!

public class Kata
{
        private static final String ALPHABET 
          = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static char findMissingLetter(char[] array) {
            String validSentence =
                    ALPHABET.substring(ALPHABET.indexOf(String.valueOf(array[0])),
                            ALPHABET.lastIndexOf(String.valueOf(array[array.length - 1])) + 1);
            for (char letter : array) {
                validSentence = validSentence.replace(String.valueOf(letter),"");
            }
            return validSentence.charAt(0);
        }
}