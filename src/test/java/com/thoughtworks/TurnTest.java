package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    private Turn turn;

    @Before
    public void setUp() throws Exception {
        this.turn = new Turn();
    }

    @Test
    public void isFinishedReturnsTrueIfRollAddedWithNoScoreLessThan10() {
        turn.addRoll( 8 );
        turn.addRoll( 1 );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 9 ) );
    }

    @Test
    public void isFinishedReturnsFalseIfRollAddedWithScore10() {
        turn.addRoll( 10 );

        assertThat( turn.isFinished(), is( false ) );
        assertThat( turn.score(), is( 10 ) );
    }

    @Test
    public void isFinishedReturnsFalseIfRollAddedWithScore8And2And4() {
        turn.addRoll( 8 );
        turn.addRoll( 2 );
        turn.addRoll( 4 );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 14 ) );
    }

    @Test
    public void isFinishedReturnsFalseIfRollAddedWithScore10And2And4() {
        turn.addRoll( 10 );
        turn.addRoll( 2 );
        turn.addRoll( 4 );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 16 ) );
    }

    @Test
    public void shouldNotHaveAnyIncreaseInScoreAfterTurnCompletion() {
        turn.addRoll( 6 );
        turn.addRoll( 2 );
        turn.addRoll( 4 );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 8 ) );

    }
}