
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        char[] c2 = t.toCharArray();
        Arrays.sort(c2);
        if(c1.length != c2.length){
            return false;
        }
        for(int j=0; j<c1.length; j++){
            if(c1[j] != c2[j]){
                return false;
            }
        }
       return true;
}
}