//Rock Paper Scissors
//Let's play! You have to return which player won! In case of a draw return Draw!.
//
//Examples:
//
//rps('scissors','paper') // Player 1 won!
//rps('scissors','rock') // Player 2 won!
//rps('paper','paper') // Draw!
//rockpaperscissors

import java.util.*;

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1 == p2) return "Draw!";
        HashMap<String, String> rules = new HashMap<>();
        rules.put("scissors", "paper");
        rules.put("paper", "rock");
        rules.put("rock", "scissors");
        return rules.get(p1) == p2 ? "Player 1 won!" : "Player 2 won!";
    }
}