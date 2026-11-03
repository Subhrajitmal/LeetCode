class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = nums[0];
        for(int x: nums){
            max = Math.max(max,x);
            sum += x;
        }
        return max*n-sum;
    }
}