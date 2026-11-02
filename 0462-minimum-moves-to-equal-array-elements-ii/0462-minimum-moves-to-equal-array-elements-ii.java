class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = nums[n/2];
        int moves = 0;
        for(int x: nums){
        moves += Math.abs(x - mid);
        }
        return moves;
    }
}