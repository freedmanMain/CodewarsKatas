//Introduction
//The wave (known as the Mexican wave in the English-speaking world outside North America)
//is an example of metachronal rhythm achieved in a packed stadium when successive groups of
//spectators briefly stand, yell, and raise their arms. Immediately upon stretching to full
//height, the spectator returns to the usual seated position.
//
//The result is a wave of standing spectators that travels through the crowd, even though
//individual spectators never move away from their seats. In many large arenas the crowd
//is seated in a contiguous circuit all the way around the sport field, and so the wave
//is able to travel continuously around the arena; in discontiguous seating arrangements,
//the wave can instead reflect back and forth through the crowd.
//When the gap in seating is narrow, the wave can sometimes pass through it.
//Usually only one wave crest will be present at any given time in an arena,
//although simultaneous, counter-rotating waves have been produced. (Source Wikipedia)
//Task
//In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
//You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
//Rules
// 1.  The input string will always be lower case but maybe empty.
//
// 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
//Example
//wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
//Good luck and enjoy!
//
//Kata Series
//If you enjoyed this, then please try one of my other Katas. Any feedback,
//translations and grading of beta Katas are greatly appreciated. Thank you.
//
//Rank
//Maze Runner
//
//Rank
//Scooby Doo Puzzle
//
//Rank
//Driving License
//
//Rank
//Connect 4
//
//Rank
//Vending Machine
//
//Rank
//Snakes and Ladders
//
//Rank
//Mastermind
//
//Rank
//Guess Who?
//
//Rank
//Am I safe to drive?
//
//Rank
//Mexican Wave
//
//Rank
//Pigs in a Pen
//
//Rank
//Hungry Hippos
//
//Rank
//Plenty of Fish in the Pond
//
//Rank
//Fruit Machine
//
//Rank
//Car Park Escape

import java.util.LinkedList;

public class MexicanWave {

    public static String[] wave(String str) {
        String[] result = new String[str.length()];
        for (int i = 0; i < result.length; i++) {
            String[] split = str.split("");
            String add = "";
            for (int j = 0; j < split.length; j++) {
                if (i == j && split[j].equals(" ")) {
                    add = " ";
                    break;
                } else if (i == j && split[j] != " ") {
                    add += split[j].toUpperCase();
                } else {
                    add += split[j];
                }
            }
            result[i] = add;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals(" ")) {
                linkedList.add(result[i]);
            }
        }
        result = new String[linkedList.size()];
        int k = 0;
        for (String arg : linkedList) {
            result[k++] = arg;
        }
        return result;
    }
}
    