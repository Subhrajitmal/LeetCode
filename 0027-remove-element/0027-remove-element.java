class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count]= nums[i];  //move the valid element to the front
             count++;
            }
        }
        return count;
    }
}