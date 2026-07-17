class Solution {
    public boolean isValid(String s) {

         if(s.length() % 2 != 0){
            return false;
        }

        char[] stack = new char[s.length()];
        int top = -1; 

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stack[++top] = c;
            }
            else{
                if(top == -1){
                    return false;
                }

                char open = stack[top--];

                if(c ==')' && open != '(') return false;
                if(c =='}' && open != '{') return false;
                if(c ==']' && open != '[') return false;

            }
        }

        return top == -1;

    }
}