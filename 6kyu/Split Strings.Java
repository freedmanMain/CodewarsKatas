//Complete the solution so that it splits the string into pairs of two characters.
//If the string contains an odd number of characters then it
//should replace the missing second character of the final pair with an underscore ('_').
//
//Examples:
//
//StringSplit.solution("abc") // should return {"ab", "c_"}
//StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}

public class StringSplit {
    public static String[] solution(String s) {
        String[] result = s.length() % 2 == 0 ? new String[s.length() / 2] : new String[s.length() / 2 + 1];
        int i = 0;
        while (s.length() > 0) {
            if (s.length() < 2) {
                result[i++] = s + "_";
                break;
            }
            result[i++] = s.substring(0, 2);
            s = s.substring(2);
        }
        return result;
    }
}