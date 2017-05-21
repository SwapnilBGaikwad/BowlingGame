package com.thoughtworks;

/**
 * Roll represents single roll in Bowling game.
 */
public class Roll {
    private final int score;

    public Roll( int score ) {
        this.score = score;
    }

    boolean isStripe() {
        return score == 10;
    }

    public int getScore() {
        return score;
    }
}
