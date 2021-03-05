//The aim of this kata is to split a given string into different strings
//of equal size (note size of strings is passed to the method)
//
//Example:
//
//Split the below string into other strings of size #3
//
//'supercalifragilisticexpialidocious'
//
//Will return a new string
//'sup erc ali fra gil ist ice xpi ali doc iou s'
//Assumptions:
//
//String length is always greater than 0
//String has no spaces
//Size is always positive

import java.util.LinkedList;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        LinkedList<String> list = new LinkedList<>();
        while (s.length() != 0) {
            if (s.length() < partLength) {
                list.add(s);
                s = "";
            } else {
                list.add(s.substring(0, partLength));
                s = s.substring(partLength);
            }
        }
        return String.join(" ", list.toArray(new String[0]));
    }
}