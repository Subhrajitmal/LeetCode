class Solution {
    public boolean checkDivisibility(int n) {
       
        int x = n;
        int sum = 0;
        int mul = 1;
        while(x > 0){
            int dig = x%10;
            sum += dig;
            mul *= dig;

            x /= 10;
        }
        if(n % (sum+mul) == 0){
        return true;
        }
        return false;
    }
}