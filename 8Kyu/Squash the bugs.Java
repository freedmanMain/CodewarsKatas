//Simple challenge - eliminate all bugs from the supplied code so that the code runs
//and outputs the expected value. Output should be the length of the longest word, as a number.
//
//There will only be one 'longest' word.

import java.util.Arrays;

public class Kata {

    public static int findLongest(final String str) {
        return Arrays.asList(str.split(" ")).stream().mapToInt(i -> i.length()).max().getAsInt();
    }
}