package kata;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class RouletteAT {

    private final Ball ball = new Ball();

    @Test
    public void itWaitsForTheBallToStop() {
        assertTrue("Temps d'arret de la balle", ball.timeInMilliseconds);
    }

    @Test()
    public void itProvidesAResultWithColor() throws Exception {
    }

}
