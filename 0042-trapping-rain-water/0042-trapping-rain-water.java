class Solution {
    public int trap(int[] height) {
        int water = 0;
        int leftHt = 0;
        int rightHt = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            if(height[i] < height[j]){
                if(height[i] > leftHt){
                    leftHt = height[i];
                }
                else{
                    water += leftHt - height[i];
                }
                i++;
            }
            else{
                if(height[j] > rightHt){
                    rightHt = height[j];
                }
                else{
                    water += rightHt - height[j];
                }
                j--;
            }
        }
        return water;
    }
}