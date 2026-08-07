class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();
        Arrays.sort(arr);
        int rank =1;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=arr.length-1; i>=0; i--){
            if(rank == 1){
                map.put(arr[i], "Gold Medal");
            } else if(rank == 2){
                map.put(arr[i], "Silver Medal");
            }else if(rank == 3){
                map.put(arr[i], "Bronze Medal");
            }else{
                map.put(arr[i], String.valueOf(rank));
            }
            rank++;
        }
        String[] ans = new String[score.length];
        for(int i=0; i<score.length; i++){
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
}