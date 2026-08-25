class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 1;
        for(int num: nums){
            map.put(num,1);
        }
        for(int i=1; i<=101; i++){
            ans = k*i;
            if(!map.containsKey(ans)){
                return ans;
            }
        }
        return ans;
    }
}