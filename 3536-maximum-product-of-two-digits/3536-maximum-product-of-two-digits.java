class Solution {
    public int maxProduct(int n) {
       int max1=0;
       int max2=0;
       int num = 0;
       while(n>0){
        num = n%10;
        if(num>=max1){
            max2=max1;
            max1=num;
        }
        else if(num>max2){
            max2=num;
        }
        n /= 10;
       }
       return (max1)*(max2);
        
    }
}