package enums;

import java.util.Random;

public class RPS {

    private Random rand = new Random();

    public void rockPaperScissors(Game call) {
        int num = this.rand.nextInt(3);
        Game actual = null;
        if (num == 1) actual = Game.ROCK;
        else if (num == 2) actual = Game.PAPER;
        else actual = Game.SCISSORS;

        System.out.println(" You called " + call);
        System.out.println(" And it was " + actual);
        if (call == actual) System.out.println("You Draw");
        else if (call == Game.PAPER) {
            if (actual == Game.SCISSORS) System.out.println("You Lose");
            else System.out.println("You Win");
        } else if (call == Game.ROCK) {
            if (actual == Game.SCISSORS) System.out.println("You Win");
            else System.out.println("You Lose");
        } else if (call == Game.SCISSORS) {
            if (actual == Game.ROCK) System.out.println("You Lose");
            else System.out.println("You Win");
        }

    }

}
