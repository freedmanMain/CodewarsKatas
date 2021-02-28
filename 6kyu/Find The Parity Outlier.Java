//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
//Write a method that takes the array as an argument and returns this "outlier" N.
//
//Examples
//[2, 4, 0, 100, 4, 11, 2602, 36]
//Should return: 11 (the only odd number)
//
//[160, 3, 1719, 19, 11, 13, -21]
//Should return: 160 (the only even number)

import java.util.*;

public class FindOutlier {
    static int find(int[] integers) {
        Arrays.sort(integers);
        if (isOddIntegers(integers)) {
            return findValue(integers, 1);
        }
        return findValue(integers, 0);
    }

    private static int findValue(int[] ints, int residue) {
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                if (0 + -ints[i] % 2 == residue) {
                    result = ints[i];
                    break;
                }
            }
            if (ints[i] % 2 == residue) {
                result = ints[i];
                break;
            }
        }
        return result;
    }

    private static boolean isOddIntegers(int[] integers) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                count++;
            }
        }
        return count >= 2;
    }
}