class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length - 1;
        int result = 0;

    
        while(low <= high){
            int mid = low + (high-low)/2;
        

            if(letters[mid] <= target){
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return letters[result];
        
    }
}