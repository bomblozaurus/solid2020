import org.junit.Test;
import pl.zzpj2020.cleancode.NumberCounter;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberCounterTest {
    @Test
    public void shouldReturnZeroForNotAddedNumber() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        NumberCounter numberCounter = new NumberCounter(numbers);

        final int expectedOccurrencesOfZero = 0;
        int occurrencesOfZero = numberCounter.getOccurrences(0);

        assertEquals(expectedOccurrencesOfZero, occurrencesOfZero);
    }

    @Test
    public void shouldReturnTwoForEachNumberTested() {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3);
        NumberCounter numberCounter = new NumberCounter(numbers);

        final int occurrencesOf1 = numberCounter.getOccurrences(1);
        final int occurrencesOf2 = numberCounter.getOccurrences(2);
        final int occurrencesOf3 = numberCounter.getOccurrences(3);

        final int expectedOccurrences = 2;

        assertEquals(expectedOccurrences, occurrencesOf1);
        assertEquals(expectedOccurrences, occurrencesOf2);
        assertEquals(expectedOccurrences, occurrencesOf3);
    }

    @Test
    public void shouldSetMaxValueTo5() {
        List<Integer> numbers = List.of(-1, 1, 5, 2, 3, -6);
        NumberCounter numberCounter = new NumberCounter(numbers);

        int maxValue = numberCounter.getMaxValue();
        final int expectedMaxValue = 5;

        assertEquals(expectedMaxValue, maxValue);
    }

    @Test
    public void shouldSetMinValueTo10() {
        List<Integer> numbers = List.of(10, 11, 12, 13, 120);
        NumberCounter numberCounter = new NumberCounter(numbers);

        int minValue = numberCounter.getMinValue();
        final int expectedMaxValue = 10;

        assertEquals(expectedMaxValue, minValue);
    }

    @Test
    public void calculateMean() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        NumberCounter numberCounter = new NumberCounter(numbers);

        final double expectedMean = 4.5;
        assertEquals(expectedMean, numberCounter.calculateMeanValue(), 0.02);
    }


}