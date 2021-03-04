//This time no story, no theory. The examples below show you how to write function accum:
//
//Examples:
//
//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
//The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {

    public static String accum(String s) {
        String[] split = s.toUpperCase().split("");
        for (int i = 1; i < split.length; i++) {
            String letter = split[i].toLowerCase();
            for (int j = 0; j < i; j++) {
                split[i] += letter;
            }
        }
        return String.join("-", split);
    }
}