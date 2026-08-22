class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n%2 != 0){
            return false;
        }
        for(int i=0; i<=40; i++){
            int ans = (int) Math.pow(2,i);
            if(ans == n)
                return true;
        }
        return false;
    }
}