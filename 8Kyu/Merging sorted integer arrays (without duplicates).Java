//Write a function that merges two sorted arrays into a single one. The arrays only contain integers.
//Also, the final outcome must be sorted and not have any duplicate.

import java.util.stream.IntStream;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
    }
}