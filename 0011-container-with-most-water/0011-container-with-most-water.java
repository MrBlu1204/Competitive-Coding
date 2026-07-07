class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left =0;
        int right = height.length - 1;
        int currWater, prevHeight;

        while(left < right){
            currWater = (right - left) * Math.min(height[left], height[right]);
            prevHeight = Math.min(height[left], height[right]);

            while(left < right  && height[left] <=prevHeight){
                left++;
            }
            while(left < right  && height[right] <= prevHeight){
                right--;
            }

            if(currWater > maxWater){
                maxWater = currWater;
            }
        }

        return maxWater;
        
    }
}