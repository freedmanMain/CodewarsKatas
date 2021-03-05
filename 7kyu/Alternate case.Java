//Write function alternateCase which switch every letter in string from
//upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD

class Kata {
    static String alternateCase(final String string) {
        char[] result = new char[string.toCharArray().length];
        int i = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result[i++] = Character.toLowerCase(ch);
            } else {
                result[i++] = Character.toUpperCase(ch);
            }
        }
        return new String(result);
    }
}