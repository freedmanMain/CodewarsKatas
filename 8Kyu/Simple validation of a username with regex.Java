//Write a simple regex to validate a username. Allowed characters are:
//
//lowercase letters,
//numbers,
//underscore
//Length should be between 4 and 16 characters (both included).

public class ZywOo {
    public static boolean validateUsr(String s) {
        if (s.length() < 4 || s.length() > 16) return false;
        if (s.indexOf(" ") >= 0) return false;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') return false;
            else if (Character.isUpperCase(ch)) return false;
        }
        return true;
    }
}