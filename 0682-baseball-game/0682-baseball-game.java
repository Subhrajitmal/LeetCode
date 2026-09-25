class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String st: operations){
            if(st.equals("C")) stack.pop();
            else if(st.equals("D")) stack.push(stack.peek()*2);
            else if(st.equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a+b);
            } else{
                stack.push(Integer.parseInt(st));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}