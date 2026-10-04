class Solution {
    public boolean checkValidString(String s) {
        int x=0;
        int y=0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                x++;
                y++;
            } else if(ch == ')'){
                x--;
                y--;
            } else{
                x--;
                y++;
            }
            x = Math.max(0,x);
            if(y<0){
                return false;
            }
        }
            return x==0;
    }
    }