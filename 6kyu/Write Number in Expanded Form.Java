//Write Number in Expanded Form
//You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//Kata.expandedForm(12); # Should return "10 + 2"
//Kata.expandedForm(42); # Should return "40 + 2"
//Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//NOTE: All numbers will be whole numbers greater than 0.
//
//If you liked this kata, check out part 2!!

public class Kata {
    public static String expandedForm(int num) {
        String result = "";
        while (num > 0) {
            int countOfDigits = 0;
            int current = num;
            for (int i = current; current > 0; current /= 10) countOfDigits++;
            String first = String.valueOf(num).substring(0, 1);
            for (int i = 0; i < countOfDigits - 1; i++) {
                first += 0;
            }
            result += first + " + ";
            num -= Integer.parseInt(first);

        }
        return result.substring(0, result.length() - 3);
    }
}