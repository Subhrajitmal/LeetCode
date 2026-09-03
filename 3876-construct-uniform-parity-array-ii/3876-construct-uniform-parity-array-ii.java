class Solution {
    public boolean uniformArray(int[] nums1) {
        int x = Integer.MAX_VALUE;
        for(int num: nums1){
            if(num % 2 == 1){
                x = Math.min(x,num);
            }
        }
        if(x == Integer.MAX_VALUE){
            return true;
        }
        for(int num: nums1){
        if(num % 2 == 0 && num<=x){
            return false;
        }
        }
        return true;
    }
}