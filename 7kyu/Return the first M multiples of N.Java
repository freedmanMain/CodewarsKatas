//Implement a function, multiples(m, n),
//which returns an array of the first m multiples of the real number n. Assume that m is a positive integer.
//
//Ex.
//
//multiples(3, 5.0)
//should return
//
//[5.0, 10.0, 15.0]

public class Kata {
    public static int[] multiples(int m, int n) {
        int[] arr = new int[m];
        for (int i = n, j = 0; j < arr.length; i += n, j++) {
            arr[j] = i;
        }
        return arr;
    }
}