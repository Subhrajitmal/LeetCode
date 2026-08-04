class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();  //empty array
        }
        int min=nums[0];
        int max=nums[0];
        List<Integer> x = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(min > num){
                min = num;
            } if(max < num){
                max = num;
            }
            set.add(num);
        }
        for(int i=min; i<max; i++){
            if(!set.contains(i)){
                x.add(i);
            }
        } 
            return x;
    }
}