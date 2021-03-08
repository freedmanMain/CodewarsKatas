//Convert number to reversed array of digits
//Given a random non-negative number, you
//have to return the digits of this number within an array in reverse order.
//
//Example:
//348597 => [7,9,5,8,4,3]

public class Kata {
    public static int[] digitize(long n) {
        int[] arr = new int[String.valueOf(n).length()];
        int i = 0;
        for (String digit : new StringBuilder().append(n).reverse().toString().split(""))
            arr[i++] = Integer.parseInt(digit);
        return arr;
    }
}