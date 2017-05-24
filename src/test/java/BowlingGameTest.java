import com.thoughtworks.BowlingGame;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BowlingGameTest {
    @Test
    public void returnTotalScoreOfGameAfterRolls() {
        List<Integer> rolls = new ArrayList<>();
        rolls.add( 10 );
        rolls.add( 4 );
        rolls.add( 4 );

        rolls.add( 3 );
        rolls.add( 4 );

        rolls.add( 8 );
        rolls.add( 2 );
        rolls.add( 6 );

        rolls.add( 4 );
        rolls.add( 4 );

        rolls.add( 2 );
        rolls.add( 6 );

        int[] rollsInt = getIntArray( rolls );
        final BowlingGame game = new BowlingGame( rollsInt );

        assertThat( game.totalScore(), is( 57 ) );
    }

    private int[] getIntArray( List<Integer> rolls ) {
        int[] rollsInt = new int[rolls.size()];

        for ( int i = 0; i < rolls.size(); i++ ) {
            rollsInt[i] = rolls.get( i );
        }
        return rollsInt;
    }
}
