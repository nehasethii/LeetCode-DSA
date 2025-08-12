class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int waterTrapped = 0;
        int left = 0 ; 
        int right = n - 1;
        int maxLeft = 0 , maxRight = 0; 
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] > maxLeft){
                    maxLeft = height[left];
                }
                else{
                    waterTrapped += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right] > maxRight){
                    maxRight = height[right];
                }
                else{
                    waterTrapped += maxRight - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}