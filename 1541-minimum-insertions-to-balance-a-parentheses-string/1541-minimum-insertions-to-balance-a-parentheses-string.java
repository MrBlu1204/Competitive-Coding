class Solution {
    public int minInsertions(String s) {
        Deque<Character> stack = new LinkedList<>();

        int result = 0;

        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{
                if(i < s.length()-1 && s.charAt(i+1) == ')'){
                    i++;
                }
                else{
                    result++;
                }

                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    result++;
                }
            }
        }

        return result + (int) stack.size()*2;
    }
}