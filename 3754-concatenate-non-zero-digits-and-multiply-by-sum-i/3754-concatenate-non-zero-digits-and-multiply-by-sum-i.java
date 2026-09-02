class Solution {
    public long sumAndMultiply(int n) {
        long temp = Math.abs(n);
        long result = 0;
        long x =1;
        long sum = 0;
        while(temp > 0){
            long dig = temp % 10;
            if(dig != 0){
                result = result+(dig*x);
                sum = sum+dig;
                x=x*10;
            }
            temp = temp/10;
        }
        return result*sum;
    }
}