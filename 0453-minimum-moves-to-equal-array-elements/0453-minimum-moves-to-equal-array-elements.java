class Solution {
    public int minMoves(int[] nums) {
        int x = Integer.MAX_VALUE;
        for(int n: nums){
            if(n < x)
            x = n;
        }
        int moves = 0;
        for(int n: nums){
            moves += n-x;
        }
        return moves;
    }
}