//Fix the bug in Filtering method
//The method is supposed to remove even numbers from the list and return a list that contains odd number.
//
//However, there is a bug in the method that needs to be resolved.

import java.util.*;
import java.util.stream.Collectors;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
    }
}