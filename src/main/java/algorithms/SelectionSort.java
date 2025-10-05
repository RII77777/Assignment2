package algorithms;

import metrics.PerformanceTracker;

public class SelectionSort {

    public static void sort(int[] arr, PerformanceTracker tracker) {
        int n = arr.length;
        boolean sorted;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            sorted = true;

            for (int j = i + 1; j < n; j++) {
                tracker.addComparison();
                tracker.addAccess(2);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    sorted = false;
                }
            }

            if (minIndex != i) {
                swap(arr, i, minIndex, tracker);
            }

            if (sorted) break;
        }
    }

    private static void swap(int[] arr, int i, int j, PerformanceTracker tracker) {
        tracker.addSwap();
        tracker.addAccess(4);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
