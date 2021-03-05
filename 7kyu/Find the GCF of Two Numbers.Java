//Your task here is the find the GCF (Greatest Common Factor) of
//any two numbers passed into a method, which will return one integer answer as an output.
//
//Examples:
//
//findGCF(4, 6); // Should return 2
//findGCF(93, 186); // Should return 93
//findGCF(20, 5); // Should return 5
//Here, inputs will always be natural numbers so there's no need to worry about negative values or zero.

class Kata {
    public static int findGCF(int num1, int num2) {
        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}