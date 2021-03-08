//No Story
//
//No Description
//
//Only by Thinking and Testing
//
//Look at result of testcase, guess the code!
//
//Series
//A and B?
//Incomplete string
//True or False
//Something capitalized
//Uniq or not Uniq
//Spatiotemporal index
//Math of Primary School
//Math of Middle school
//From nothingness To nothingness
//Not perfect? Throw away!
//Welcome to take the bus
//A happy day will come
//Sum of 15(Hetu Luosliu)
//Nebula or Vortex
//Sport Star
//Falsetto Rap Concert
//Wind whispers
//Mobile phone simulator
//Join but not join
//I hate big and small
//I want to become diabetic ;-)
//How many blocks?
//Operator hidden in a string
//Substring Magic
//Report about something
//Retention and discard I
//Retention and discard II
//How many "word"?
//Hail and Waterfall
//Love Forever
//Digital swimming pool
//Archery contest
//The repair of parchment
//Who are you?
//Safe position
//Special recommendation
//Another series, innovative and interesting, medium difficulty. People who like to challenge, can try these kata:
//
//Play Tetris : Shape anastomosis
//Play FlappyBird : Advance Bravely

import java.util.LinkedHashSet;
import java.util.Arrays;

public class Kata {
    public static int[] testit(int[] a, int[] b) {
        LinkedHashSet<Integer> left = new LinkedHashSet<>();
        LinkedHashSet<Integer> right = new LinkedHashSet<>();
        for (int arg : a) left.add(arg);
        for (int arg : b) right.add(arg);
        String[] concat = (Arrays.toString(left.toArray()) + " " + Arrays.toString(right.toArray())).replace("[", "").replace("]", "").replace(",", "").split(" ");
        Arrays.sort(concat);
        int countOfEmpty = 0;
        for (String arg : concat) if (arg.isEmpty()) countOfEmpty++;
        int[] c = new int[concat.length - countOfEmpty];
        for (int i = 0, j = 0; i < concat.length; i++) {
            if (!concat[i].isEmpty()) {
                c[j] = Integer.parseInt(concat[i]);
                j++;
            }
        }
        return c;
    }
}