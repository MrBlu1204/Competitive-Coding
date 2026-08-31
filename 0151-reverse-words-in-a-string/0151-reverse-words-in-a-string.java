class Solution {
    public String reverseWords(String s) {

        char[] str = s.toCharArray();
        int n = str.length;

        reverse(str, 0, n-1);



        int write = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] != ' ') {
                if (write > 0) str[write++] = ' ';

                int wordStart = write;
                while (i < n && str[i] != ' ') {
                    str[write++] = str[i++];
            }
            reverse(str, wordStart, write - 1);
        }
    }


        return new String(str,0,write);


        
    }


    public void reverse(char[] str, int left, int right){
        while(left<right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

    }
}