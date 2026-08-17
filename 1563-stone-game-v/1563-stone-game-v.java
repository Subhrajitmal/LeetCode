import java.util.Arrays;

class Solution {
    private int[][] cache;
    private int[] totalValues;

    public int stoneGameV(int[] stones) {
        int count = stones.length;
        cache = new int[count][count];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }

        totalValues = new int[count + 1];
        for (int idx = 0; idx < count; idx++) {
            totalValues[idx + 1] = totalValues[idx] + stones[idx];
        }

        return findMaxScore(0, count - 1);
    }

    private int findMaxScore(int start, int end) {
        if (start == end) {
            return 0;
        }

        if (cache[start][end] != -1) {
            return cache[start][end];
        }

        int highest = 0;

        for (int split = start; split < end; split++) {
            int leftGroup = totalValues[split + 1] - totalValues[start];
            int rightGroup = totalValues[end + 1] - totalValues[split + 1];

            if (leftGroup < rightGroup) {
                highest = Math.max(highest, leftGroup + findMaxScore(start, split));
            } else if (leftGroup > rightGroup) {
                highest = Math.max(highest, rightGroup + findMaxScore(split + 1, end));
            } else {
                int pickLeft = leftGroup + findMaxScore(start, split);
                int pickRight = rightGroup + findMaxScore(split + 1, end);
                highest = Math.max(highest, Math.max(pickLeft, pickRight));
            }
        }

        return cache[start][end] = highest;
    }
}
