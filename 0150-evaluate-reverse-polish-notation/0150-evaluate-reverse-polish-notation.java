class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for(String c : tokens){
            if(c.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }else if(c.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }else if(c.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }else if(c.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.pollLast();
        
    }
}