class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String str ="";
        int left = 0;
        int minL=Integer.MAX_VALUE;
        int count = 0;
        for(int r=0; r<s.length(); r++){
            if(s.charAt(r)== '1'){
                count++;
            }
            while(count == k){
                if(s.charAt(left) == '0'){
                    left++;
                    continue;
                }
                int currL = r - left + 1;
                String currS = s.substring(left, r+1);
                if(currL < minL){
                    minL = currL;
                    str = currS;
                } else if(currL == minL){
                    if(currS.compareTo(str) < 0){
                        str= currS;
                    }
                }
                if(s.charAt(left) == '1'){
                    count--;
                }
                left++;
            }
        }
        return str;
    }
}