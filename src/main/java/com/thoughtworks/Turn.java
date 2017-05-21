package com.thoughtworks;

class Turn {
    private int score;
    private int rollsCounter;
    private int maxRolls;

    Turn() {
        this.score = 0;
        this.rollsCounter = 0;
        this.maxRolls = 2;
    }

    void addRoll( int roll ) {
        if ( ( rollsCounter + 1 ) > maxRolls ) {
            return;
        }
        score += roll;
        rollsCounter++;
        if ( rollsCounter == 2 && score >= 10 ) {
            maxRolls = 3;
        }
    }

    int score() {
        return score;
    }

    boolean isFinished() {
        return rollsCounter == maxRolls;
    }
}
