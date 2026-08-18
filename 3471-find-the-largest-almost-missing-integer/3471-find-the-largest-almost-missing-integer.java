class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);

        //     for(int j=i;j<i+k;j++){
        //         set.add(nums[j]);
        //     }
        //     for(int num: set){
        //         map.put(num, map.getOrDefault(num,0)+1);
        //     }
        // }
        //     int ans = -1;
        //     for(int r : map.keySet()){
        //         if(map.get(r)==1){
        //             if(r > ans){
        //                 ans = r;
        //             }
        //         }
        //     }
        // return ans;
        }
        if (k == n) {
            int maxval = -1;
            for (int num : nums) {
                maxval = Math.max(maxval, num);
            }
            return maxval;
        }
        if (k == 1) {
            int maxval = -1;
            for (int num : nums) {
                if (map.get(num) == 1) {
                    maxval = Math.max(maxval, num);
                }
            }
            return maxval;
        }
        int ans = -1;
        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (map.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;

    }
}