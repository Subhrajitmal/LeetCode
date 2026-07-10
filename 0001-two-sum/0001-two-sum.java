class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int j=0; j<nums.length-1; j++){
        for(int i=j+1; i<nums.length; i++){
            if(nums[i]+nums[j] == target){
               int[] result= {j,i}; //basiccaly we create a new array where we store the indices;
               return result; 
            }
        }
        }
        return null; //if the there is no values that satisfied the target the it return null;
    }
}