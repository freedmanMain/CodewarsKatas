//Print all numbers up to 3rd parameter which are multiple of both 1st and 2nd parameter.
//
//Python, Javascript, Java, Ruby versions: return results in a list/array
//
//NOTICE:
//
//Do NOT worry about checking zeros or negative values.
//To find out if 3rd parameter (the upper limit) is inclusive or not, check the tests, it differs in each translation

import java.util.*;

public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = s3 - 1; i > 0; i--) {
            if (i % s1 == 0 && i % s2 == 0) {
                arr.add(i);
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}