import java.util.Collection;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String KHONG = "khong";
    private static final String MOT = "mot";
    private static final String HAI = "hai";
    private static final String BON = "bon";
    private static final String SAU = "sau";
    private static final String BAY = "bay";
    private static final String TAM = "tam";
    private static final String CHIN = "chin";

    private int number;
    private String result;

    public FizzBuzzTest(int number, String result) {
        this.number = number;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{3, FIZZ},
                {5, BUZZ}, {35, FIZZ + BUZZ},
                {1, MOT},
                {2, HAI},
                {4, BON},
                {6, SAU},
                {7, BAY},
                {8, TAM},
                {9, CHIN},
                {0, KHONG},
                {13, MOT + FIZZ},
                {31, FIZZ + MOT},
                {25, HAI + BUZZ},
                {52, BUZZ + HAI},});
    }

    @Test
    public void test() {
        assertEquals(FizzBuzz.fizzBuzz(number), result);
    }
}