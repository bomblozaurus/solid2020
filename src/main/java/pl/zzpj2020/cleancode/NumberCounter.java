package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberCounter {

    Map<Integer, Integer> numberOccurrences = new HashMap<>();
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;

    public NumberCounter(List<Integer> i1) {
        countAllOccurrences(i1);
    }

    public void countAllOccurrences(List<Integer> numbers) {
        for (Integer number : numbers) {
            countOccurrences(number);
        }
    }

    private void countOccurrences(Integer number) {
        if (numberOccurrences.containsKey(number)) {
            Integer currentOccurrencesCounter = numberOccurrences.get(number);
            numberOccurrences.put(number, currentOccurrencesCounter + 1);
        } else {
            numberOccurrences.put(number, 1);
        }

        recalculateMinValue(number);
        recalculateMaxValue(number);
    }

    public int getOccurrences(int number) {
        return numberOccurrences.getOrDefault(number, 0);
    }

    private void recalculateMaxValue(Integer value) {
        if (value > maxValue) {
            maxValue = value;
        }
    }

    private void recalculateMinValue(Integer value) {
        if (value < minValue) {
            minValue = value;
        }
    }

    public double calculateMeanValue() {
        double sum = 0;
        double numberOfNumbers = 0;

        for (Map.Entry<Integer, Integer> entry : numberOccurrences.entrySet()) {
            numberOfNumbers += entry.getValue();
            sum += entry.getKey() * entry.getValue();
        }
        return sum / numberOfNumbers;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }
}