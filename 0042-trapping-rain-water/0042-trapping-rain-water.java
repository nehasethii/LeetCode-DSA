class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftHt = 0 , rightHt = 0;
        int left = 0 , right = n - 1;
        int waterTrapped = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] > leftHt){
                    leftHt = height[left];
                }
                else{
                    waterTrapped += leftHt - height[left];
                }
                left++;
            }
            else{
                if(height[right] > rightHt){
                    rightHt = height[right];
                }
                else{
                    waterTrapped += rightHt - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}