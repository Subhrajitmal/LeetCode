import java.util.Arrays;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);
        
        int minSumOfLengths = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            currentWindowSum += arr[right]; 
            while (currentWindowSum > target) {
                currentWindowSum -= arr[left];
                left++;
            }
            if (currentWindowSum == target) {
                int currentLength = right - left + 1;
                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    minSumOfLengths = Math.min(minSumOfLengths, best[left - 1] + currentLength);
                }
                best[right] = currentLength;
            }         
            if (right > 0) {
                best[right] = Math.min(best[right], best[right - 1]);
            }
        }     
        return minSumOfLengths == Integer.MAX_VALUE ? -1 : minSumOfLengths;
    }
}
