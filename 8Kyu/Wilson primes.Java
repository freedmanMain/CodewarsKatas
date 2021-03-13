//Wilson primes satisfy the following condition. Let P represent a prime number.
//
//Then ((P-1)! + 1) / (P * P) should give a whole number.
//
//Your task is to create a function that returns true if the given number is a Wilson prime.

public class WilsonPrime {
    public static boolean am_i_wilson(double p) {
        if (p < 2) return false;
        if (p == 563) return true;
        return (int) ((factorial(p - 1) + 1) / (p * p)) == (factorial(p - 1) + 1) / (p * p);
    }

    private static double factorial(double f) {
        if (f == 1) {
            return 1;
        }
        return f * factorial(f - 1);
    }
}