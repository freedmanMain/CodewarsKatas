//Given an array of integers.
//
//Return an array, where the first element is the count of positives numbers
//and the second element is sum of negative numbers.
//
//If the input array is empty or null, return an empty array.
//
//Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

import java.util.Arrays;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        return new int[]{(int) Arrays.stream(input).filter(i -> i > 0).count(),
                Arrays.stream(input).filter(i -> i < 0).sum()};
    }
}