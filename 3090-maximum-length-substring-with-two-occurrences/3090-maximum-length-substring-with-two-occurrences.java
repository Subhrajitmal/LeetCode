class Solution {
    public int maximumLengthSubstring(String s) {
       int left =0;
       int ans = 0;
       char[] arr = s.toCharArray();
       HashMap<Character,Integer> map = new HashMap<>();
       for(int right =0; right<s.length(); right++){
        map.put(arr[right], map.getOrDefault(arr[right],0)+1);

        while(map.get(arr[right]) > 2){
            map.put(arr[left], map.get(arr[left])-1);
            left++; 
       } 
       ans = Math.max(ans, right-left+1);
    }
    return ans;
    }
}