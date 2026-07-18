class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int sum =0;
     for(int i=0; i<k; i++){  //create the 1st window;
     sum += nums[i];
     }   
     int maxSum = sum;   //declare maxSum as sum
    for(int j=k; j<nums.length; j++){
        sum = sum-nums[j-k]+nums[j];  //leftelement is nums[j-k] and the rightelement is nums[j];
        if(sum > maxSum){
            maxSum = sum;
        }
    }
    double ans = (double)maxSum/k;
    return ans;
}
}