//Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//
//Examples
//"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//""  -->  ""

public class Order {
    private final static String NUMBERS = "123456789";

    public static String order(String words) {
        if (words.isEmpty()) {
            return words;
        }
        String[] strings = words.split(" ");
        int size = strings.length;
        while (size >= 0) {
            for (int i = 0, j = 1; i < size - 1; i++, j++) {
                if (isGreatest(strings[i], strings[j])) {
                    String temporal = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temporal;
                }
            }
            size--;
        }
        return String.join(" ", strings);
    }

    private static boolean isGreatest(String arg1, String arg2) {
        if (Integer.parseInt(String.valueOf(arg1.charAt(getIndex(arg1.toCharArray())))) >
                Integer.parseInt(String.valueOf(arg2.charAt(getIndex(arg2.toCharArray()))))) {
            return true;
        }
        return false;
    }

    private static int getIndex(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (NUMBERS.indexOf(chars[i]) >= 0) {
                return i;
            }
        }
        return -1;
    }

}