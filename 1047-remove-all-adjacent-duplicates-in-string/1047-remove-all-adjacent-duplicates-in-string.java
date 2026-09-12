class Solution {
    public String removeDuplicates(String s) {

        StringBuilder result = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();


        for(char c:s.toCharArray()){

            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }

        }

        for(char c: stack){
            result.append(c);
        }

        return result.reverse().toString();
        
    }
}