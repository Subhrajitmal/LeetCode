class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int ans = 0;
        boolean x = true;

        for(int num: nums){
            ans ^= num;
            if(num != 0){
                x = false;
            }
        }
        if(x){
            return 0;
        }
        if (ans != 0){
            return n;
        }
        return n-1;
    }   
}