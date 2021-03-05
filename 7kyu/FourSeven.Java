//Four Seven
//Simple kata, simple rules: your function should accept the inputs 4 and 7.
//If 4 is entered, the function should return 7. If 7 is entered, the function should return 4.
//
//Anything else entered as input should return 0.
//There's only one catch, your function cannot include if statements, switch statements, or the ternary operator.
//
//There are some very simple ways of answering this problem, but I encourage you to try and be as creative as possible.
//
//Good Luck!

public class Kata {
    public static int fourSeven(int n) {
        while (n == 4) return 7;
        while (n == 7) return 4;
        return 0;
    }
}