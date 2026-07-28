class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = Find_first(nums,target);
        int second = Find_second(nums,target);
        return new int[]{first,second};
    }
    private int Find_first(int[] nums, int target) {
       int left = 0;
       int right = nums.length-1;
       int n=-1;
       while(left <= right){
        int mid = (left+right)/2;
        if(nums[mid] == target){
            n = mid;
            right = mid-1;
        }else if(nums[mid] < target){
            left = mid+1;
        } else{
            right = mid-1;
        }
       }
       return n;
    }
    private int Find_second(int[] nums, int target) {
          int left = 0;
       int right = nums.length-1;
       int n=-1;
       while(left <= right){
        int mid = (left+right)/2;
        if(nums[mid] == target){
            n = mid;
            left = mid+1;
        }else if(nums[mid] < target){
            left = mid+1;
        } else{
            right = mid-1;
        }
       }
       return n;
    }
    }