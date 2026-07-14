// class Solution {
//     public int[] twoSum(int[] nums, int target) { //using this approach time complexity will be o(n2); which is very slow.
//         for(int j=0; j<nums.length-1; j++){
//         for(int i=j+1; i<nums.length; i++){
//             if(nums[i]+nums[j] == target){
//                int[] result= {j,i}; //basiccaly we create a new array where we store the indices;
//                return result; 
//             }
//         }
//         }
//         return null; //if the there is no values that satisfied the target the it return null;
//     }
// }
//Another approach;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int ans = target-nums[i];
            if(map.containsKey(ans)){
            return new int[]{map.get(ans), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

