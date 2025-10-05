InsertionSort implementation and benchmark were developed collaboratively with Akbota Bekturgan.

1. Algorithm Overview

The provided implementation is an optimized version of the Insertion Sort algorithm.
Insertion Sort iterates through the array and places each element in its correct position relative to the already sorted part.
It performs efficiently on small or nearly sorted datasets but has quadratic performance on large or random inputs.
The implementation also includes an early stop optimization to handle nearly sorted arrays more efficiently.

2. Complexity Analysis

Time Complexity:

Best Case (Ω(n)) – occurs when the array is already sorted; only one comparison per iteration.

Average Case (Θ(n²)) – roughly half of the elements are shifted each time.

Worst Case (O(n²)) – occurs for reverse-sorted arrays; maximum number of comparisons and shifts.

Space Complexity:
The algorithm is in-place, using O(1) additional space for variables (key, i, j).
No extra arrays or data structures are used.

Recurrence Relation:
T(n) = T(n–1) + O(n) → T(n) = O(n²)

3. Code Review and Optimization

Strengths:

Code is clean, well-structured, and follows Java conventions.

The resetMetrics, getComparisons, and getSwaps methods provide clear metric tracking.

The early exit in the while loop improves runtime for nearly sorted data.

Possible Improvements:

PerformanceTracker is not used inside the algorithm. Integrating it could unify benchmarking.

For large arrays, hybridization with Binary Insertion Sort or switching to Merge Sort for big n could reduce time complexity.

Adding a configurable comparison counter could make benchmarking more flexible.

CSVExporter could include timestamps or system info for reproducibility.

Code Quality:
Readable variable names, consistent style, and good commenting. Minimal redundancy.

4. Empirical Results (Expected)

(If you didn’t run the benchmark, you can leave this as a theoretical section)

Input Size (n)	Expected Time Complexity	Relative Performance
100	~ O(n²) but very fast	~0.1 ms
1 000	O(n²)	~2–3 ms
10 000	O(n²)	~200–300 ms

The measured results are expected to grow quadratically with input size.
For nearly sorted arrays, execution time should decrease noticeably due to the early exit optimization.

5. Conclusion

The partner’s implementation of Insertion Sort is correct, efficient for small and semi-sorted datasets, and demonstrates clear metric tracking.
Potential improvements include integrating the PerformanceTracker, testing scalability on larger datasets, and considering hybrid sorting strategies.
Overall, the code is logically structured and well-suited for benchmarking and educational purposes.

