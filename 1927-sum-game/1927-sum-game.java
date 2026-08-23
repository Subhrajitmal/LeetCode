class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int q1=0, q2=0, s1=0,s2=0;
        for(int i=0; i<n/2; ++i){
            if(num.charAt(i) == '?'){
                ++q1;
            } else{
                s1 += num.charAt(i)- '0';
            }
        }
            for(int j=n/2; j<n; ++j){
                if(num.charAt(j) == '?'){
                    ++q2;
                } else{
                    s2 += num.charAt(j)- '0';
                }
            }
        if((q1+q2)%2 == 1)
        return true;

        return 2*(s1-s2) != 9*(q2-q1);
    }
}