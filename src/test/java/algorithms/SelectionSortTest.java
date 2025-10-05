package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {4, 3, 2, 1};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {5, 1, 3, 5, 2};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5}, arr);
    }
}
