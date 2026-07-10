class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        for(int num:nums){
            sum += num;
        }
        for(int i=0; i<nums.length; i++){
            int currentvalue = nums[i];
        int rightsum= sum-leftsum - currentvalue;
        if(rightsum == leftsum){
        return i;
        }
        leftsum += currentvalue;            
        }
     return -1;
    }
}