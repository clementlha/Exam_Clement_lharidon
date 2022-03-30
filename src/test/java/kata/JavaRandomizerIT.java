package kata;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Random;
import static org.junit.Assert.assertTrue;

public class JavaRandomizerIT {

    public static final int UPPERLIMIT_FOR_RANDOM_37 = 38;
    private final Random random = new Random();

    private final List<String> arraylist =  Arrays.asList("1", "2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36");

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        assertTrue("Le nombre est entre 0 et 36", random.nextInt(UPPERLIMIT_FOR_RANDOM_37)>=0 && random.nextInt(UPPERLIMIT_FOR_RANDOM_37)<=36);
    }

    @Test
    public void allNumbersOccur() throws Exception {
        assertTrue("Tous les nombres sont appelés", arraylist.contains(random.nextInt(UPPERLIMIT_FOR_RANDOM_37)));
    }


}
