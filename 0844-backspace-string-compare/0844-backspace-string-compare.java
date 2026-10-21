class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String str){
        StringBuilder stack = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c == '#'){
                if(stack.length() > 0){
                    stack.deleteCharAt(stack.length()-1);
                }
            }else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}