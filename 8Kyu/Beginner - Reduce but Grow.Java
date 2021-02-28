//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
//[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

public class Kata {

    public static int grow(int[] x) {

        if (x.length == 0) {
            return 0;
        }
        int mult = 1;
        for (int number : x
        ) {
            mult *= number;
        }
        return mult;

    }

}