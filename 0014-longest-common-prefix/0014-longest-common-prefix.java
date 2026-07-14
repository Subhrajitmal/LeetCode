class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        } 
        String initial = strs[0];
        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(initial)){
                initial = initial.substring(0, initial.length()-1);

                if(initial.isEmpty())
                return "";
            }
        }
     return initial;
    }
}