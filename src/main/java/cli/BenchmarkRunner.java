package cli;

import algorithms.SelectionSort;
import metrics.PerformanceTracker;

import java.util.Arrays;
import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        Random rand = new Random();
        PerformanceTracker tracker = new PerformanceTracker();

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = rand.nextInt(size * 10);

            int[] copy = Arrays.copyOf(arr, arr.length);

            tracker.reset();
            long start = System.nanoTime();
            SelectionSort.sort(copy, tracker);
            long end = System.nanoTime();

            System.out.printf("n=%d | Time=%.3f ms | %s%n",
                    size, (end - start) / 1_000_000.0, tracker.toString());
        }
    }
}
