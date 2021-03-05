//You must implement a function that return the difference between the
//biggest and the smallest value in a list(lst) received as parameter.
//
//The list(lst) contains integers, that means it may contain some negative numbers.
//
//If the list is empty or contains a single element, return 0.
//
//The list(lst) is not sorted.
//
//maxDiff([1, 2, 3, 4]); // return 3, because 4 - 1 == 3
//maxDiff([1, 2, 3, -4]); // return 7, because 3 - (-4) == 7
//Have fun!

public class Kata {

    public static int maxDiff(int[] lst) {
        if (lst.length < 2) {
            return 0;
        }
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < lst.length; i++) {
            minValue = Math.min(minValue, lst[i]);
            maxValue = Math.max(maxValue, lst[i]);
        }

        return maxValue - minValue;
    }