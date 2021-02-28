//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

public class Solution {

    public int solution(int number) {
        //TODO: Code stuff here
        if (number <= 0) {
            return 0;
        }
        int sum = 0;
        while (number > 1) {
            number--;
            if (number % 3 == 0 && number % 5 == 0) {
                sum += number;
                continue;
            }
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}