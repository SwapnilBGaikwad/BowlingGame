package com.thoughtworks;
 
import java.util.LinkedList;
import java.util.List;

public class BowlingGame {
    private final int[] rolls;

    public BowlingGame( int... rolls ) {
        this.rolls = rolls;
    }

    public int totalScore() {
        final List<Turn> turns = new LinkedList<>();
        Turn turn = new Turn();
        for ( int roll : rolls ) {
            turn.addRoll( roll );
            if ( turn.isFinished() ) {
                turns.add( turn );
                turn = new Turn();
            }
        }
        return turns.stream().mapToInt( Turn::score ).sum();
    }
}
