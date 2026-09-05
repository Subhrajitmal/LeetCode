class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==0) return -1;
        int[] x = new int[n];
        x[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            x[i] = Math.min(nums[i], x[i+1]);
        }
        int y = nums[0];
        for(int i=0;i<n; i++){
            y = Math.max(y,nums[i]);
            int z = y-x[i];
            if(z <= k){
                return i;
            }
        }
        return -1;
    }
}