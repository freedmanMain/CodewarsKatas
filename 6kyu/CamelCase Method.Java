//Write simple .camelCase method (camel_case function in PHP, CamelCase
//in C# or camelCase in Java) for strings.
//All words must have their first letter capitalized without spaces.
//
//For instance:
//
//camelCase("hello case"); // => "HelloCase"
//camelCase("camel case word"); // => "CamelCaseWord"
//Don't forget to rate this kata! Thanks :)

public class Solution {

    public static String camelCase(String str) {             
      if (str.isEmpty()) return "";  
      String current = "";    
      String result = "";
      for (String item : str.strip().split("")) {
        if (item.equals(" ") && !current.equals("")) {
          result += current.substring(0 , 1).toUpperCase() + current.substring(1).toLowerCase();
          current = ""; 
        }    
        else if (!item.equals(" ")) current += item;  
        else continue;  
      }       
      return result + current.substring(0, 1).toUpperCase() + current.substring(1);
    }
}