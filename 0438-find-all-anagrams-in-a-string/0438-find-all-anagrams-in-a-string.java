class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(s.length()< p.length()){
            return ans;
        }
        int[] wndw1 = new int[26];  //there is 26 lowercase letter
        int[] wndw2 = new int[26];

        for(int i=0; i<p.length(); i++){
         wndw1[p.charAt(i)-'a']++;
         wndw2[s.charAt(i)- 'a']++;   
        }
        if(isEqual(wndw1, wndw2)){
            ans.add(0);
        }
        for(int i=p.length(); i<s.length(); i++){
            wndw2[s.charAt(i)-'a']++;  //add right character;
            wndw2[s.charAt(i-p.length())-'a']--;  //remove left character;
        if(isEqual(wndw1, wndw2)){
            ans.add(i-p.length()+1);
        }
        }
    return ans;
    }
private boolean isEqual(int[] a, int[] b){
    for(int i=0; i<26; i++){
        if(a[i] != b[i]){
            return false;
        }
    }
    return true;
}
}