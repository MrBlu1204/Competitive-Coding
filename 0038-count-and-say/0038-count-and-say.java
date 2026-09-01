class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String prev = countAndSay(n-1);
        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i<prev.length()){
            int count = 1;

            while (i + count < prev.length() && prev.charAt(i + count) == prev.charAt(i)) {
                count++;
            }

            result.append(count).append(prev.charAt(i));

            i += count;
        }

        return result.toString();
        
    }
}