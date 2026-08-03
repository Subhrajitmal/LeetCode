class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        long[] ans = new long[n+1];

        for(int i=n-1; i>=0; i--){
            ans[i] = Long.MIN_VALUE;
            long t = 0;
            for (int k = 0; k < 3 && i + k < n; k++) {
                t += stoneValue[i + k];
                ans[i] = Math.max(ans[i], t - ans[i + k + 1]);
            }
        }
        if(ans[0] > 0) return "Alice";
        if(ans[0] < 0) return "Bob";
        return "Tie";
    }
}