class Solution {
    public int maxDepth(String s) {
        int maxdepth = 0;
        int currentdepth = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                currentdepth++;
                if( currentdepth > maxdepth){
                    maxdepth = currentdepth;
                }
            } else if(c == ')'){
                currentdepth--;
            }
        }
        return maxdepth;
    }
}