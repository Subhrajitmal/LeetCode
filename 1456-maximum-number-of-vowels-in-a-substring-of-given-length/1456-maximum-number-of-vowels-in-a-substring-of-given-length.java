class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
            int maxCount = count;
        for(int i=k; i<s.length(); i++){
            char left = s.charAt(i-k);
            char right = s.charAt(i);

            if(isVowel(left)){
                count--;
            }
            if(isVowel(right)){
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public boolean isVowel(char ch){
        return ch=='a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u';
    }
}