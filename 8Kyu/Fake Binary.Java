//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replace('1', '0').replace('2', '0').replace('3', '0')
                .replace('4', '0').replace('5', '1').replace('6', '1')
                .replace('7', '1').replace('8', '1').replace('9', '1');
    }
}