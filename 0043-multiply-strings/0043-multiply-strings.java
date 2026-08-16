class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        int l1 = num1.length(), l2 = num2.length();
        int[] product = new int[l1+l2];

        for(int i = l1-1; i>=0 ; i--){
            for(int j = l2-1; j>=0 ; j--){
                int mul = (num1.charAt(i) -'0')*(num2.charAt(j)-'0');
                product[i+j+1] += mul;
            }
        }

        for(int i = product.length -1; i>0 ; i--){
            product[i-1] += product[i]/10;
            product[i] %= 10;
        }

        StringBuilder result = new StringBuilder();
        for(int digit : product){
            if(result.length() == 0  && digit == 0){
                continue;
            }

            result.append(digit);
        }

        return result.toString();
        
    }
}