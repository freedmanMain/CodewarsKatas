//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer

public class SquareDigit {
    public int squareDigits(int n) {
        String[] concatenated = String.valueOf(n).split("");
        for (int i = n, j = concatenated.length - 1; i > 0; i /= 10, j--) {
            concatenated[j] = String.valueOf((int) Math.pow(i % 10, 2));
        }
        return Integer.parseInt(String.join("", concatenated));
    }
}