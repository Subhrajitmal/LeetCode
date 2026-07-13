class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[j] == 0){
                arr[i]= 0;
            }else{
                arr[i] = nums[j];
            }
            j++;
        }
        Arrays.sort(nums);
        return;
    }
}