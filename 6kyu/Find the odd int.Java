//Given an array of integers, find the one that appears an odd number of times.
//
//There will always be only one integer that appears an odd number of times.

import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                Integer value = map.get(a[i]);
                map.put(a[i], ++value);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return key;
            }
        }
        return -1;
    }
}