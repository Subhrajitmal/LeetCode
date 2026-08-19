class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashSet<String> set =new HashSet<>();
        HashSet<Integer> row= new HashSet<>();
        for(int[] seat: reservedSeats){
            set.add(seat[0]+","+seat[1]);
            row.add(seat[0]);
        }
        int ans = (n-row.size())*2;
        for(int r: row){
            boolean left = true;
            boolean middle = true;
            boolean right = true;
        for(int i=2; i<=5; i++){
            if(set.contains(r+","+i)){
                left = false;
                break;
            }
        }
            for(int i=4; i<=7; i++){
            if(set.contains(r+","+i)){
                middle = false;
                break;
            }
        }
            for(int i=6; i<=9; i++){
            if(set.contains(r+","+i)){
                right = false;
                break;
            }
        }
        if(left && right){
            ans += 2;
        } else if(left || middle || right){
            ans += 1;
        }
        }
        return ans;
    }
}