//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
//Essentially, rearrange the digits to create the highest possible number.
//
//Examples:
//Input: 42145 Output: 54421
//
//Input: 145263 Output: 654321
//
//Input: 123456789 Output: 987654321

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] arr = new int[String.valueOf(num).length()];
        int i = 0;
        for (String n : String.valueOf(num).split("")) {
            arr[i++] = Integer.parseInt(n);
        }
        Arrays.sort(arr);
        return Integer.parseInt(new StringBuilder().append(Arrays.toString(arr)).reverse().toString().
                replace("[", "").
                replace("]", "").
                replace(",", "").
                replace(" ", ""));
    }
}