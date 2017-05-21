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
        Roll roll = new Roll( 8 );
        turn.addRoll( roll );
        roll = new Roll( 1 );
        turn.addRoll( roll );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 9 ) );
    }

    @Test
    public void isFinishedReturnsFalseIfRollAddedWithScore10() {
        Roll roll = new Roll( 10 );
        turn.addRoll( roll );

        assertThat( turn.isFinished(), is( false ) );
        assertThat( turn.score(), is( 10 ) );
    }

    @Test
    public void isFinishedReturnsFalseIfRollAddedWithScore8And2And4() {
        Roll roll = new Roll( 8 );
        turn.addRoll( roll );
        roll = new Roll( 2 );
        turn.addRoll( roll );
        roll = new Roll( 4 );
        turn.addRoll( roll );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 14 ) );
    }

    @Test
    public void isFinishedReturnsFalseIfRollAddedWithScore10And2And4() {
        Roll roll = new Roll( 10 );
        turn.addRoll( roll );
        roll = new Roll( 2 );
        turn.addRoll( roll );
        roll = new Roll( 4 );
        turn.addRoll( roll );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 16 ) );
    }

    @Test
    public void shouldNotHaveAnyIncreaseInScoreAfterTurnCompletion() {
        Roll roll = new Roll( 6 );
        turn.addRoll( roll );
        roll = new Roll( 2 );
        turn.addRoll( roll );
        roll = new Roll( 4 );
        turn.addRoll( roll );

        assertThat( turn.isFinished(), is( true ) );
        assertThat( turn.score(), is( 8 ) );

    }
}