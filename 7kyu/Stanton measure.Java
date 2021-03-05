//The Stanton measure of an array is computed as follows:
//count the number of 1s in the array. Let this count be n.
//The Stanton measure is the number of times that n appears in the array.
//
//Write a function which takes an integer array and returns its Stanton measure.
//
//Example
//The Stanton measure of [1, 4, 3, 2, 1, 2, 3, 2] is 3,
//because 1 occurs 2 times in the array and 2 occurs 3 times.

import java.util.HashMap;

public class Kata {
    public static int stantonMeasure(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(1) == key) {
                return map.get(key);
            }
        }
        return 0;
    }
}