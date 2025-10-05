package metrics;

public class PerformanceTracker {
    private long comparisons = 0;
    private long swaps = 0;
    private long arrayAccesses = 0;

    public void addComparison() { comparisons++; }
    public void addSwap() { swaps++; }
    public void addAccess(int count) { arrayAccesses += count; }

    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
    public long getArrayAccesses() { return arrayAccesses; }

    public void reset() {
        comparisons = 0;
        swaps = 0;
        arrayAccesses = 0;
    }

    @Override
    public String toString() {
        return String.format("Comparisons: %d, Swaps: %d, Array accesses: %d",
                comparisons, swaps, arrayAccesses);
    }
}
