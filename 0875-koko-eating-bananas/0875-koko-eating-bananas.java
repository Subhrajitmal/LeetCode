class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = 0;
        for(int pile: piles){
            maxspeed = Math.max(maxspeed,pile);
        }
        while(minspeed < maxspeed){
            int mid = minspeed + (maxspeed-minspeed)/2;
            if(canfinish(piles,h,mid)){
                maxspeed = mid;
            } else{
                minspeed = mid+1;
            }
        }
               return minspeed;

    }
    private boolean canfinish(int[] piles, int h, int k){
        long hours = 0;
        for(int pile:piles){
            hours += pile/k;
            if(pile%k != 0){
                hours++;
            }
        }
        return hours <= h;
    } 
}