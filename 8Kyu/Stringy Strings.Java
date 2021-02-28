//write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
//
//the string should start with a 1.
//
//a string with size 6 should return :'101010'.
//
//with size 4 should return : '1010'.
//
//with size 12 should return : '101010101010'.
//
//The size will always be positive and will only use whole numbers.

public class Kata {
    public static String stringy(int size) {
        // Your code here
        if (size % 2 == 0) {
            return evenSize(size);
        }
        return notEvenSize(size);
    }

    private static String notEvenSize(int size) {
        if (size == 1)
            return "1";
        if (size % 2 == 0)
            return new StringBuilder().append("0").toString() + notEvenSize(size - 1);
        return new StringBuilder().append("1").toString() + notEvenSize(size - 1);
    }

    private static String evenSize(int size) {
        if (size == 1)
            return "0";
        if (size % 2 == 0)
            return new StringBuilder().append("1").toString() + evenSize(size - 1);
        return new StringBuilder().append("0").toString() + evenSize(size - 1);
    }
}