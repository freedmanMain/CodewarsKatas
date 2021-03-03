//You probably know that some characters written on a piece of paper, after turning this sheet 180 degrees,
//can be read, although somitimes in a different way. So, uppercase letters "H", "I", "N", "O", "S", "X", "Z"
//after rotation are not changed, the letter "M" becomes a "W", and Vice versa, the letter "W" becomes a "M".
//
//We will call a word "shifter" if it consists only of these letters. After turning the sheet, this word can also be read,
//although in a different way. So, the word "WOW "turns into the word "MOM". On the other hand, the word "HOME" is not a shifter.
//
//Find the number of unique shifter words in the input string (without duplicates). String contains only uppercase letters and digits.
//
//Examples
//Shifter.count("SOS IN THE HOME") == 2 // shifter words are "SOS" and "IN"
//Shifter.count("WHO IS SHIFTER AND WHO IS NO") == 3 // shifter words are "WHO", "IS", "NO"
//Shifter.count("TASK") == 0 // no shifter words
//Shifter.count("") == 0 // no shifter words in empty string

import java.util.*;

public class Shifter {

    public static int count(String st) {
        Set<String> set = new HashSet<>();
        for (String word : st.split(" ")) {
            String shifter = "";
            for (String letter : word.split("")) {
                if ("HINOSXZWM".indexOf(letter) >= 0) {
                    shifter += letter;
                }
            }
            if (word.length() == shifter.length() && !shifter.isEmpty()) {
                set.add(shifter);
            }
        }
        return set.size();
    }
}