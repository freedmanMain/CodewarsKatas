//Input: Array of elements
//
//["h","o","l","a"]
//
//Output: String with comma delimited elements of the array in th same order.
//
//"h,o,l,a"

import java.util.*;

public class ArrayPrinter {

    public static String printArray(Object array[]) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(",");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}