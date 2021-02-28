//Count the number of divisors of a positive integer n.
//
//Random tests go up to n = 500000.
//
//Examples
//numberOfDivisors(4)  == 3 // 1, 2, 4
//numberOfDivisors(5)  == 2 // 1, 5
//numberOfDivisors(12) == 6 // 1, 2, 3, 4, 6, 12
//numberOfDivisors(30) == 8 // 1, 2, 3, 5, 6, 10, 15, 30

public class FindDivisor {

    public long numberOfDivisors(int n) {
        // TODO please write your code below this comment
        int previousNumber = n;
        int countOfDivisors = 0;
        while (previousNumber > 0) {
            if (n % previousNumber == 0) {
                countOfDivisors++;
            }
            previousNumber--;
        }
        return countOfDivisors;

    }

}