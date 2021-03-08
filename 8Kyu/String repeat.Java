//Write a function called repeat_str which repeats the given string src exactly count times.
//
//repeatStr(6, "I") // "IIIIII"
//repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      
      String res = "";
      for (int i = 0; i < repeat; i++) res += string;
      return res;
    }
}