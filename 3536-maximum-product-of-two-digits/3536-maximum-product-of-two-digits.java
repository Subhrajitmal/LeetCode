class Solution {
    public int maxProduct(int n) {
        int temp = Math.abs(n);
        int max1 = 0;
        int max2 = 0;

        while(temp > 0){
            int dig = temp%10;
            if(dig > max1){
                max2 = max1;
                max1 = dig;
            } else if(dig > max2){
                max2 = dig;
            }
            temp = temp/10;
        }
        return max1*max2;
    }
}