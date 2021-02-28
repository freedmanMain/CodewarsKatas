//Write a function that can return the smallest value of an array or the index of that value.
//The function's 2nd parameter will tell whether it should return the value or the index.
//
//Assume the first parameter will always be an array filled with at least 1 number and no duplicates.
//Assume the second parameter will be a string holding one of two values: 'value' and 'index'.
//
//Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
//Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0

public class Arrays {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        int min = numbers[0];
        int minIndex = 0;
        switch (toReturn) {
            case "value":
                for (int i = 0; i < numbers.length; i++) {
                    min = Math.min(min, numbers[i]);
                }
                return min;

            case "index":
                for (int i = 0; i < numbers.length; i++) {
                    if (min > numbers[i]) {
                        min = numbers[i];
                        minIndex = i;
                    }
                }
                return minIndex;
        }
        return 0;
    }
}