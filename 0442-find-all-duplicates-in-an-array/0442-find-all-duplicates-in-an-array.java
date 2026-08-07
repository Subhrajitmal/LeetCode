class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num:nums){
        if(map.containsKey(num)){
            ans.add(num);
        } else{
            map.put(num,1);
        }
        }
        return ans;
    }
}