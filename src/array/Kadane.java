package array;

/**
 * Kadane's algorithm to find subarray with maximum sum
 */
public class Kadane {
    public int maxSubarray(int[] arr) {
        int runningSum = 0;
        int max = 0;

        for(int num : arr) {
            runningSum += num;
            max = Math.max(max, runningSum);
            runningSum = Math.max(runningSum, 0);
        }

        return max;
    }
}
