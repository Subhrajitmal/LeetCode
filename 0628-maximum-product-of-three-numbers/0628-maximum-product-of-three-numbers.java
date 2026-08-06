class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length-1;

        int p1 = nums[0]*nums[1]*nums[n];
        int p2 = nums[n-2]*nums[n-1]*nums[n];

        int ans = Math.max(p1,p2);

        return ans;
    }
}