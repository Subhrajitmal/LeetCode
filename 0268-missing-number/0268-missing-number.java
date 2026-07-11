class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
            for(int j=0; j<n; j++){
                if(nums[j] != j)
                return j;
            }
        return n;
    }
}