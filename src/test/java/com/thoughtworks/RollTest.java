package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RollTest {
    @Test
    public void returnIsStripTrueIfRollHasScoreOf10() {
        final Roll roll = new Roll( 10 );

        boolean isStripe = roll.isStripe();

        assertThat( isStripe, is( true ) );
    }

    @Test
    public void returnIsStripFalseIfRollHasScoreLessThan10() {
        final Roll roll = new Roll( 8 );

        boolean isStripe = roll.isStripe();

        assertThat( isStripe, is( false ) );
    }
}