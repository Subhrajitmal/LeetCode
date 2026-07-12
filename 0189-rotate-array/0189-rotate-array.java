class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0){
            return;
        }
       int n = nums.length;
       int arr[] = new int[n];
       for(int i=0; i<nums.length; i++){
        arr[(i+k)%n] = nums[i];
       } 
      System.arraycopy(arr,0, nums,0,n);
       return;
    }
}