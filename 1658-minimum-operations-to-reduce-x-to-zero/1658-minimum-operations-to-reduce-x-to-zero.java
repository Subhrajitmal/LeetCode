class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum = 0;
        for(int num:nums){
            totalsum += num;
        }
        int target = totalsum - x;

        if(target < 0){
            return -1;
        }
        int left = 0;
        int sum = 0;
        int maxlen = -1;
        for(int r= 0; r<nums.length; r++){
            sum += nums[r];
            while(sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                maxlen = Math.max(maxlen, r-left+1);
            }
            }
            if(maxlen == -1){
                return -1;
        }
        return nums.length-maxlen;
    }
}