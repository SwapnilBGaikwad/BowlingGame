import com.thoughtworks.BowlingGame;
import com.thoughtworks.Roll;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BowlingGameTest {
    @Test
    public void returnTotalScoreOfGameAfterRolls() {
        List<Roll> rolls = new LinkedList<>();
        rolls.add( new Roll( 10 ) );
        rolls.add( new Roll( 4 ) );
        rolls.add( new Roll( 4 ) );

        rolls.add( new Roll( 3 ) );
        rolls.add( new Roll( 4 ) );

        rolls.add( new Roll( 8 ) );
        rolls.add( new Roll( 2 ) );
        rolls.add( new Roll( 6 ) );

        rolls.add( new Roll( 4 ) );
        rolls.add( new Roll( 4 ) );

        rolls.add( new Roll( 2 ) );
        rolls.add( new Roll( 6 ) );

        final BowlingGame game = new BowlingGame( rolls.toArray( new Roll[1] ) );

        int totalScore = game.totalScore();

        assertThat( totalScore, is( 57 ) );
    }
}
