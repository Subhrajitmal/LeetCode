class Solution {
    public boolean canAliceWin(int n) {
        int r = 10;
        boolean aliceTurn = true;
        while(n >= r){
            n -= r;
            r--;
            aliceTurn = !aliceTurn;
        }
        return !aliceTurn;
    }
}