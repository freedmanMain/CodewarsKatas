//Complete the solution so that it reverses all of the words within the string passed in.
//
//Example:
//
//ReverseWords.reverseWords("The greatest victory is that which requires no battle");
//// should return "battle no requires which that is victory greatest The"

import java.util.Arrays;

public class ReverseWords{

 public static String reverseWords(String str){  
   return new StringBuilder().
     append(Arrays.asList(Arrays.stream(str.split(" ")).
                          map(i -> new StringBuilder(i).reverse().toString())
                          .toArray()).toString()).reverse().toString()
                          .replace("[","").replace("]","").replace(",","");
 }
}