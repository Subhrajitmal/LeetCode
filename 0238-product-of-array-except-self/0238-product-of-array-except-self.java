class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int lproduct = 1;
        int rproduct = 1;
        for(int i=0; i<n; i++){
          arr[i] = lproduct;
          lproduct *= nums[i];
        }
        for(int i=n-1; i>=0; i--){
        arr[i] *= rproduct;
        rproduct *= nums[i];
        }
        return arr;
    }
}