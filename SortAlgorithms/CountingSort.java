package SortAlgorithms;

import java.time.Duration;
import java.time.Instant;

public class CountingSort {

    public Integer[] Sort(){
        return new Integer[0];
    }

    public Integer TimedSort() {
        Instant start = Instant.now();
        this.Sort();
        Instant end = Instant.now();
        return Duration.between(start, end).getNano();
    }


    public int getMax(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }


    public void countingSort(int[] array, int maxNumber) {
        int[] counts = new int[maxNumber + 1];
        for (int i = 0; i < array.length; i++) {
            counts[array[i]]++;
        }
        int current = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                array[current] = i;
                current++;
            }
        }

    }



}


