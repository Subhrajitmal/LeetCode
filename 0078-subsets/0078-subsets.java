class Solution {
    public void backtrack(List<List<Integer>> ans, List<Integer> currList, int[] nums, int index){
      ans.add(new ArrayList<>(currList));  

      for(int i=index; i<nums.length; i++){
        currList.add(nums[i]);

        backtrack(ans, currList, nums, i+1);

        currList.remove(currList.size()-1);
      }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans , new ArrayList<>(), nums , 0);
        return ans;
    }
}