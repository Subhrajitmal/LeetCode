class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int n : nums){
            map.put(n+1, map.getOrDefault(n,0)+1);
            map.put(n, map.getOrDefault(n-1,0)+1);
            ans = Math.max(ans, Math.max(map.get(n),map.get(n+1)));
        }
        return ans;
    }
}