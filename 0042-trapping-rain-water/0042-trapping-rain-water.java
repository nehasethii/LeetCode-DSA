class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 1){
            return 0;
        }
        int[] leftHt = new int[n];
        int[] rightHt = new int[n];
        int waterTrapped = 0;
        leftHt[0] = rightHt[n-1] = 0;
        for(int i = 1 ; i < n ; i++){
            leftHt[i] = Math.max(height[i-1] , leftHt[i-1]);
            rightHt[n - i - 1] = Math.max(height[n - i] , rightHt[n - i]);
        }
        for(int i = 0 ; i < n ; i++){
            if(height[i] < leftHt[i] && height[i] < rightHt[i]){
                waterTrapped += Math.min(leftHt[i] ,rightHt[i]) - height[i];
            }
        }
        return waterTrapped;
    }
}