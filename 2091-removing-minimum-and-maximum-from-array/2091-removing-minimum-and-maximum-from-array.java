class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int minIndx = 0;
        int maxIndx = 0;

        for(int i=1; i<n; i++){
            if(nums[i] < nums[minIndx]){
                minIndx = i;
            }
            if(nums[i] > nums[maxIndx]){
                maxIndx = i;
            }
        }
        int i = Math.min(minIndx, maxIndx);
        int j = Math.max(minIndx, maxIndx);

        int rff = j + 1;
        int rfb = n - i;
        int rfboth= (i + 1) + (n - j);

        return Math.min(rff, Math.min(rfb, rfboth));

        }
}