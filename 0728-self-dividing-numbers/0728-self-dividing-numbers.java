class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x=left; x<=right; x++){
            int n = x;
            boolean ok = true;
            while(n>0){
                int d = n%10;
                if(d==0 || x%d != 0){
                 ok = false; 
                 break;
            }
                n /= 10;
            }
            if (ok) 
            ans.add(x);
        }
        return ans;
    }
}