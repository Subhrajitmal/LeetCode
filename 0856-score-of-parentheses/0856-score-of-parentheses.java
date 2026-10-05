class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                st.push(ans);
                ans = 0;
            }else{
                ans = st.pop()+Math.max(ans*2,1);
            }
        }
        return ans;
    }
}