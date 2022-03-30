package kata;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ResultTest {
    public static final int UPPERLIMIT_FOR_RANDOM_37 = 38;
    private final Random random = new Random();
    @Test
    public void the37CorrespondsTo00() {
        assertTrue("Le nombre est égale a 0", random.nextInt(UPPERLIMIT_FOR_RANDOM_37)==0);
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        assertTrue("Le résultat est toujours entre 0 et 36", random.nextInt(UPPERLIMIT_FOR_RANDOM_37)>=0 && random.nextInt(UPPERLIMIT_FOR_RANDOM_37)<=36);
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        assertTrue("Le chiffre est de couleur verte", random.nextInt(UPPERLIMIT_FOR_RANDOM_37)==0 || random.nextInt(UPPERLIMIT_FOR_RANDOM_37) == 36);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        assertTrue("Le nombre est de couleur noir(pair)", random.nextInt(UPPERLIMIT_FOR_RANDOM_37)% 2 == 0);
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        assertTrue("Le nombre est de couleur rouge(impair)", random.nextInt(UPPERLIMIT_FOR_RANDOM_37)% 2 != 0);
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37() throws Exception {
        assertThrows("Le nombre est supérieur a 36", random.nextInt(UPPERLIMIT_FOR_RANDOM_37) > 36);

    }

    private String assertThrows(String s, boolean b) {
        return "Le nombre n'est pas dans la plage 0 à 36";
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {
        assertThrows("Le nombre est inférieur a 0", random.nextInt(UPPERLIMIT_FOR_RANDOM_37) < 0);
    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}