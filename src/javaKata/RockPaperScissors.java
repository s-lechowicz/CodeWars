package javaKata;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        // P1 or P2
        boolean hasP1Won = (p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"));
        // Result
        return p1.equals(p2) ? "Draw!" : hasP1Won ? "Player 1 won!" : "Player 2 won!";
    }
}
