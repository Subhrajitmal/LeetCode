class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum_a=0;
        int sum_b=0;
        for(int a:aliceSizes){
            sum_a += a;
        }
        for(int b:bobSizes){
            sum_b += b;
        }
        int diff = (sum_a - sum_b) / 2;
        HashSet<Integer> set = new HashSet<>();

        for(int a: aliceSizes){
            set.add(a);
        }
        for(int b: bobSizes){
            int a= b+diff;
        if(set.contains(a)){
            return new int[]{a,b};
        }
        }
        return new int[0];
    }
}